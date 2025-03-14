package org.example.jpa.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.example.jpa.dao.entity.StudentEntity;
import org.example.jpa.dao.repository.AddressRepository;
import org.example.jpa.dao.repository.StudenRepository;
import org.example.jpa.exception.NotFoundException;
import org.example.jpa.mapper.Studentmapper;
import org.example.jpa.model.dto.StudenDto;
import org.example.jpa.model.enums.ErrorMessage;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudenRepository studenRepository;
  private  final AddressService addressService;
    public void createStudent(StudenDto studenDto) {
        StudentEntity studentEntity= Studentmapper.toStudentEntity(studenDto);
        addressService.createAddress(studenDto.getAddress());
        studenRepository.save(studentEntity);
    }
    public  StudenDto getStudentById(Long id){

        var studentEntity=studenRepository.findById(id).orElseThrow(()->
                new NotFoundException(String.format(ErrorMessage.STUDENT_NOT_FOUND.getMessage(),id)));

        StudenDto studenDto=Studentmapper.toStudentDto(studentEntity);
        return studenDto;
    }
    public List<StudenDto> getAllStudents(){
         return  studenRepository.findAll().stream().map(Studentmapper::toStudentDto).toList();

    }

    public void deleteStudentById(Long id){
        studenRepository.deleteById(id);
    }


}
