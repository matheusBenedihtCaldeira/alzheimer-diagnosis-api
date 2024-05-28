CREATE TABLE tb_exams(
    id SERIAL PRIMARY KEY,
    patient_id DOUBLE NOT NULL,
    doctor_id DOUBLE NOT NULL,
    age DOUBLE NOT NULL,
    years_of_education DOUBLE NOT NULL,
    mini_mental_stateExamination DOUBLE NOT NULL,
    clinical_dementiaRating DOUBLE NOT NULL,
    normalize_whole_brain_volume DOUBLE NOT NULL,
    atlas_scaling_factor DOUBLE NOT NULL,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    FOREIGN KEY (patient_id) REFERENCES tb_patients(id) ON DELETE CASCADE,
    FOREIGN KEY (doctor_id) REFERENCES tb_doctors(id)
);