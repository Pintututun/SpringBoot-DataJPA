package com.nt.document;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document(collection = "OTM_SPORT")
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Sport {

	@Id
	@NonNull
	private Integer sid;
	
	@NonNull
	private String spname;
	
	@NonNull
	private String[] kitItems;
	
	private Player player;
	
	@Override
	public String toString() {
		return "Sport [sid=" + sid + ", spname=" + spname +  ", kitItems="
				+ Arrays.toString(kitItems) + "]";
	}
	
	
}
