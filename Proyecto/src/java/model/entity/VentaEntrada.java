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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC13
 */
@Entity
@Table(name = "VENTA_ENTRADA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VentaEntrada.findAll", query = "SELECT v FROM VentaEntrada v")
    , @NamedQuery(name = "VentaEntrada.findByIdent", query = "SELECT v FROM VentaEntrada v WHERE v.ident = :ident")
    , @NamedQuery(name = "VentaEntrada.findByImporte", query = "SELECT v FROM VentaEntrada v WHERE v.importe = :importe")
    , @NamedQuery(name = "VentaEntrada.findByFecvent", query = "SELECT v FROM VentaEntrada v WHERE v.fecvent = :fecvent")})
public class VentaEntrada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @SequenceGenerator(name = "MySeqPer", sequenceName = "SeqPer", initialValue = 5, allocationSize = 100) //generador de sequencias
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDENT")
    private Long ident;

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
    @JoinColumn(name = "PELICULA_IDPEL", referencedColumnName = "IDPEL")
    @ManyToOne
    private Pelicula peliculaIdpel;
    @JoinColumn(name = "PERSONA_IDPER", referencedColumnName = "IDPER")
    @ManyToOne(optional = false)
    private Persona personaIdper;
    @JoinColumn(name = "SALA_IDSAL", referencedColumnName = "IDSAL")
    @ManyToOne(optional = false)
    private Sala salaIdsal;

    public VentaEntrada() {
    }

    public VentaEntrada(Long ident) {
        this.ident = ident;
    }

    public VentaEntrada(Long ident, BigDecimal importe) {
        this.ident = ident;
        this.importe = importe;
    }

    public Long getIdent() {
        return ident;
    }

    public void setIdent(Long ident) {
        this.ident = ident;
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

    public Pelicula getPeliculaIdpel() {
        return peliculaIdpel;
    }

    public void setPeliculaIdpel(Pelicula peliculaIdpel) {
        this.peliculaIdpel = peliculaIdpel;
    }

    public Persona getPersonaIdper() {
        return personaIdper;
    }

    public void setPersonaIdper(Persona personaIdper) {
        this.personaIdper = personaIdper;
    }

    public Sala getSalaIdsal() {
        return salaIdsal;
    }

    public void setSalaIdsal(Sala salaIdsal) {
        this.salaIdsal = salaIdsal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ident != null ? ident.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentaEntrada)) {
            return false;
        }
        VentaEntrada other = (VentaEntrada) object;
        if ((this.ident == null && other.ident != null) || (this.ident != null && !this.ident.equals(other.ident))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.entity.VentaEntrada[ ident=" + ident + " ]";
    }

}
