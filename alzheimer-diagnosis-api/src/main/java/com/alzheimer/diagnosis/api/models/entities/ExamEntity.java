package com.alzheimer.diagnosis.api.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "tb_exams")
@AllArgsConstructor
@NoArgsConstructor
public class ExamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "patient_id")
    private PatientEntity patientEntity;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private DoctorEntity doctorEntity;
    @Column(nullable = false)
    private Double age = (double) patientEntity.getAge();
    @Column(nullable = false)
    private Double yearsOfEducation;
    @Column(nullable = false)
    private Double miniMentalStateExamination;
    @Column(nullable = false)
    private Double clinicalDementiaRating;
    @Column(nullable = false)
    private Double normalizeWholeBrainVolume;
    @Column(nullable = false)
    private Double atlasScalingFactor;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}