package com.cine.model.entity;

import com.cine.model.entity.Cliente;
import com.cine.model.entity.Pelicula;
import com.cine.model.entity.Persona;
import com.cine.model.entity.Sala;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-11T17:49:46")
@StaticMetamodel(VentaEntrada.class)
public class VentaEntrada_ { 

    public static volatile SingularAttribute<VentaEntrada, Cliente> clienteIdcli;
    public static volatile SingularAttribute<VentaEntrada, Long> ident;
    public static volatile SingularAttribute<VentaEntrada, Persona> personaIdper;
    public static volatile SingularAttribute<VentaEntrada, Sala> salaIdsal;
    public static volatile SingularAttribute<VentaEntrada, Pelicula> peliculaIdpel;
    public static volatile SingularAttribute<VentaEntrada, BigDecimal> importe;

}