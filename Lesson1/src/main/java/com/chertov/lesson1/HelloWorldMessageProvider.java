package com.chertov.lesson1;

import org.springframework.stereotype.Service;

@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {

	public String getMessage() {
		return "Hello world";
	}

}
