package org.example.jpa.mapper;

import org.example.jpa.dao.entity.StudentEntity;
import org.example.jpa.model.dto.StudenDto;

public class Studentmapper {
    public static StudentEntity toStudentEntity(StudenDto studenDto) {
        var studentEntity = new StudentEntity();
        studentEntity.setFirstName(studenDto.getFirstName());
        studentEntity.setLastname(studenDto.getLastName());
        studentEntity.setAge(studenDto.getAge());
        studentEntity.setStatus(studenDto.getStatus());

        var address=Addressmapper.toEntity(studenDto.getAddress());
        studentEntity.setAddress(address);
        return studentEntity;
    }

    public static StudenDto toStudentDto(StudentEntity studentEntity) {
        var studenDto = new StudenDto();
        studenDto.setFirstName(studentEntity.getFirstName());
        studenDto.setLastName(studentEntity.getLastname());
        studenDto.setAge(studentEntity.getAge());
        studenDto.setStatus(studentEntity.getStatus());
        studenDto.setAddress(Addressmapper.toDto(studentEntity.getAddress()));
        return studenDto;
    }
}
