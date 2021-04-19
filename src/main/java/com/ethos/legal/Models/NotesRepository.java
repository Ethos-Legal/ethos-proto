package com.ethos.legal.Models;

import com.ethos.legal.Models.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Notes,Long> {
    public Notes findById(int _id);
}