package com.example.FirebaseDemo.controller;

import com.example.FirebaseDemo.dto.DepartmentDTO;
import com.example.FirebaseDemo.dto.ProfessorDTO;
import com.example.FirebaseDemo.dto.ProfessorDetailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RefreshScope
@RestController
public class ProfessorDetailController{

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    ProfessorClient professorClient;

    @RequestMapping("/get/professor/{professorId}")
    public ProfessorDTO getProf(@PathVariable String professorId) {
        return professorClient.getProf(professorId);
    }

    //    @PostMapping("/add/department")
//    public DepartmentDTO addInfo(@RequestBody DepartmentDTO departmentDTO)
//    {
//        final String uri="http://localhost:5000/addDepartment";
//
//        RestTemplate restTemplate=new RestTemplate();
//        DepartmentDTO departmentDTO1=restTemplate.postForObject(uri,departmentDTO,DepartmentDTO.class);
//
//        System.out.println(departmentDTO1);
//
//        return departmentDTO1;
//    }
//
//    @GetMapping("/getInfo")
//    public ProfessorDetailDTO getInfo(@RequestParam String professorId)
//    {
//        final String uri = "http://localhost:5000/getProfessorDetails?id="+professorId;
//
//        RestTemplate restTemplate = new RestTemplate();
//        ProfessorDTO professorDTO = restTemplate.getForObject(uri, ProfessorDTO.class);
//        System.out.println(professorDTO);
//
//        String departmentId=professorDTO.getPrimaryDeptId();
//        String departId=professorDTO.getSecondaryDeptId();
//
//        final String uri1="http://localhost:5000/getDepartment?id=";
//
//        DepartmentDTO departmentDTO = restTemplate.getForObject(uri1+departmentId,DepartmentDTO.class);
//        DepartmentDTO departmentDTO1=restTemplate.getForObject(uri1+departId,DepartmentDTO.class);
//
//        List<DepartmentDTO> departmentDTOList=new ArrayList<DepartmentDTO>();
//
//        departmentDTOList.add(departmentDTO);
//        departmentDTOList.add(departmentDTO1);
//
//        ProfessorDetailDTO professorDetailDTO=new ProfessorDetailDTO();
//        professorDetailDTO.setDepartmentDTOList(departmentDTOList);
//        professorDetailDTO.setProfessorDTO(professorDTO);
//
//        return professorDetailDTO;
//    }
}