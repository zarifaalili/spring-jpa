package org.example.jpa.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudenDto {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String status;
}
