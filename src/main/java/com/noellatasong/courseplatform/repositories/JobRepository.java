package com.noellatasong.courseplatform.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.noellatasong.courseplatform.models.Job;

public interface JobRepository extends CrudRepository<Job, Long> {

	public List<Job> findAll();
	
	Optional<Job> findByJobName( String name );
	
	Optional<Job> findById( Long id );
	
}