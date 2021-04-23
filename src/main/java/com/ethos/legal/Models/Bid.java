package com.ethos.legal.Models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    String pricePerHour;
    Timestamp datePosted;
    String jobSeeker;
    String jobId;

    public long getId() {
        return id;
    }

    public Bid() {}
    @ManyToOne
    JobPost jobPost;

    public Bid(String pricePerHour, String jobSeeker, Timestamp datePosted, String jobId) {
        this.pricePerHour = pricePerHour;
        this.jobSeeker = jobSeeker;
        this.datePosted = datePosted;
        this.jobId = jobId;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(String pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Timestamp getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(Timestamp datePosted) {
        this.datePosted = datePosted;
    }

    public JobPost getJobPost() {
        return jobPost;
    }

    public void setJobPost(JobPost jobPost) {
        this.jobPost = jobPost;
    }

    public String getJobSeeker() {
        return jobSeeker;
    }

    public void setJobSeeker(String jobSeeker) {
        this.jobSeeker = jobSeeker;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
}