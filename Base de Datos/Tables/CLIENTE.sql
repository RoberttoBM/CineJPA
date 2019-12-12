CREATE TABLE rb_cine_jpa.cliente (
  idcli NUMBER(6) NOT NULL,
  nomcli VARCHAR2(50 BYTE) NOT NULL,
  apecli VARCHAR2(50 BYTE) NOT NULL,
  dniper NUMBER(8) NOT NULL,
  edacli NUMBER(2) NOT NULL,
  dircli VARCHAR2(350 BYTE) NOT NULL,
  CONSTRAINT cliente_pk PRIMARY KEY (idcli)
);