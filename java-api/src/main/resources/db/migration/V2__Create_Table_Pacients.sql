CREATE TABLE tb_pacients (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    cpf VARCHAR(14) UNIQUE,
    date_of_birth DATE,
    gender CHAR(1),
    diagnosis VARCHAR(255)
);
