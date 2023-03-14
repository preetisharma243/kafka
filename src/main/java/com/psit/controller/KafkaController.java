package com.psit.controller;



import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psit.dto.EmployeeDto;
import com.psit.kafkaService.Producer;


	@RestController
	@RequestMapping("/kafka")
	public class KafkaController {
		
		@Autowired
		Producer producer;
		
		@PostMapping("/pub")
		public ResponseEntity<String>  publishDataToTopic(@RequestBody EmployeeDto empDto) throws InterruptedException, ExecutionException {
			ListenableFuture<SendResult<String, String>> result = producer.publishDataToTopic(empDto);
			
			return new ResponseEntity<>(result.get().getProducerRecord().value(),HttpStatus.OK) ;
		}
		
		

	}


