package com.cine.model.entity;

import com.cine.model.entity.VentaCombo;
import com.cine.model.entity.VentaEntrada;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-11T17:49:46")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> dirper;
    public static volatile CollectionAttribute<Persona, VentaCombo> ventaComboCollection;
    public static volatile SingularAttribute<Persona, Integer> edaper;
    public static volatile SingularAttribute<Persona, Long> idper;
    public static volatile SingularAttribute<Persona, String> nomper;
    public static volatile SingularAttribute<Persona, String> apeper;
    public static volatile CollectionAttribute<Persona, VentaEntrada> ventaEntradaCollection;
    public static volatile SingularAttribute<Persona, Integer> dniper;

}