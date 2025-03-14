package org.example.jpa.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.jpa.mapper.Addressmapper;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudenDto {
    public Addressmapper Addressmapper;
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String status;
    private AddressDto address;
}
