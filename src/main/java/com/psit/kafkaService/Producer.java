package com.psit.kafkaService;


import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestBody;

import com.google.gson.Gson;
import com.psit.dto.EmployeeDto;


@Service
public class Producer {
	@Value("${topic.name}")
	public String topic;
	
	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;
	
	@Autowired
	private Gson gson;
	
	public ListenableFuture<SendResult<String, String>> publishDataToTopic(EmployeeDto empDto){
		System.out.println("publishing toi topic::"+topic);
//toJson convert java object to string json -->  "{..,...,...,}" here serialising using Stringserializer
//mentioned in property file		
	 ListenableFuture<SendResult<String, String>> result= kafkaTemplate.send(topic,gson.toJson(empDto));
		
		return result;
		
		//
		
	}

}
