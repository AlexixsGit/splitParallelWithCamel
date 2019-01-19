package com.co.splitter.parallel.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.co.splitter.parallel.model.Config;
import com.co.splitter.parallel.strategy.MainAggregationStrategy;
import com.google.gson.Gson;

/**
 * 
 * @author edward.ortiz
 *
 */
@Component
public class ValidationRoute extends RouteBuilder {

	public static final String ROUTE_ID = "validations-route";

	@Override
	public void configure() throws Exception {
		from("direct:validations-route").routeId(ROUTE_ID).to("freemarker:templates/config.ftl")
				.process(new Processor() {

					@Override
					public void process(Exchange exchange) throws Exception {
						Config config = new Gson().fromJson(exchange.getIn().getBody(String.class), Config.class);
						exchange.getIn().setBody(config);
					}
				}).split(simple("${body.endPoints}"), new MainAggregationStrategy()).parallelProcessing()
				.to("direct:request-route").end();
	}

}
