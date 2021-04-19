package com.ethos.legal.Models;

import javax.persistence.*;
import java.text.SimpleDateFormat;



    @Entity
    public class ClientPoster {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long id;

        public ClientPoster() {
            super();
        }

        String name;
        String lawFirm;
        int phoneNumber;
        String address;
        String linkedIn;

        @ManyToOne
        App_User app_user;


        @OneToMany
        ActiveJobs activeJobs;
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

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLawFirm() {
            return lawFirm;
        }

        public void setLawFirm(String lawFirm) {
            this.lawFirm = lawFirm;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getLinkedIn() {
            return linkedIn;
        }

        public void setLinkedIn(String linkedIn) {
            this.linkedIn = linkedIn;
        }

        public App_User getApp_user() {
            return app_user;
        }

        public void setApp_user(App_User app_user) {
            this.app_user = app_user;
        }

        public ActiveJobs getActiveJobs() {
            return activeJobs;
        }

        public void setActiveJobs(ActiveJobs activeJobs) {
            this.activeJobs = activeJobs;
        }

        public JobPost getJobPost() {
            return jobPost;
        }

        public void setJobPost(JobPost jobPost) {
            this.jobPost = jobPost;
        }
    }
