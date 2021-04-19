package com.ethos.legal.Models;

import javax.persistence.*;
import java.text.SimpleDateFormat;


    @Entity
    public class Notes {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long id;

        public Notes() {
            super();
        }
        String note;
        SimpleDateFormat timeStamp = new SimpleDateFormat();

        @ManyToOne
        ActiveJobs activeJobs;


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

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public SimpleDateFormat getTimeStamp() {
            return timeStamp;
        }

        public void setTimeStamp(SimpleDateFormat timeStamp) {
            this.timeStamp = timeStamp;
        }

        public ActiveJobs getActiveJobs() {
            return activeJobs;
        }

        public void setActiveJobs(ActiveJobs activeJobs) {
            this.activeJobs = activeJobs;
        }




    }



