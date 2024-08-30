package in.ashokit.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Actor_Table")
public class Actor {

	@Id
	@Column(name="ACTOR_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="ACTOR_NAME",length=20)
	@NonNull
	private String aname;
	
	@Column(name="CATEGORY",length=20)
	@NonNull
	private String category;
	
	@Column(name="MOBILE_NUMBER")
	@NonNull
	private Long mobileNo;
	
	
	
}
