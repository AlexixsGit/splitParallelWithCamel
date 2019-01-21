package com.co.splitter.parallel.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ChannelRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-16T11:10:22.610-05:00")

public class ChannelRequest {
	@JsonProperty("header")
	private Header header = null;

	@JsonProperty("consumerId")
	private String consumerId = null;

	@JsonProperty("channelId")
	private String channelId = null;

	@JsonProperty("path")
	private String path = null;

	public ChannelRequest header(Header header) {
		this.header = header;
		return this;
	}

	/**
	 * Get header
	 * 
	 * @return header
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public String getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
