package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "OTM_MEDAL")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Medal {

	@Id
	private String mid;
	private String name;
	private String event;
	private String place;
	
	@Override
	public String toString() {
		return "Medal [mid=" + mid + ", name=" + name + ", event=" + event + ", place=" + place + "]";
	}
	
	
}
