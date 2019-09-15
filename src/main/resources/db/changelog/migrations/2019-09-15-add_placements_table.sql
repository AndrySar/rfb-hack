-- auto-generated definition

--changeset msa:add_placements_table
CREATE TABLE IF NOT EXISTS placements
(
  id                BIGSERIAL PRIMARY KEY,
  lat               CHARACTER VARYING(100) NOT NULL,
  lon               CHARACTER VARYING(100) NOT NULL,
  open_date          CHARACTER VARYING(100) NOT NULL,
  open_time          CHARACTER VARYING(100) NOT NULL,
  close_time         CHARACTER VARYING(100) NOT NULL,
  square            CHARACTER VARYING(100) NOT NULL,
  visibility        CHARACTER VARYING(100) NOT NULL,
  entry_convenience CHARACTER VARYING(100) NOT NULL,
  data              TEXT
);