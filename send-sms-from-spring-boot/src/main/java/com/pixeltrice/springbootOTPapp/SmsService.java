package com.pixeltrice.springbootOTPapp;

import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


@Component
	public class SmsService {

	    
	    private final String ACCOUNT_SID ="AC4356753ae73da70f84113859073938ac";

	    private final String AUTH_TOKEN = "6077d05bd51fe9347039f5a0a918e38e";

	    private final String FROM_NUMBER = "+13477123939";

	    public void send(SmsPojo sms) {
	    	Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

	        Message message = Message.creator(new PhoneNumber(sms.getTo()), new PhoneNumber(FROM_NUMBER), sms.getMessage())
	                .create();
	        System.out.println("here is my id:"+message.getSid());// Unique resource ID created to manage this transaction

	    }

	    public void receive(MultiValueMap<String, String> smscallback) {
	    }
	
}
