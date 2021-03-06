/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.co.splitter.parallel.api;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.co.splitter.parallel.model.ErrorResponse;
import com.co.splitter.parallel.model.Request;
import com.co.splitter.parallel.model.SuccessResponse;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-16T11:10:22.610-05:00")
public interface Api {

	@ApiOperation(value = "Valida el estado del canal", nickname = "validateChannel", notes = "Valida el canal, verificando en los diferentes microservicios del canal, de acuerdo al número de identificación ", response = SuccessResponse.class, tags = {
			"validate-channel", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Operación Exitosa", response = SuccessResponse.class),
			@ApiResponse(code = 405, message = "Encapsula el error de culaquier inconveniente ocurrido en la ejecución del orquestador", response = ErrorResponse.class) })
	@RequestMapping(value = "/parallel", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<?> validateChannel(
			@ApiParam(value = "Json que contiene la información necesaria, para realizar las validaciones necesarias", required = true) @Valid @RequestBody Request request);

}
