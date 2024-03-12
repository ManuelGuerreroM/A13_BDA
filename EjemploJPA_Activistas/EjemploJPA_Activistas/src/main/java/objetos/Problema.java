/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Laboratorios
 */
@Entity
@Table(name="problema")
public class Problema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaInicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaFinal;
    private String estado;
    @ManyToMany(mappedBy = "problemas")
    private List<Activista> activistas;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Calendar fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Activista> getActivistas() {
        return activistas;
    }

    public void setActivistas(List<Activista> activistas) {
        this.activistas = activistas;
    }

    public Problema() {
    }

    public Problema(Long id) {
        this.id = id;
    }

    public Problema(Calendar fechaInicio, Calendar fechaFinal, String estado) {
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
    }

    public Problema(Calendar fechaInicio, Calendar fechaFinal, String estado, List<Activista> activistas) {
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
        this.activistas = activistas;
    }

    public Problema(Long id, Calendar fechaInicio, Calendar fechaFinal, String estado, List<Activista> activistas) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
        this.activistas = activistas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Problema)) {
            return false;
        }
        Problema other = (Problema) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "objetos.Problema[ id=" + id + " ]";
    }
    
}
