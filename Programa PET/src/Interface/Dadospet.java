/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Lucas
 */
@Entity
@Table(name = "dadospet", catalog = "pet", schema = "")
@NamedQueries({
    @NamedQuery(name = "Dadospet.findAll", query = "SELECT d FROM Dadospet d")
    , @NamedQuery(name = "Dadospet.findByContagemMonitorias", query = "SELECT d FROM Dadospet d WHERE d.contagemMonitorias = :contagemMonitorias")
    , @NamedQuery(name = "Dadospet.findByNomeMonitor1", query = "SELECT d FROM Dadospet d WHERE d.nomeMonitor1 = :nomeMonitor1")
    , @NamedQuery(name = "Dadospet.findByNomeMonitor2", query = "SELECT d FROM Dadospet d WHERE d.nomeMonitor2 = :nomeMonitor2")
    , @NamedQuery(name = "Dadospet.findByNomeAluno", query = "SELECT d FROM Dadospet d WHERE d.nomeAluno = :nomeAluno")
    , @NamedQuery(name = "Dadospet.findByCursoAluno", query = "SELECT d FROM Dadospet d WHERE d.cursoAluno = :cursoAluno")
    , @NamedQuery(name = "Dadospet.findByMateriaAluno", query = "SELECT d FROM Dadospet d WHERE d.materiaAluno = :materiaAluno")
    , @NamedQuery(name = "Dadospet.findByRaAluno", query = "SELECT d FROM Dadospet d WHERE d.raAluno = :raAluno")
    , @NamedQuery(name = "Dadospet.findByLocalMonitoria", query = "SELECT d FROM Dadospet d WHERE d.localMonitoria = :localMonitoria")
    , @NamedQuery(name = "Dadospet.findByHoraMonitoria", query = "SELECT d FROM Dadospet d WHERE d.horaMonitoria = :horaMonitoria")
    , @NamedQuery(name = "Dadospet.findByDataMonitoria", query = "SELECT d FROM Dadospet d WHERE d.dataMonitoria = :dataMonitoria")})
public class Dadospet implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "contagemMonitorias")
    private Integer contagemMonitorias;
    @Column(name = "nomeMonitor1")
    private String nomeMonitor1;
    @Column(name = "nomeMonitor2")
    private String nomeMonitor2;
    @Column(name = "nomeAluno")
    private String nomeAluno;
    @Column(name = "cursoAluno")
    private String cursoAluno;
    @Column(name = "materiaAluno")
    private String materiaAluno;
    @Column(name = "raAluno")
    private Integer raAluno;
    @Column(name = "localMonitoria")
    private String localMonitoria;
    @Column(name = "horaMonitoria")
    @Temporal(TemporalType.TIME)
    private Date horaMonitoria;
    @Column(name = "dataMonitoria")
    @Temporal(TemporalType.DATE)
    private Date dataMonitoria;

    public Dadospet() {
    }

    public Dadospet(Integer contagemMonitorias) {
        this.contagemMonitorias = contagemMonitorias;
    }

    public Integer getContagemMonitorias() {
        return contagemMonitorias;
    }

    public void setContagemMonitorias(Integer contagemMonitorias) {
        Integer oldContagemMonitorias = this.contagemMonitorias;
        this.contagemMonitorias = contagemMonitorias;
        changeSupport.firePropertyChange("contagemMonitorias", oldContagemMonitorias, contagemMonitorias);
    }

    public String getNomeMonitor1() {
        return nomeMonitor1;
    }

    public void setNomeMonitor1(String nomeMonitor1) {
        String oldNomeMonitor1 = this.nomeMonitor1;
        this.nomeMonitor1 = nomeMonitor1;
        changeSupport.firePropertyChange("nomeMonitor1", oldNomeMonitor1, nomeMonitor1);
    }

    public String getNomeMonitor2() {
        return nomeMonitor2;
    }

    public void setNomeMonitor2(String nomeMonitor2) {
        String oldNomeMonitor2 = this.nomeMonitor2;
        this.nomeMonitor2 = nomeMonitor2;
        changeSupport.firePropertyChange("nomeMonitor2", oldNomeMonitor2, nomeMonitor2);
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        String oldNomeAluno = this.nomeAluno;
        this.nomeAluno = nomeAluno;
        changeSupport.firePropertyChange("nomeAluno", oldNomeAluno, nomeAluno);
    }

    public String getCursoAluno() {
        return cursoAluno;
    }

    public void setCursoAluno(String cursoAluno) {
        String oldCursoAluno = this.cursoAluno;
        this.cursoAluno = cursoAluno;
        changeSupport.firePropertyChange("cursoAluno", oldCursoAluno, cursoAluno);
    }

    public String getMateriaAluno() {
        return materiaAluno;
    }

    public void setMateriaAluno(String materiaAluno) {
        String oldMateriaAluno = this.materiaAluno;
        this.materiaAluno = materiaAluno;
        changeSupport.firePropertyChange("materiaAluno", oldMateriaAluno, materiaAluno);
    }

    public Integer getRaAluno() {
        return raAluno;
    }

    public void setRaAluno(Integer raAluno) {
        Integer oldRaAluno = this.raAluno;
        this.raAluno = raAluno;
        changeSupport.firePropertyChange("raAluno", oldRaAluno, raAluno);
    }

    public String getLocalMonitoria() {
        return localMonitoria;
    }

    public void setLocalMonitoria(String localMonitoria) {
        String oldLocalMonitoria = this.localMonitoria;
        this.localMonitoria = localMonitoria;
        changeSupport.firePropertyChange("localMonitoria", oldLocalMonitoria, localMonitoria);
    }

    public Date getHoraMonitoria() {
        return horaMonitoria;
    }

    public void setHoraMonitoria(Date horaMonitoria) {
        Date oldHoraMonitoria = this.horaMonitoria;
        this.horaMonitoria = horaMonitoria;
        changeSupport.firePropertyChange("horaMonitoria", oldHoraMonitoria, horaMonitoria);
    }

    public Date getDataMonitoria() {
        return dataMonitoria;
    }

    public void setDataMonitoria(Date dataMonitoria) {
        Date oldDataMonitoria = this.dataMonitoria;
        this.dataMonitoria = dataMonitoria;
        changeSupport.firePropertyChange("dataMonitoria", oldDataMonitoria, dataMonitoria);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contagemMonitorias != null ? contagemMonitorias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dadospet)) {
            return false;
        }
        Dadospet other = (Dadospet) object;
        if ((this.contagemMonitorias == null && other.contagemMonitorias != null) || (this.contagemMonitorias != null && !this.contagemMonitorias.equals(other.contagemMonitorias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Interface.Dadospet[ contagemMonitorias=" + contagemMonitorias + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
