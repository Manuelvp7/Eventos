package modelos.com.ipn.mx.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/*@author mikeni*/
 
@Entity
@Table(name = "Evento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evento_1.findAll", query = "SELECT e FROM Evento_1 e")
    , @NamedQuery(name = "Evento_1.findByIdEvento", query = "SELECT e FROM Evento_1 e WHERE e.idEvento = :idEvento")
    , @NamedQuery(name = "Evento_1.findByNombreEvento", query = "SELECT e FROM Evento_1 e WHERE e.nombreEvento = :nombreEvento")
    , @NamedQuery(name = "Evento_1.findByFechaEvento", query = "SELECT e FROM Evento_1 e WHERE e.fechaEvento = :fechaEvento")
    , @NamedQuery(name = "Evento_1.findByDuracionEvento", query = "SELECT e FROM Evento_1 e WHERE e.duracionEvento = :duracionEvento")
    , @NamedQuery(name = "Evento_1.findByFotoEvento", query = "SELECT e FROM Evento_1 e WHERE e.fotoEvento = :fotoEvento")})
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEvento")
    private Integer idEvento;
    @Basic(optional = false)
    @Column(name = "nombreEvento")
    private String nombreEvento;
    @Basic(optional = false)
    @Column(name = "fechaEvento")
    @Temporal(TemporalType.DATE)
    private Date fechaEvento;
    @Basic(optional = false)
    @Column(name = "duracionEvento")
    private int duracionEvento;
    @Basic(optional = false)
    @Column(name = "fotoEvento")
    private String fotoEvento;
    @OneToMany(mappedBy = "idEvento")
    private Collection<Asistente> asistenteCollection;

    public Evento() {
    }

    public Evento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public Evento(Integer idEvento, String nombreEvento, Date fechaEvento, int duracionEvento, String fotoEvento) {
        this.idEvento = idEvento;
        this.nombreEvento = nombreEvento;
        this.fechaEvento = fechaEvento;
        this.duracionEvento = duracionEvento;
        this.fotoEvento = fotoEvento;
    }

    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public int getDuracionEvento() {
        return duracionEvento;
    }

    public void setDuracionEvento(int duracionEvento) {
        this.duracionEvento = duracionEvento;
    }

    public String getFotoEvento() {
        return fotoEvento;
    }

    public void setFotoEvento(String fotoEvento) {
        this.fotoEvento = fotoEvento;
    }

    @XmlTransient
    public Collection<Asistente> getAsistenteCollection() {
        return asistenteCollection;
    }

    public void setAsistenteCollection(Collection<Asistente> asistenteCollection) {
        this.asistenteCollection = asistenteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEvento != null ? idEvento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if ((this.idEvento == null && other.idEvento != null) || (this.idEvento != null && !this.idEvento.equals(other.idEvento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelos.com.ipn.mx.modelo.Evento_1[ idEvento=" + idEvento + " ]";
    }

}
