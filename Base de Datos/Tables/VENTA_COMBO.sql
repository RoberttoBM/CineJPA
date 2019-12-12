CREATE TABLE rb_cine_jpa.venta_combo (
  idcom NUMBER(6) NOT NULL,
  tipcom VARCHAR2(50 BYTE) NOT NULL,
  cancom NUMBER(2) NOT NULL,
  persona_idper NUMBER(6) NOT NULL,
  cliente_idcli NUMBER(6) NOT NULL,
  importe NUMBER(8,2) NOT NULL,
  fecvent DATE,
  CONSTRAINT venta_combo_pk PRIMARY KEY (idcom),
  CONSTRAINT venta_combo_cliente FOREIGN KEY (cliente_idcli) REFERENCES rb_cine_jpa.cliente (idcli),
  CONSTRAINT venta_combo_persona FOREIGN KEY (persona_idper) REFERENCES rb_cine_jpa.persona (idper)
);