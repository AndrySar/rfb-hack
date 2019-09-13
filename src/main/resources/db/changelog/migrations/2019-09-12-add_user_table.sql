--liquibase formatted sql

--changeset msa:add_user_table
CREATE TABLE IF NOT EXISTS "users" (
  id          BIGSERIAL PRIMARY KEY,
  user_name     CHARACTER VARYING(50) NOT NULL,
  password      CHARACTER VARYING(512) NOT NULL,
  first_name    CHARACTER VARYING(50) NOT NULL,
  last_name     CHARACTER VARYING(50) NOT NULL,
  email         CHARACTER VARYING(50) NOT NULL,
  CONSTRAINT union_user_name UNIQUE(user_name)
);
