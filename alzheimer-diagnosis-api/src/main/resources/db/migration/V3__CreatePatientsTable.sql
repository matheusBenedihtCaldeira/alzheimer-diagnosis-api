CREATE TABLE tb_patients(
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    cpf VARCHAR(255) UNIQUE NOT NULL,
    gender CHAR(1) NOT NULL,
    date_of_birth DATE NOT NULL,
    diagnosis VARCHAR(255)
    created_at TIMESTAMP
    updated_at TIMESTAMP
);