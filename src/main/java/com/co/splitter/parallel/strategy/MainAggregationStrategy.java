package com.co.splitter.parallel.strategy;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

import com.co.splitter.parallel.model.Row;

/**
 * 
 * @author edward.ortiz
 *
 */
public class MainAggregationStrategy implements AggregationStrategy {

	public static final String RESPONSE1 = "response1";
	public static final String RESPONSE2 = "response2";
	public static final String RESPONSE3 = "response3";

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

		if (oldExchange == null) {
			oldExchange = newExchange;
		}

		if (oldExchange.getProperty(RESPONSE1) == null) {
			oldExchange.getProperties().put(RESPONSE1, newExchange.getIn().getBody(Row.class).getUrl());
		} else if (oldExchange.getProperty(RESPONSE2) == null) {
			oldExchange.getProperties().put(RESPONSE2, newExchange.getIn().getBody(Row.class).getUrl());
		} else if (oldExchange.getProperty(RESPONSE3) == null) {
			oldExchange.getProperties().put(RESPONSE3, newExchange.getIn().getBody(Row.class).getUrl());
		}

		if (oldExchange.getProperty(RESPONSE1) != null && oldExchange.getProperty(RESPONSE2) != null) {
			oldExchange.getProperties().put("ok", true);
		}

		return oldExchange;
	}

}
