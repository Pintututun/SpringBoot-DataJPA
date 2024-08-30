package in.ashokit.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Customer_Tab")
@Getter
@Setter
@EqualsAndHashCode
@RequiredArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cid;
	
	@NonNull
	@Column(length=20)
	private String cname;
	
	@NonNull
	@Column(length=20)
	private String caddrs;
	
	@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL,mappedBy = "customer")
	// @JoinColumn(name="CUSTOMER_ID",referencedColumnName = "CID")
	private Set<PhoneNumber> phones;

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", caddrs=" + caddrs +"]";
	}
	
	

}
