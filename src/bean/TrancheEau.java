/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author acer
 */
@Entity
public class TrancheEau implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;//tranche1,tranche2,tranche3
    private double montant;
    private double montantTva;
    private double debutTranche;
    private double finTranche;

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getMontantTva() {
        return montantTva;
    }

    public void setMontantTva(double montantTva) {
        this.montantTva = montantTva;
    }

    public double getDebutTranche() {
        return debutTranche;
    }

    public void setDebutTranche(double debutTranche) {
        this.debutTranche = debutTranche;
    }

    public double getFinTranche() {
        return finTranche;
    }

    public void setFinTranche(double finTranche) {
        this.finTranche = finTranche;
    }
    
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        if (!(object instanceof TrancheEau)) {
            return false;
        }
        TrancheEau other = (TrancheEau) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TrancheEau{" + "id=" + id + ", montant=" + montant + ", montantTva=" + montantTva + ", debutTranche=" + debutTranche + ", finTranche=" + finTranche + '}';
    }

}
