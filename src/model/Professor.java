/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author alunos
 */
@Entity
public class Professor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idP;
    private String nomeP;
    private String emailP;
    private String loginP;
    private String senhaP;
    private String dis;

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }

    public Long getIdP() {
        return idP;
    }

    public void setIdP(Long idP) {
        this.idP = idP;
    }

    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public String getEmailP() {
        return emailP;
    }

    public void setEmailP(String emailP) {
        this.emailP = emailP;
    }

    public String getLoginP() {
        return loginP;
    }

    public void setLoginP(String loginP) {
        this.loginP = loginP;
    }

    public String getSenhaP() {
        return senhaP;
    }

    public void setSenhaP(String senhaP) {
        this.senhaP = senhaP;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idP != null ? idP.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Professor)) {
            return false;
        }
        Professor other = (Professor) object;
        if ((this.idP == null && other.idP != null) || (this.idP != null && !this.idP.equals(other.idP))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Professor[ idP=" + idP + " ]";
    }
    
}
