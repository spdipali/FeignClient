package com.example.FirebaseDemo.controller;

import com.example.FirebaseDemo.dto.ProfessorDTO;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProfessorService {
    ProfessorDTO getProf(String professorId);

}
