package com.co.splitter.parallel.route;

import java.util.Objects;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.co.splitter.parallel.model.ChannelRequest;
import com.co.splitter.parallel.model.JsonApiBodyRequest;
import com.co.splitter.parallel.model.Row;
import com.google.gson.Gson;

/**
 * 
 * @author edward.ortiz
 *
 */
@Component
public class RequestRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("direct:request-route").routeId("request-route").setHeader(Exchange.HTTP_METHOD, constant("post"))
				.setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
				.setHeader("url", simple("${body.url}", String.class)).process(exchange -> {
					String jsonRequest = exchange.getIn().getBody(Row.class).getRequest();
					JsonApiBodyRequest jsonApi = new Gson().fromJson(jsonRequest, JsonApiBodyRequest.class);

					ChannelRequest request = jsonApi.getData().get(0);

					if (!Objects.isNull(request)) {
						exchange.setProperty("channelIdHeader", request.getHeader().getId());
						exchange.setProperty("channelTypeHeader", request.getHeader().getType());
						exchange.setProperty("channelId", request.getChannelId());
						exchange.setProperty("consumerId", request.getConsumerId());
						exchange.setProperty("path", request.getPath());
					}

				}).to("freemarker:templates/ChannelRequest.ftl").toD("${header.url}").convertBodyTo(String.class)
				.log("Processed route: ${body}").end();
	}

}
