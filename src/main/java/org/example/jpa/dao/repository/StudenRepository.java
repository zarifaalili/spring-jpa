package org.example.jpa.dao.repository;

import org.example.jpa.dao.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface StudenRepository extends CrudRepository<StudentEntity,Long > {

List<StudentEntity> findAll();
}
