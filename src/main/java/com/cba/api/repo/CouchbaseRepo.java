package com.cba.api.repo;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;
import com.cba.api.model.CouchbaseModel;


@Repository
public interface CouchbaseRepo extends CouchbaseRepository<CouchbaseModel, Integer> {

	
}
