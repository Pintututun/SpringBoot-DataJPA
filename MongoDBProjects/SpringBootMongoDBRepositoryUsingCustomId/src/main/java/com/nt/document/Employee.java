package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Document(collection = "Employee_Information")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	private Integer id;
	@NonNull
	private String name;
	@NonNull
	private String addrs;
	@NonNull
	private Long mobile;
	@NonNull
	private Double salary;

}
