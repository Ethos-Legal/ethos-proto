package com.ethos.legal.Models;

import com.ethos.legal.Models.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerRepository extends JpaRepository<JobSeeker, Long> {
    public JobSeeker findById(int _id);
}
