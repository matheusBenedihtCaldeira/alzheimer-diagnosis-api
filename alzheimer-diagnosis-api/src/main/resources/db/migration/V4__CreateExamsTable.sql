CREATE TABLE tb_exams(
    id SERIAL PRIMARY KEY,
    patient_id INTEGER NOT NULL,
    doctor_id INTEGER NOT NULL,
    age INTEGER NOT NULL,
    years_of_education INTEGER NOT NULL,
    mini_mental_stateExamination DOUBLE NOT NULL,
    clinical_dementiaRating DOUBLE NOT NULL,
    normalize_whole_brain_volume DOUBLE NOT NULL,
    atlas_scaling_factor DOUBLE NOT NULL,
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);