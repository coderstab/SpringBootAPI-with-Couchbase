package com.cba.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
@Data

public class CouchbaseModel {
	
	@Id
	@GeneratedValue(strategy = GenerationStrategy.UNIQUE)
	private String id;
	private String fname;
	private String lname;

}
