package com.ethos.legal.Models;

import com.ethos.legal.Models.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidRepository extends JpaRepository<Bid, Long> {
    public Bid findById(int _id);
}

