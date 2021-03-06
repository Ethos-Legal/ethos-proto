package com.ethos.legal.Models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;


    @Entity
    public class Notes {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long id;
        String name;
        String note;
        Timestamp timeStamp;
        String jobId;

        public Notes() {}

        public Notes(String name, String note, Timestamp timeStamp, String jobId) {
            this.name = name;
            this.note = note;
            this.timeStamp = timeStamp;
            this.jobId = jobId;
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

        public Timestamp getTimeStamp() {
            return timeStamp;
        }

        public void setTimeStamp(Timestamp timeStamp) {
            this.timeStamp = timeStamp;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getJobId() {
            return jobId;
        }

        public void setJobId(String jobId) {
            this.jobId = jobId;
        }


    }



