CREATE TABLE tb_users(
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    role VARCHAR(5) NOT NULL,
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);