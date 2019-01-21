package com.co.splitter.parallel.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Header
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-16T11:10:22.610-05:00")

public class Header {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("type")
	private String type = null;

	public Header id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Identificador único de la petición
	 * 
	 * @return id
	 **/
	@ApiModelProperty(required = true, value = "Identificador único de la petición")
	@NotNull

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Header type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * 
	 * @return type
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Header header = (Header) o;
		return Objects.equals(this.id, header.id) && Objects.equals(this.type, header.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, type);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Header {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
