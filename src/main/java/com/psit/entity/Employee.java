package com.psit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	private String id;
	private String employeeName;
	private String address;
	private Long mobilebNumber;
}
