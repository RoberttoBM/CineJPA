/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC13
 */
@Entity
@Table(name = "PELICULA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pelicula.findAll", query = "SELECT p FROM Pelicula p")
    , @NamedQuery(name = "Pelicula.findByIdpel", query = "SELECT p FROM Pelicula p WHERE p.idpel = :idpel")
    , @NamedQuery(name = "Pelicula.findByNompel", query = "SELECT p FROM Pelicula p WHERE p.nompel = :nompel")
    , @NamedQuery(name = "Pelicula.findByCatpel", query = "SELECT p FROM Pelicula p WHERE p.catpel = :catpel")
    , @NamedQuery(name = "Pelicula.findByFecest", query = "SELECT p FROM Pelicula p WHERE p.fecest = :fecest")
    , @NamedQuery(name = "Pelicula.findByApple", query = "SELECT p FROM Pelicula p WHERE p.apple = :apple")})
public class Pelicula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @SequenceGenerator(name = "MySeqPer", sequenceName = "SeqPer", initialValue = 5, allocationSize = 100) //generador de sequencias
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPEL")
    private Long idpel;

    @Basic(optional = false)
    @NotNull
    @Size(max = 100)
    @Column(name = "NOMPEL")
    private String nompel;

    @Basic(optional = false)
    @NotNull
    @Size(max = 50)
    @Column(name = "CATPEL")
    private String catpel;

    @Basic(optional = false)
    @NotNull
    @Column(name = "FECEST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecest;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "APPLE")
    private String apple;

    @OneToMany(mappedBy = "peliculaIdpel")
    private List<VentaEntrada> ventaEntradaList;

    public Pelicula() {
    }

    public Pelicula(Long idpel) {
        this.idpel = idpel;
    }

    public Pelicula(Long idpel, String nompel, String catpel, Date fecest, String apple) {
        this.idpel = idpel;
        this.nompel = nompel;
        this.catpel = catpel;
        this.fecest = fecest;
        this.apple = apple;
    }

    public Long getIdpel() {
        return idpel;
    }

    public void setIdpel(Long idpel) {
        this.idpel = idpel;
    }

    public String getNompel() {
        return nompel;
    }

    public void setNompel(String nompel) {
        this.nompel = nompel;
    }

    public String getCatpel() {
        return catpel;
    }

    public void setCatpel(String catpel) {
        this.catpel = catpel;
    }

    public Date getFecest() {
        return fecest;
    }

    public void setFecest(Date fecest) {
        this.fecest = fecest;
    }

    public String getApple() {
        return apple;
    }

    public void setApple(String apple) {
        this.apple = apple;
    }

    @XmlTransient
    public List<VentaEntrada> getVentaEntradaList() {
        return ventaEntradaList;
    }

    public void setVentaEntradaList(List<VentaEntrada> ventaEntradaList) {
        this.ventaEntradaList = ventaEntradaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpel != null ? idpel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pelicula)) {
            return false;
        }
        Pelicula other = (Pelicula) object;
        if ((this.idpel == null && other.idpel != null) || (this.idpel != null && !this.idpel.equals(other.idpel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.entity.Pelicula[ idpel=" + idpel + " ]";
    }

}
