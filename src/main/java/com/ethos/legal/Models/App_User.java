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
    String username;
    String password;
    boolean isClientPoster;
    boolean isJobSeeker;
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


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
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
}
