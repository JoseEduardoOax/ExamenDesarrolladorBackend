package com.example.rest.wrapper;

import org.springframework.http.HttpStatus;

public class ResponseWrapperError<T> extends ResponseWrapper<T>{
	public ResponseWrapperError(String mensaje) {
		this.Cve_Error = -1;
		this.Cve_Mensaje = mensaje;
		this.data = null;
		this.statusCode = HttpStatus.BAD_REQUEST.value();
	}
}