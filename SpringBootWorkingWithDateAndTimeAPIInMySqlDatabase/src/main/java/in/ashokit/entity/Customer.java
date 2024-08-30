package in.ashokit.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;
	
	@NonNull
	@Column(length=20)
	private String custname;
	@NonNull
	@Column(length = 20)
	private String custaddrs;
	@NonNull
	private LocalDateTime dob;
	@NonNull
	private LocalTime top;
	@NonNull
	private LocalDate dop;
	
}
