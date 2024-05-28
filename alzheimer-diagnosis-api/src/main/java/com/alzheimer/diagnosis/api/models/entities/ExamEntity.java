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
    private PatientEntity patient;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private DoctorEntity doctor;
    @Column(nullable = false)
    private Double age;
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

    @PrePersist
    public void calculateAge() {
        if (patient != null) {
            this.age = (double) patient.getAge();
        } else {
            this.age = 0.0;
        }
    }
}