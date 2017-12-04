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
public class FactureEau implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFacture;
    private double totalHt;
    private double totalTva;
    private double montantTtc;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Agence agence;
    @OneToMany
    private List<TrancheEau> trancheEaus;
    @OneToMany
    private List<Consommation> consommations;
    @OneToMany(mappedBy = "factureEau")
    private List<FactureTrancheEau> factureTrancheEaus;

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

    public double getMontantTtc() {
        return montantTtc;
    }

    public void setMontantTtc(double montantTtc) {
        this.montantTtc = montantTtc;
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

    public List<TrancheEau> getTrancheEaus() {
        return trancheEaus;
    }

    public void setTrancheEaus(List<TrancheEau> trancheEaus) {
        this.trancheEaus = trancheEaus;
    }

    public List<Consommation> getConsommations() {
        return consommations;
    }

    public void setConsommations(List<Consommation> consommations) {
        this.consommations = consommations;
    }

    public List<FactureTrancheEau> getFactureTrancheEaus() {
        return factureTrancheEaus;
    }

    public void setFactureTrancheEaus(List<FactureTrancheEau> factureTrancheEaus) {
        this.factureTrancheEaus = factureTrancheEaus;
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
        if (!(object instanceof FactureEau)) {
            return false;
        }
        FactureEau other = (FactureEau) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FactureEau{" + "id=" + id + ", dateFacture=" + dateFacture + ", totalHt=" + totalHt + ", totalTva=" + totalTva + ", montantTtc=" + montantTtc + '}';
    }

   
}
