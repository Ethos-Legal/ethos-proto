package com.ethos.legal.Models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPostRepository extends JpaRepository<JobPost,Long> {
    public JobPost findById(int _id);
}
