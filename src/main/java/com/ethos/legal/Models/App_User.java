package com.ethos.legal.Models;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class App_User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String email;
    String password;
    boolean isClientPoster = false;
    boolean isJobSeeker = false;
    String name;
    String phoneNumber;
    String linkedInUrl;
    String lawFirm;
    String lawFirmAddress;
    int age;
    int starRating;
    String credentials;
    String description;


    @OneToMany
    List<ActiveJobs> activeJobs = new ArrayList<>();
    @OneToMany
    List<JobPost> jobPost = new ArrayList<>();
    @OneToMany
    List<Bid> bid = new ArrayList<>();

    public App_User(){} // default constructor
    public App_User( String email, String password, String name, String phoneNumber, String linkedInUrl, String lawFirm, String lawFirmAddress, int age, String credentials, String description) {

        this.email = email;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.linkedInUrl = linkedInUrl;
        this.lawFirm = lawFirm;
        this.lawFirmAddress = lawFirmAddress;
        this.age = age;
        this.credentials = credentials;
        this.description = description;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isClientPoster() {
        return isClientPoster;
    }

    public void setClientPoster(boolean clientPoster) {
        isClientPoster = clientPoster;
    }

    public boolean isJobSeeker() {
        return isJobSeeker;
    }

    public void setJobSeeker(boolean jobSeeker) {
        isJobSeeker = jobSeeker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLinkedInUrl() {
        return linkedInUrl;
    }

    public void setLinkedInUrl(String linkedInUrl) {
        this.linkedInUrl = linkedInUrl;
    }

    public String getLawFirm() {
        return lawFirm;
    }

    public void setLawFirm(String lawFirm) {
        this.lawFirm = lawFirm;
    }

    public String getLawFirmAddress() {
        return lawFirmAddress;
    }

    public void setLawFirmAddress(String lawFirmAddress) {
        this.lawFirmAddress = lawFirmAddress;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ActiveJobs> getActiveJobs() {
        return activeJobs;
    }

    public void setActiveJobs(List<ActiveJobs> activeJobs) {
        this.activeJobs = activeJobs;
    }

    public List<JobPost> getJobPost() {
        return jobPost;
    }

    public void setJobPost(List<JobPost> jobPost) {
        this.jobPost = jobPost;
    }

    public String getEmail() {
        return email;
    }

    public List<Bid> getBid() {
        return bid;
    }

    public void setBid(List<Bid> bid) {
        this.bid = bid;
    }
}
