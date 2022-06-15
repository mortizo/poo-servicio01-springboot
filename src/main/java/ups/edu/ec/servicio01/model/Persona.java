package ups.edu.ec.servicio01.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
@Entity
@Table(name = "test_persona")
@NamedQueries({
        @NamedQuery(name = "TestPersona.findAll", query = "SELECT t FROM Persona t"),
        @NamedQuery(name = "TestPersona.findByPerCodigo", query = "SELECT t FROM Persona t WHERE t.perCodigo = :perCodigo"),
        @NamedQuery(name = "TestPersona.findByPerNombre", query = "SELECT t FROM Persona t WHERE t.perNombre = :perNombre"),
        @NamedQuery(name = "TestPersona.findByPerPais", query = "SELECT t FROM Persona t WHERE t.perPais = :perPais")})


public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "per_codigo")
    private Integer perCodigo;
    @Column(name = "per_nombre")
    private String perNombre;
    @Column(name = "per_pais")
    private String perPais;

    public Persona() {
    }

    public Persona(Integer perCodigo) {
        this.perCodigo = perCodigo;
    }

    public Integer getPerCodigo() {
        return perCodigo;
    }

    public void setPerCodigo(Integer perCodigo) {
        this.perCodigo = perCodigo;
    }

    public String getPerNombre() {
        return perNombre;
    }

    public void setPerNombre(String perNombre) {
        this.perNombre = perNombre;
    }

    public String getPerPais() {
        return perPais;
    }

    public void setPerPais(String perPais) {
        this.perPais = perPais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perCodigo != null ? perCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        return (this.perCodigo != null || other.perCodigo == null) && (this.perCodigo == null || this.perCodigo.equals(other.perCodigo));
    }

    @Override
    public String toString() {
        return "Persona[ perCodigo=" + perCodigo + " ]";
    }

}

