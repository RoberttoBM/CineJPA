CREATE TABLE rb_cine_jpa.pelicula (
  idpel NUMBER(6) NOT NULL,
  nompel VARCHAR2(100 BYTE) NOT NULL,
  catpel VARCHAR2(50 BYTE) NOT NULL,
  fecest DATE NOT NULL,
  apple VARCHAR2(20 BYTE) NOT NULL,
  CONSTRAINT pelicula_pk PRIMARY KEY (idpel)
);