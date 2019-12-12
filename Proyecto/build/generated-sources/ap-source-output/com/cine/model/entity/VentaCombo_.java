package com.cine.model.entity;

import com.cine.model.entity.Cliente;
import com.cine.model.entity.Persona;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-11T17:49:46")
@StaticMetamodel(VentaCombo.class)
public class VentaCombo_ { 

    public static volatile SingularAttribute<VentaCombo, Long> idcom;
    public static volatile SingularAttribute<VentaCombo, Date> FECVENT;
    public static volatile SingularAttribute<VentaCombo, Cliente> clienteIdcli;
    public static volatile SingularAttribute<VentaCombo, String> tipcom;
    public static volatile SingularAttribute<VentaCombo, Persona> personaIdper;
    public static volatile SingularAttribute<VentaCombo, Short> cancom;
    public static volatile SingularAttribute<VentaCombo, BigDecimal> importe;

}