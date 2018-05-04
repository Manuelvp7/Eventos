package modelos.com.ipn.mx.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/*@author mikeni*/
 
@Entity
@Table(name = "Asistente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asistente.findAll", query = "SELECT a FROM Asistente a")
    , @NamedQuery(name = "Asistente.findByIdAsistente", query = "SELECT a FROM Asistente a WHERE a.idAsistente = :idAsistente")
    , @NamedQuery(name = "Asistente.findByNombreAsiste", query = "SELECT a FROM Asistente a WHERE a.nombreAsiste = :nombreAsiste")
    , @NamedQuery(name = "Asistente.findByPaternoAsistente", query = "SELECT a FROM Asistente a WHERE a.paternoAsistente = :paternoAsistente")
    , @NamedQuery(name = "Asistente.findByMaternoAsistente", query = "SELECT a FROM Asistente a WHERE a.maternoAsistente = :maternoAsistente")
    , @NamedQuery(name = "Asistente.findByEmailAsistente", query = "SELECT a FROM Asistente a WHERE a.emailAsistente = :emailAsistente")})
public class Asistente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idAsistente")
    private Integer idAsistente;
    @Basic(optional = false)
    @Column(name = "nombreAsiste")
    private String nombreAsiste;
    @Basic(optional = false)
    @Column(name = "paternoAsistente")
    private String paternoAsistente;
    @Basic(optional = false)
    @Column(name = "maternoAsistente")
    private String maternoAsistente;
    @Basic(optional = false)
    @Column(name = "emailAsistente")
    private String emailAsistente;
    @Lob
    @Column(name = "fotoAsistente")
    private byte[] fotoAsistente;
    @JoinColumn(name = "idEvento", referencedColumnName = "idEvento")
    @ManyToOne
    private Evento idEvento;

    public Asistente() {
    }

    public Asistente(Integer idAsistente) {
        this.idAsistente = idAsistente;
    }

    public Asistente(Integer idAsistente, String nombreAsiste, String paternoAsistente, String maternoAsistente, String emailAsistente) {
        this.idAsistente = idAsistente;
        this.nombreAsiste = nombreAsiste;
        this.paternoAsistente = paternoAsistente;
        this.maternoAsistente = maternoAsistente;
        this.emailAsistente = emailAsistente;
    }

    public Integer getIdAsistente() {
        return idAsistente;
    }

    public void setIdAsistente(Integer idAsistente) {
        this.idAsistente = idAsistente;
    }

    public String getNombreAsiste() {
        return nombreAsiste;
    }

    public void setNombreAsiste(String nombreAsiste) {
        this.nombreAsiste = nombreAsiste;
    }

    public String getPaternoAsistente() {
        return paternoAsistente;
    }

    public void setPaternoAsistente(String paternoAsistente) {
        this.paternoAsistente = paternoAsistente;
    }

    public String getMaternoAsistente() {
        return maternoAsistente;
    }

    public void setMaternoAsistente(String maternoAsistente) {
        this.maternoAsistente = maternoAsistente;
    }

    public String getEmailAsistente() {
        return emailAsistente;
    }

    public void setEmailAsistente(String emailAsistente) {
        this.emailAsistente = emailAsistente;
    }

    public byte[] getFotoAsistente() {
        return fotoAsistente;
    }

    public void setFotoAsistente(byte[] fotoAsistente) {
        this.fotoAsistente = fotoAsistente;
    }

    public Evento getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Evento idEvento) {
        this.idEvento = idEvento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAsistente != null ? idAsistente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asistente)) {
            return false;
        }
        Asistente other = (Asistente) object;
        if ((this.idAsistente == null && other.idAsistente != null) || (this.idAsistente != null && !this.idAsistente.equals(other.idAsistente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelos.com.ipn.mx.modelo.Asistente[ idAsistente=" + idAsistente + " ]";
    }

}
