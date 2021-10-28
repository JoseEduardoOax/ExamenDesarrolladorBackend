package com.example.rest.wrapper;

import org.springframework.http.HttpStatus;

public class ResponseWrapperCreated<T> extends ResponseWrapper<T> {
	public ResponseWrapperCreated(String mensaje, T data){
		this.Cve_Error = 0;
		this.Cve_Mensaje = mensaje;
		this.data = data;
		this.statusCode = HttpStatus.CREATED.value();
	}
}
