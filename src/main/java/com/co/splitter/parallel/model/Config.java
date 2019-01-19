package com.co.splitter.parallel.model;

import java.io.Serializable;
import java.util.List;

public class Config implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4417688325603421229L;

	private List<Row> endPoints;

	public Config(List<Row> endPoints) {
		super();
		this.endPoints = endPoints;
	}

	public Config() {

	}

	public List<Row> getEndPoints() {
		return endPoints;
	}

	public void setEndPoints(List<Row> endPoints) {
		this.endPoints = endPoints;
	}

}
