package com.cine.model.entity;

import com.cine.model.entity.VentaEntrada;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-11T17:49:46")
@StaticMetamodel(Sala.class)
public class Sala_ { 

    public static volatile SingularAttribute<Sala, Short> numsal;
    public static volatile SingularAttribute<Sala, Long> idsal;
    public static volatile SingularAttribute<Sala, Short> capsal;
    public static volatile CollectionAttribute<Sala, VentaEntrada> ventaEntradaCollection;
    public static volatile SingularAttribute<Sala, Character> estsal;

}