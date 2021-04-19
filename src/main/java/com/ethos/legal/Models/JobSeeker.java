package com.ethos.legal.Models;

import sun.security.util.Password;

import javax.persistence.*;
import java.text.SimpleDateFormat;




    @Entity
    public class JobSeeker {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long id;

        public JobSeeker() {
            super();
        }

        String name;
        int age;
        int starRating;
        String credentials;
        String phoneNumber;
        String linkedin;
        String description;

        @ManyToOne
        App_User app_user;


        @OneToMany
        ActiveJobs activeJobs;
        Bid bid;


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

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getStarRating() {
            return starRating;
        }

        public void setStarRating(int starRating) {
            this.starRating = starRating;
        }

        public String getCredentials() {
            return credentials;
        }

        public void setCredentials(String credentials) {
            this.credentials = credentials;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getLinkedin() {
            return linkedin;
        }

        public void setLinkedin(String linkedin) {
            this.linkedin = linkedin;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
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

        public Bid getBid() {
            return bid;
        }

        public void setBid(Bid bid) {
            this.bid = bid;
        }
    }
