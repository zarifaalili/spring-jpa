package org.example.jpa.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.jpa.mapper.Addressmapper;

import java.util.Objects;
@Entity
@Table(name = "sstudent")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class StudentEntity {
//    public Addressmapper Addressmapper;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastname;
    private int age;
    private String status;

    @OneToOne(cascade=CascadeType.PERSIST)
    private AddressEntity address;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }



}
