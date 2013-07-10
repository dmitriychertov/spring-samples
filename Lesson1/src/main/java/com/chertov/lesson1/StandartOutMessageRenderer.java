package com.chertov.lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("messageRenderer")
public class StandartOutMessageRenderer implements MessageRenderer {
	
	private MessageProvider messageProvider = null;
	
	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException("You must set the property messageProvider of class " + StandartOutMessageRenderer.class.getName());
		}
		
		System.out.println(messageProvider.getMessage());
	}
	
	
	@Autowired
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}

	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}

}
