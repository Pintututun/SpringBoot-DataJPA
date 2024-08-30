package in.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.TableGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	@Column(name="EID")
	@SequenceGenerator(name="gen1",sequenceName ="EMP_SEQ",initialValue=1,allocationSize =1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen1")
	private Integer eid;
	@Column(name="ENAME",length=20)
	@NonNull
	private String ename;
	@Column(name="JOB",length=20)
	@NonNull
	private String job;
	@NonNull
	private Double salary;
}
