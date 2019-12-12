/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC13
 */
@Entity
@Table(name = "SALA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sala.findAll", query = "SELECT s FROM Sala s")
    , @NamedQuery(name = "Sala.findByIdsal", query = "SELECT s FROM Sala s WHERE s.idsal = :idsal")
    , @NamedQuery(name = "Sala.findByNumsal", query = "SELECT s FROM Sala s WHERE s.numsal = :numsal")
    , @NamedQuery(name = "Sala.findByCapsal", query = "SELECT s FROM Sala s WHERE s.capsal = :capsal")
    , @NamedQuery(name = "Sala.findByEstsal", query = "SELECT s FROM Sala s WHERE s.estsal = :estsal")})
public class Sala implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull    
    @SequenceGenerator(name = "MySeqPer", sequenceName = "SeqPer", initialValue = 5, allocationSize = 100) //generador de sequencias
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "IDSAL")
    private Long idsal;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMSAL")
    private short numsal;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "CAPSAL")
    private short capsal;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTSAL")
    private Character estsal;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "salaIdsal")
    private List<VentaEntrada> ventaEntradaList;

    public Sala() {
    }

    public Sala(Long idsal) {
        this.idsal = idsal;
    }

    public Sala(Long idsal, short numsal, short capsal, Character estsal) {
        this.idsal = idsal;
        this.numsal = numsal;
        this.capsal = capsal;
        this.estsal = estsal;
    }

    public Long getIdsal() {
        return idsal;
    }

    public void setIdsal(Long idsal) {
        this.idsal = idsal;
    }

    public short getNumsal() {
        return numsal;
    }

    public void setNumsal(short numsal) {
        this.numsal = numsal;
    }

    public short getCapsal() {
        return capsal;
    }

    public void setCapsal(short capsal) {
        this.capsal = capsal;
    }

    public Character getEstsal() {
        return estsal;
    }

    public void setEstsal(Character estsal) {
        this.estsal = estsal;
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
        hash += (idsal != null ? idsal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sala)) {
            return false;
        }
        Sala other = (Sala) object;
        if ((this.idsal == null && other.idsal != null) || (this.idsal != null && !this.idsal.equals(other.idsal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.entity.Sala[ idsal=" + idsal + " ]";
    }
    
}
