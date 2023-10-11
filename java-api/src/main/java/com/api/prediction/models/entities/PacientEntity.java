package com.api.prediction.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_pacients")
public class PacientEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Column(unique = true)
    private String cpf;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateOfBirth;
    private char gender;
    private String diagnosis;
}