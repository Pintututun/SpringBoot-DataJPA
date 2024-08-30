package in.ashokit.entity;

import java.io.Serializable;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.S

@Entity
@Getter
@Setter
@Table(name="Phonenumber_Tab")
@RequiredArgsConstructor
@NoArgsConstructor
public class PhoneNumber implements Serializable {

	@Id
	@SequenceGenerator(name="gen1",sequenceName = "Regn_SEQ",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE )
	private Integer regno;
	
	@Column(nullable = false,unique = true)
	@NonNull
	private Long phoneNumber;
	
	@Column(length = 20)
	@NonNull
	private String numberType;
	
	@Column(length=20)
	@NonNull
	private String provider;
	
	@ManyToOne(targetEntity=Customer.class,cascade=CascadeType.ALL)
	@JoinColumn(name="CUSTOMER_ID",referencedColumnName = "CID")
	private Customer customer;

	@Override
	public String toString() {
		return "PhoneNumber [regno=" + regno + ", phoneNumber=" + phoneNumber + ", numberType=" + numberType
				+ ", provider=" + provider + "]";
	}
	
	
}
