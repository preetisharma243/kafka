package com.psit.kafkaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.google.gson.Gson;
import com.psit.dto.EmployeeDto;
import com.psit.entity.Employee;
import com.psit.repo.EmployeeRepository;

@Service
public class Consumer {
	//it will listen msg from kafka server from specified topic
	
	@Autowired
	private EmployeeRepository empRepository;
	@Autowired
	private Gson gson;
	@KafkaListener(topics="${topic.name}",groupId="mygroup")
	public void consumeFromTopic(@RequestBody String emp) {
		  Employee employee= gson.fromJson(emp,Employee.class);
		System.out.println("consumed message:::"+emp);
		
		Employee employee2 = empRepository.save(employee);
		
		System.out.println(employee2);
		
		
		
		
	}

}
