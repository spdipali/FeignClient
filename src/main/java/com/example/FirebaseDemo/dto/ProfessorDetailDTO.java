package com.example.FirebaseDemo.dto;

import java.util.List;

public class ProfessorDetailDTO {

    private ProfessorDTO professorDTO;
    private List<DepartmentDTO> departmentDTOList;

    @Override
    public String toString() {
        return "ProfessorDetailDTO{" +
                "professorDTO=" + professorDTO +
                ", departmentDTOList=" + departmentDTOList +
                '}';
    }

    public ProfessorDTO getProfessorDTO() {
        return professorDTO;
    }

    public void setProfessorDTO(ProfessorDTO professorDTO) {
        this.professorDTO = professorDTO;
    }

    public List<DepartmentDTO> getDepartmentDTOList() {
        return departmentDTOList;
    }

    public void setDepartmentDTOList(List<DepartmentDTO> departmentDTOList) {
        this.departmentDTOList = departmentDTOList;
    }
}
