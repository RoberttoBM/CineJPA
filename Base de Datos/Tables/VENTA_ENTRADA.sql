CREATE TABLE rb_cine_jpa.venta_entrada (
  ident NUMBER(6) NOT NULL,
  persona_idper NUMBER(6) NOT NULL,
  cliente_idcli NUMBER(6) NOT NULL,
  sala_idsal NUMBER(6) NOT NULL,
  importe NUMBER(8,2) NOT NULL,
  pelicula_idpel NUMBER(6),
  fecvent DATE,
  cantidad NUMBER,
  CONSTRAINT venta_entrada_pk PRIMARY KEY (ident),
  CONSTRAINT venta_entrada_cliente FOREIGN KEY (cliente_idcli) REFERENCES rb_cine_jpa.cliente (idcli),
  CONSTRAINT venta_entrada_pelicula FOREIGN KEY (pelicula_idpel) REFERENCES rb_cine_jpa.pelicula (idpel),
  CONSTRAINT venta_entrada_persona FOREIGN KEY (persona_idper) REFERENCES rb_cine_jpa.persona (idper),
  CONSTRAINT venta_entrada_sala FOREIGN KEY (sala_idsal) REFERENCES rb_cine_jpa.sala (idsal)
);