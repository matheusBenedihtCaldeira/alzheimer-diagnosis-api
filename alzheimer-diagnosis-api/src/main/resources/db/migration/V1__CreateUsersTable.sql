CREATE TABLE tb_users(
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    role VARCHAR(5) NOT NULL,
    password VARCHAR(255),
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);