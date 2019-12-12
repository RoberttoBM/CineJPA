package com.cine.model.entity;

import com.cine.model.entity.VentaCombo;
import com.cine.model.entity.VentaEntrada;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-11T17:49:46")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> nomcli;
    public static volatile CollectionAttribute<Cliente, VentaCombo> ventaComboCollection;
    public static volatile SingularAttribute<Cliente, String> dircli;
    public static volatile SingularAttribute<Cliente, Long> idcli;
    public static volatile SingularAttribute<Cliente, String> apecli;
    public static volatile SingularAttribute<Cliente, Short> edacli;
    public static volatile CollectionAttribute<Cliente, VentaEntrada> ventaEntradaCollection;
    public static volatile SingularAttribute<Cliente, Integer> dniper;

}