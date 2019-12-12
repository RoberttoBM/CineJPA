CREATE TABLE rb_cine_jpa.sala (
  idsal NUMBER(6) NOT NULL,
  numsal NUMBER(1) NOT NULL,
  capsal NUMBER(3) NOT NULL,
  estsal CHAR NOT NULL,
  CONSTRAINT sala_pk PRIMARY KEY (idsal)
);