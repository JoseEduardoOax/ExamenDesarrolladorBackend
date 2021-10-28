package com.example.rest.wrapper;

import org.springframework.http.HttpStatus;

public class ResponseWrapperSuccess<T> extends ResponseWrapper<T>{
	public ResponseWrapperSuccess(String mensaje, T data) {
		this.Cve_Error = 0;
		this.Cve_Mensaje = mensaje;
		this.data = data;
		this.statusCode = HttpStatus.OK.value();
	}
}