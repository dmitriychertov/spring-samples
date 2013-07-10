package com.chertov.lesson1;

import org.springframework.beans.factory.annotation.Autowired;

public class ConfigurableMessageProvider implements MessageProvider {

	private String message;

	@Autowired
	public ConfigurableMessageProvider(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
