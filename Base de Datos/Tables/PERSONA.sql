CREATE TABLE rb_cine_jpa.persona (
  idper NUMBER(6) NOT NULL,
  nomper VARCHAR2(50 BYTE) NOT NULL,
  apeper VARCHAR2(50 BYTE) NOT NULL,
  dniper NUMBER(8) NOT NULL,
  edaper NUMBER(2) NOT NULL,
  dirper VARCHAR2(350 BYTE) NOT NULL,
  CONSTRAINT persona_pk PRIMARY KEY (idper)
);