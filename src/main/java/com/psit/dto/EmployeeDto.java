package com.psit.dto;



public class EmployeeDto {
	private String id;
	private String employeeName;
	private String address;
	private Long mobilebNumber;
	
	
	

	public EmployeeDto(String id, String employeeName, String address, Long mobilebNumber) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.address = address;
		this.mobilebNumber = mobilebNumber;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getMobilebNumber() {
		return mobilebNumber;
	}
	public void setMobilebNumber(Long mobilebNumber) {
		this.mobilebNumber = mobilebNumber;
	}
	
	
	
	

}
