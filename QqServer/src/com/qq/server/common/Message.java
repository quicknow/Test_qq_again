package com.qq.server.common;

public class Message implements java.io.Serializable{
	private String mesType;
	
	public String getMesType(){
		return mesType;
	}
	
	public void setMesType(String mesType){
		this.mesType = mesType;
	}
}
