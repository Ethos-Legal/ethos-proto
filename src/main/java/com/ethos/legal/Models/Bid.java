package com.ethos.legal.Models;

import javax.persistence.*;
import java.text.SimpleDateFormat;

@Entity
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    double pricePerHour;
    SimpleDateFormat datePosted = new SimpleDateFormat();

    public long getId() {
        return id;
    }

    public Bid() {
        super();
    }
    @ManyToOne
    JobPost jobPost;



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

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public SimpleDateFormat getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(SimpleDateFormat datePosted) {
        this.datePosted = datePosted;
    }

    public JobPost getJobPost() {
        return jobPost;
    }

    public void setJobPost(JobPost jobPost) {
        this.jobPost = jobPost;
    }






}