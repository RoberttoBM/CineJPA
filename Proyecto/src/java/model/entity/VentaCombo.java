/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC13
 */
@Entity
@Table(name = "VENTA_COMBO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VentaCombo.findAll", query = "SELECT v FROM VentaCombo v")
    , @NamedQuery(name = "VentaCombo.findByIdcom", query = "SELECT v FROM VentaCombo v WHERE v.idcom = :idcom")
    , @NamedQuery(name = "VentaCombo.findByTipcom", query = "SELECT v FROM VentaCombo v WHERE v.tipcom = :tipcom")
    , @NamedQuery(name = "VentaCombo.findByCancom", query = "SELECT v FROM VentaCombo v WHERE v.cancom = :cancom")
    , @NamedQuery(name = "VentaCombo.findByImporte", query = "SELECT v FROM VentaCombo v WHERE v.importe = :importe")
    , @NamedQuery(name = "VentaCombo.findByFecvent", query = "SELECT v FROM VentaCombo v WHERE v.fecvent = :fecvent")})
public class VentaCombo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @SequenceGenerator(name = "MySeqPer", sequenceName = "SeqPer", initialValue = 5, allocationSize = 100) //generador de sequencias
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCOM")
    private Long idcom;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TIPCOM")
    private String tipcom;

    @Basic(optional = false)
    @NotNull
    @Column(name = "CANCOM")
    private short cancom;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "IMPORTE")
    private BigDecimal importe;

    @Column(name = "FECVENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecvent;

    @JoinColumn(name = "CLIENTE_IDCLI", referencedColumnName = "IDCLI")
    @ManyToOne(optional = false)
    private Cliente clienteIdcli;

    @JoinColumn(name = "PERSONA_IDPER", referencedColumnName = "IDPER")
    @ManyToOne(optional = false)
    private Persona personaIdper;

    public VentaCombo() {
    }

    public VentaCombo(Long idcom) {
        this.idcom = idcom;
    }

    public VentaCombo(Long idcom, String tipcom, short cancom, BigDecimal importe) {
        this.idcom = idcom;
        this.tipcom = tipcom;
        this.cancom = cancom;
        this.importe = importe;
    }

    public Long getIdcom() {
        return idcom;
    }

    public void setIdcom(Long idcom) {
        this.idcom = idcom;
    }

    public String getTipcom() {
        return tipcom;
    }

    public void setTipcom(String tipcom) {
        this.tipcom = tipcom;
    }

    public short getCancom() {
        return cancom;
    }

    public void setCancom(short cancom) {
        this.cancom = cancom;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public Date getFecvent() {
        return fecvent;
    }

    public void setFecvent(Date fecvent) {
        this.fecvent = fecvent;
    }

    public Cliente getClienteIdcli() {
        return clienteIdcli;
    }

    public void setClienteIdcli(Cliente clienteIdcli) {
        this.clienteIdcli = clienteIdcli;
    }

    public Persona getPersonaIdper() {
        return personaIdper;
    }

    public void setPersonaIdper(Persona personaIdper) {
        this.personaIdper = personaIdper;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcom != null ? idcom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentaCombo)) {
            return false;
        }
        VentaCombo other = (VentaCombo) object;
        if ((this.idcom == null && other.idcom != null) || (this.idcom != null && !this.idcom.equals(other.idcom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.entity.VentaCombo[ idcom=" + idcom + " ]";
    }

}
