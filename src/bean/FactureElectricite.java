/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author acer
 */
@Entity
public class FactureElectricite implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFacture;
    private double totalHt;
    private double totalTva;
    private double totalTtc;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Agence agence;
    @OneToMany
    private List<TrancheElectricite> trancheElectricites;
    @OneToMany
    private List<Consommation> consommations;
    @OneToMany(mappedBy = "factureElectricite")
    private List<FactureTrancheElectricite> factureTrancheElectricites;

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public double getTotalHt() {
        return totalHt;
    }

    public void setTotalHt(double totalHt) {
        this.totalHt = totalHt;
    }

    public double getTotalTva() {
        return totalTva;
    }

    public void setTotalTva(double totalTva) {
        this.totalTva = totalTva;
    }

    public double getTotalTtc() {
        return totalTtc;
    }

    public void setTotalTtc(double totalTtc) {
        this.totalTtc = totalTtc;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public List<TrancheElectricite> getTrancheElectricites() {
        return trancheElectricites;
    }

    public void setTrancheElectricites(List<TrancheElectricite> trancheElectricites) {
        this.trancheElectricites = trancheElectricites;
    }

    public List<Consommation> getConsommations() {
        return consommations;
    }

    public void setConsommations(List<Consommation> consommations) {
        this.consommations = consommations;
    }

    public List<FactureTrancheElectricite> getFactureTrancheElectricites() {
        return factureTrancheElectricites;
    }

    public void setFactureTrancheElectricites(List<FactureTrancheElectricite> factureTrancheElectricites) {
        this.factureTrancheElectricites = factureTrancheElectricites;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof FactureElectricite)) {
            return false;
        }
        FactureElectricite other = (FactureElectricite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FactureElectricite{" + "id=" + id + ", dateFacture=" + dateFacture + ", totalHt=" + totalHt + ", totalTva=" + totalTva + ", totalTtc=" + totalTtc + '}';
    }

   

}
