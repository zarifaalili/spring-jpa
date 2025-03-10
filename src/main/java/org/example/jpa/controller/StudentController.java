package org.example.jpa.controller;

import lombok.RequiredArgsConstructor;
import org.example.jpa.model.dto.StudenDto;
import org.example.jpa.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/sstudent")
@RequiredArgsConstructor
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody StudenDto studentDto) {
        logger.info("Yeni tələbə yaradılır: {}", studentDto);
        studentService.createStudent(studentDto);
        logger.info("Tələbə uğurla yaradıldı.");
    }

    @GetMapping
    public List<StudenDto> getAllStudents() {
        logger.info("tələbələrin siyahısı hazırlanır");
        List<StudenDto> students = studentService.getAllStudents();
        logger.info("{} tələbə tapıldı", students.size());
        return students;
    }

    @GetMapping("/{id}")
    public StudenDto getStudentById(@PathVariable Long id) {
        logger.info("id-si {} olan tələbə axtarılır", id);
        StudenDto student = studentService.getStudentById(id);
        logger.info("Tələbə tapıldı : {}", student);
        return student;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudentById(@PathVariable Long id) {
        logger.info("id-si {} olan tələbə silinir", id);
        studentService.deleteStudentById(id);
        logger.info("Tələbə uğurla silindi");
    }
}
