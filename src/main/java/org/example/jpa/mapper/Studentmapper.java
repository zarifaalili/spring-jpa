package org.example.jpa.mapper;

import org.example.jpa.dao.entity.StudentEntity;
import org.example.jpa.model.dto.StudenDto;

public class Studentmapper {
    public static StudentEntity toStudentEntity(StudenDto studenDto) {
        return new StudentEntity(
                null,
                studenDto.getFirstName(),
                studenDto.getLastName(),
                studenDto.getAge(),
                studenDto.getStatus()
        );
    }

    public static StudenDto toStudentDto(StudentEntity studentEntity) {
        return new StudenDto(
                studentEntity.getId(),
                studentEntity.getFirstName(),
                studentEntity.getLastname(),
                studentEntity.getAge(),
                "ACTIVATE");
    }
}
