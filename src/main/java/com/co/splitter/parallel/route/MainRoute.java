package com.co.splitter.parallel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.co.splitter.parallel.model.ErrorResponse;
import com.co.splitter.parallel.model.SuccessResponse;

/**
 * 
 * @author edward.ortiz
 *
 */
@Component
public class MainRoute extends RouteBuilder {

	public static final String ROUTE_ID = "main-route";

	@Override
	public void configure() throws Exception {

		from("direct:main-route").routeId(ROUTE_ID).to("direct:validations-route").process(exchange -> {

			if (exchange.getProperty("url1") != null) {
				exchange.getIn().setBody(new SuccessResponse(true));
			} else {
				exchange.getIn().setBody(new ErrorResponse("it Couldn't processed"));
			}
		});
	}

}
