package com.ethos.legal.Models;

import com.ethos.legal.Models.ActiveJobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActiveJobsRepository extends JpaRepository<ActiveJobs,Long> {
    public ActiveJobs findById(int _id);
}



