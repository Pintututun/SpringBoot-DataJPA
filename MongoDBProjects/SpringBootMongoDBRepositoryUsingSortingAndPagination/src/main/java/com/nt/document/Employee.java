package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Document(collection = "Employee_Details")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {

	@Id
	private String id;
	@NonNull
	private String name;
	@NonNull
	private String addrs;
	@NonNull
	private Long mobile;
	@NonNull
	private Double salary;
}
