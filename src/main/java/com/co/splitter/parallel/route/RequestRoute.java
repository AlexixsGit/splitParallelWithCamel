package com.co.splitter.parallel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * 
 * @author edward.ortiz
 *
 */
@Component
public class RequestRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("direct:request-route").routeId("request-route").log("Processed route: ${body.url}").end();
	}

}
