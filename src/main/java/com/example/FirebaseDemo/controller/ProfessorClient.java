package com.example.FirebaseDemo.controller;
import com.example.FirebaseDemo.dto.DepartmentDTO;
import com.example.FirebaseDemo.dto.ProfessorDTO;
import com.example.FirebaseDemo.dto.ProfessorDetailDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(url = "http://localhost:5000",name = "Professor-Client")
public interface ProfessorClient {

//    @RequestMapping(value = "/addDepartment",method = RequestMethod.POST)
//    DepartmentDTO addDept(@RequestBody DepartmentDTO departmentDTO);

    @RequestMapping(value = "/getProfessorDetails",method = RequestMethod.GET)
    ProfessorDTO getProf(@RequestParam(value = "professorId") String professorId);

//    @RequestMapping(value = "/getDepartment/{id}",method = RequestMethod.GET)
//    ProfessorDTO getDept(@PathVariable(value = "id") String departmentId);

}
