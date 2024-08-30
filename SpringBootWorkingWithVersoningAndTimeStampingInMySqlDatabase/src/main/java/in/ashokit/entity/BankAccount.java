package in.ashokit.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="Account")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class BankAccount {

	@Id
	@SequenceGenerator(name="gen1",sequenceName ="Account_SEQ",initialValue = 10000000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Long acno;
	@Column(length = 30)
	@NonNull
	private String name;
	@Column(length = 30)
	@NonNull
	private String addrs;
	
	@NonNull
	private Double balance;
	@NonNull
	private Long mobileNo;
	
	@Version
	private Integer updateCount;
	
	@CreationTimestamp
	private LocalDateTime creationTime;
	
	@UpdateTimestamp
	private LocalDateTime lastUpdationTime;
	
}
