package com.ethos.legal.Models;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


@Entity
    public class JobPost {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long id;

        public long getId() {
            return id;
        }

        public JobPost() {

        }

    public JobPost(String jobTitle, SimpleDateFormat dateToComplete, SimpleDateFormat datePosted, String description, String serviceType) {
        this.jobTitle = jobTitle;
        this.dateToComplete = dateToComplete;
        this.datePosted = datePosted;
        this.description = description;
        this.serviceType = serviceType;
    }

    String jobTitle;
        SimpleDateFormat dateToComplete = new SimpleDateFormat();
        SimpleDateFormat datePosted = new SimpleDateFormat();
        String description;
        String serviceType;

        @OneToMany
        List<Bid> bid = new ArrayList<>();



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

        public String getJobTitle() {
            return jobTitle;
        }

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        public SimpleDateFormat getDateToComplete() {
            return dateToComplete;
        }

        public void setDateToComplete(SimpleDateFormat dateToComplete) {
            this.dateToComplete = dateToComplete;
        }

        public SimpleDateFormat getDatePosted() {
            return datePosted;
        }

        public void setDatePosted(SimpleDateFormat datePosted) {
            this.datePosted = datePosted;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getServiceType() {
            return serviceType;
        }

        public void setServiceType(String serviceType) {
            this.serviceType = serviceType;
        }





    }


