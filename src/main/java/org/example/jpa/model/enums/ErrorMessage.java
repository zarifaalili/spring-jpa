package org.example.jpa.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
@Getter
@RequiredArgsConstructor

public enum ErrorMessage {
    STUDENT_NOT_FOUND("Student not found with id %d");
    private  final String message;


}

