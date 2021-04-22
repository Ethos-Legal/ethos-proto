package com.ethos.legal.Models;

import javax.persistence.*;

@Entity
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    String pricePerHour;
    String datePosted;



    public long getId() {
        return id;
    }

    public Bid() {

    }
    @ManyToOne
    JobPost jobPost;

    public Bid(String pricePerHour) {
        this.pricePerHour = pricePerHour;
//        this.datePosted = datePosted;
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

    public String getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(String datePosted) {
        this.datePosted = datePosted;
    }

    public JobPost getJobPost() {
        return jobPost;
    }

    public void setJobPost(JobPost jobPost) {
        this.jobPost = jobPost;
    }






}