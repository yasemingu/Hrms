package com.kodlama.io.hrms.business.abstracts;

import java.util.List;

import com.kodlama.io.hrms.entities.concretes.JobPositions;

public interface JobPositionsService {

	List<JobPositions> getAll();	
}
