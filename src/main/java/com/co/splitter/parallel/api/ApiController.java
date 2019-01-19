package com.co.splitter.parallel.api;

import javax.validation.Valid;

import org.apache.camel.EndpointInject;
import org.apache.camel.FluentProducerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.co.splitter.parallel.model.ErrorResponse;
import com.co.splitter.parallel.model.Request;
import com.co.splitter.parallel.model.SuccessResponse;

import io.swagger.annotations.ApiParam;

/**
 * 
 * @author edward.ortiz
 *
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-16T11:10:22.610-05:00")
@Controller
public class ApiController implements Api {

	private static final Logger log = LoggerFactory.getLogger(ApiController.class);

	private Object response = null;

	@EndpointInject(uri = "direct:main-route")
	private FluentProducerTemplate ptChannelService;

	public ApiController() {
	}

	public ResponseEntity<?> validateChannel(
			@ApiParam(value = "Json que contiene la información necesaria, para realizar las validaciones necesarias", required = true) @Valid @RequestBody Request request) {
		try {
			response = ptChannelService.withBody(request).request();
			if (response instanceof SuccessResponse) {
				return new ResponseEntity<SuccessResponse>((SuccessResponse) response, HttpStatus.OK);
			} else {
				return new ResponseEntity<ErrorResponse>((ErrorResponse) response, HttpStatus.FAILED_DEPENDENCY);
			}
		} catch (Exception e) {
			log.error("Couldn't serialize response for content type application/json", e);
			return new ResponseEntity<ErrorResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
