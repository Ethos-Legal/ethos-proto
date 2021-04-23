package com.ethos.legal.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class JobPost {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long id;
        public boolean isActive = false;
        String jobTitle;
        String dateToComplete;
        String datePosted;
        String description;
        String serviceType;
        String jobSeeker;

        public long getId() {
            return id;
        }

        public JobPost() {}

    public JobPost(String jobTitle, String dateToComplete, String datePosted, String description, String serviceType) {
        this.jobTitle = jobTitle;
        this.dateToComplete = dateToComplete;
        this.datePosted = datePosted;
        this.description = description;
        this.serviceType = serviceType;
    }



        @OneToMany
        List<Bid> bid = new ArrayList<>();

        @OneToMany
        List<Notes> notes = new ArrayList<>();

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

        public String getDateToComplete() {
            return dateToComplete;
        }

        public void setDateToComplete(String dateToComplete) {
            this.dateToComplete = dateToComplete;
        }

        public String getDatePosted() {
            return datePosted;
        }

        public void setDatePosted(String datePosted) {
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

        public boolean isActive() {
            return isActive;
        }

        public void setActive(boolean active) {
            isActive = active;
        }

        public List<Bid> getBid() {
            return bid;
        }

        public void setBid(List<Bid> bid) {
            this.bid = bid;
        }

        public List<Notes> getNotes() {
            return notes;
        }

        public void setNotes(List<Notes> notes) {
            this.notes = notes;
        }
}


