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
@Table(name = "CLIENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByIdcli", query = "SELECT c FROM Cliente c WHERE c.idcli = :idcli")
    , @NamedQuery(name = "Cliente.findByNomcli", query = "SELECT c FROM Cliente c WHERE c.nomcli = :nomcli")
    , @NamedQuery(name = "Cliente.findByApecli", query = "SELECT c FROM Cliente c WHERE c.apecli = :apecli")
    , @NamedQuery(name = "Cliente.findByDniper", query = "SELECT c FROM Cliente c WHERE c.dniper = :dniper")
    , @NamedQuery(name = "Cliente.findByEdacli", query = "SELECT c FROM Cliente c WHERE c.edacli = :edacli")
    , @NamedQuery(name = "Cliente.findByDircli", query = "SELECT c FROM Cliente c WHERE c.dircli = :dircli")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @SequenceGenerator(name = "MySeqPer", sequenceName = "SeqPer", initialValue = 5, allocationSize = 100) //generador de sequencias
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCLI")
    private Long idcli;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMCLI")
    private String nomcli;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "APECLI")
    private String apecli;

    @Basic(optional = false)
    @NotNull
    @Column(name = "DNIPER")
    private int dniper;

    @Basic(optional = false)
    @NotNull
    @Column(name = "EDACLI")
    private short edacli;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 350)
    @Column(name = "DIRCLI")
    private String dircli;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteIdcli")
    private List<VentaCombo> ventaComboList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteIdcli")
    private List<VentaEntrada> ventaEntradaList;

    public Cliente() {
    }

    public Cliente(Long idcli) {
        this.idcli = idcli;
    }

    public Cliente(Long idcli, String nomcli, String apecli, int dniper, short edacli, String dircli) {
        this.idcli = idcli;
        this.nomcli = nomcli;
        this.apecli = apecli;
        this.dniper = dniper;
        this.edacli = edacli;
        this.dircli = dircli;
    }

    public Long getIdcli() {
        return idcli;
    }

    public void setIdcli(Long idcli) {
        this.idcli = idcli;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public String getApecli() {
        return apecli;
    }

    public void setApecli(String apecli) {
        this.apecli = apecli;
    }

    public int getDniper() {
        return dniper;
    }

    public void setDniper(int dniper) {
        this.dniper = dniper;
    }

    public short getEdacli() {
        return edacli;
    }

    public void setEdacli(short edacli) {
        this.edacli = edacli;
    }

    public String getDircli() {
        return dircli;
    }

    public void setDircli(String dircli) {
        this.dircli = dircli;
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
        hash += (idcli != null ? idcli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idcli == null && other.idcli != null) || (this.idcli != null && !this.idcli.equals(other.idcli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.entity.Cliente[ idcli=" + idcli + " ]";
    }

}
