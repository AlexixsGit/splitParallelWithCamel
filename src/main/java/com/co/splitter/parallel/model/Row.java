package com.co.splitter.parallel.model;

import java.io.Serializable;

public class Row implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String url;
	private String request;

	public Row() {
	}

	public Row(String url) {
		super();
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}
}
