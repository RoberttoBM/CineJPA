package com.cine.model.entity;

import com.cine.model.entity.VentaEntrada;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-11T17:49:46")
@StaticMetamodel(Pelicula.class)
public class Pelicula_ { 

    public static volatile SingularAttribute<Pelicula, String> apple;
    public static volatile CollectionAttribute<Pelicula, VentaEntrada> ventaEntradaCollection;
    public static volatile SingularAttribute<Pelicula, Long> idpel;
    public static volatile SingularAttribute<Pelicula, String> catpel;
    public static volatile SingularAttribute<Pelicula, Date> fecest;
    public static volatile SingularAttribute<Pelicula, String> nompel;

}