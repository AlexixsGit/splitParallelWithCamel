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

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

		if (oldExchange == null) {
			oldExchange = newExchange;
		}

		if (oldExchange.getProperty("url1") == null) {
			oldExchange.getProperties().put("url1", newExchange.getIn().getBody(Row.class).getUrl());
		} else if (oldExchange.getProperty("url2") == null) {
			oldExchange.getProperties().put("url2", newExchange.getIn().getBody(Row.class).getUrl());
		} else if (oldExchange.getProperty("url3") == null) {
			oldExchange.getProperties().put("url3", newExchange.getIn().getBody(Row.class).getUrl());
		}

		return oldExchange;
	}

}
