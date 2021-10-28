package com.example.rest.wrapper;

public abstract class ResponseWrapper <T>{
	protected String Cve_Mensaje;
	protected int Cve_Error;
	protected T data;
	protected int statusCode;
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getCve_Mensaje() {
		return Cve_Mensaje;
	}
	public void setCve_Mensaje(String cve_Mensaje) {
		Cve_Mensaje = cve_Mensaje;
	}
	public int getCve_Error() {
		return Cve_Error;
	}
	public void setCve_Error(int cve_Error) {
		Cve_Error = cve_Error;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
}