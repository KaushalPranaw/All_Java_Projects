package com.yash.exception;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorProps {

	private String status;

	public ErrorProps() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public ErrorProps(String status) {
		super();
		this.status = status;
	}



	public String getStatus() {
		return status;
	}

	@XmlElement
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ErrorProps [status=" + status + "]";
	}
	
}
