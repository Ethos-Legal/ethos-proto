package com.ethos.legal.Models;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
public class ActiveJobs {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public long id;

    public ActiveJobs() {
        super();
    }


    double pricePerHour;
    float accruedHours;
    //    Date dateToComplete = new Date();
    SimpleDateFormat dateToComplete = new SimpleDateFormat();
    SimpleDateFormat datePosted = new SimpleDateFormat();




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

    public long getId() {
        return id;
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

    public float getAccruedHours() {
        return accruedHours;
    }

    public void setAccruedHours(float accruedHours) {
        this.accruedHours = accruedHours;
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





}
