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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC13
 */
@Entity
@Table(name = "PERSONA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")
    , @NamedQuery(name = "Persona.findByIdper", query = "SELECT p FROM Persona p WHERE p.idper = :idper")
    , @NamedQuery(name = "Persona.findByNomper", query = "SELECT p FROM Persona p WHERE p.nomper = :nomper")
    , @NamedQuery(name = "Persona.findByApeper", query = "SELECT p FROM Persona p WHERE p.apeper = :apeper")
    , @NamedQuery(name = "Persona.findByDniper", query = "SELECT p FROM Persona p WHERE p.dniper = :dniper")
    , @NamedQuery(name = "Persona.findByEdaper", query = "SELECT p FROM Persona p WHERE p.edaper = :edaper")
    , @NamedQuery(name = "Persona.findByDirper", query = "SELECT p FROM Persona p WHERE p.dirper = :dirper")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @SequenceGenerator(name = "MySeqPer", sequenceName = "SeqPer", initialValue = 5, allocationSize = 100) //generador de sequencias
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPER")
    private Long idper;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMPER")
    private String nomper;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "APEPER")
    private String apeper;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "DNIPER")
    private int dniper;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "EDAPER")
    private short edaper;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 350)
    @Column(name = "DIRPER")
    private String dirper;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personaIdper")
    private List<VentaCombo> ventaComboList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personaIdper")
    private List<VentaEntrada> ventaEntradaList;

    public Persona() {
    }

    public Persona(Long idper) {
        this.idper = idper;
    }

    public Persona(Long idper, String nomper, String apeper, int dniper, short edaper, String dirper) {
        this.idper = idper;
        this.nomper = nomper;
        this.apeper = apeper;
        this.dniper = dniper;
        this.edaper = edaper;
        this.dirper = dirper;
    }

    public Long getIdper() {
        return idper;
    }

    public void setIdper(Long idper) {
        this.idper = idper;
    }

    public String getNomper() {
        return nomper;
    }

    public void setNomper(String nomper) {
        this.nomper = nomper;
    }

    public String getApeper() {
        return apeper;
    }

    public void setApeper(String apeper) {
        this.apeper = apeper;
    }

    public int getDniper() {
        return dniper;
    }

    public void setDniper(int dniper) {
        this.dniper = dniper;
    }

    public short getEdaper() {
        return edaper;
    }

    public void setEdaper(short edaper) {
        this.edaper = edaper;
    }

    public String getDirper() {
        return dirper;
    }

    public void setDirper(String dirper) {
        this.dirper = dirper;
    }

    @XmlTransient
    public List<VentaCombo> getVentaComboList() {
        return ventaComboList;
    }

    public void setVentaComboList(List<VentaCombo> ventaComboList) {
        this.ventaComboList = ventaComboList;
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
        hash += (idper != null ? idper.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.idper == null && other.idper != null) || (this.idper != null && !this.idper.equals(other.idper))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.entity.Persona[ idper=" + idper + " ]";
    }
    
}
