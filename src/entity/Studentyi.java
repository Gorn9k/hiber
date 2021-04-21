package entity;
// Generated 21.04.2021 11:54:42 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Studentyi generated by hbm2java
 */
public class Studentyi  implements java.io.Serializable {


     private long nomerZachetki;
     private Gruppyi gruppyi;
     private String familiya;
     private String imya;
     private String otchestvo;
     private String gorod;
     private String adres;
     private String tel;
     private String status;
     private Date statusDate;
     private Set otsenkis = new HashSet(0);

    public Studentyi() {
    }

	
    public Studentyi(long nomerZachetki, Gruppyi gruppyi, String familiya, String imya, String otchestvo, String gorod, String adres, String tel) {
        this.nomerZachetki = nomerZachetki;
        this.gruppyi = gruppyi;
        this.familiya = familiya;
        this.imya = imya;
        this.otchestvo = otchestvo;
        this.gorod = gorod;
        this.adres = adres;
        this.tel = tel;
    }
    public Studentyi(long nomerZachetki, Gruppyi gruppyi, String familiya, String imya, String otchestvo, String gorod, String adres, String tel, String status, Date statusDate, Set otsenkis) {
       this.nomerZachetki = nomerZachetki;
       this.gruppyi = gruppyi;
       this.familiya = familiya;
       this.imya = imya;
       this.otchestvo = otchestvo;
       this.gorod = gorod;
       this.adres = adres;
       this.tel = tel;
       this.status = status;
       this.statusDate = statusDate;
       this.otsenkis = otsenkis;
    }
   
    public long getNomerZachetki() {
        return this.nomerZachetki;
    }
    
    public void setNomerZachetki(long nomerZachetki) {
        this.nomerZachetki = nomerZachetki;
    }
    public Gruppyi getGruppyi() {
        return this.gruppyi;
    }
    
    public void setGruppyi(Gruppyi gruppyi) {
        this.gruppyi = gruppyi;
    }
    public String getFamiliya() {
        return this.familiya;
    }
    
    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }
    public String getImya() {
        return this.imya;
    }
    
    public void setImya(String imya) {
        this.imya = imya;
    }
    public String getOtchestvo() {
        return this.otchestvo;
    }
    
    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }
    public String getGorod() {
        return this.gorod;
    }
    
    public void setGorod(String gorod) {
        this.gorod = gorod;
    }
    public String getAdres() {
        return this.adres;
    }
    
    public void setAdres(String adres) {
        this.adres = adres;
    }
    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getStatusDate() {
        return this.statusDate;
    }
    
    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

public Set getOtsenkis() {
        return this.otsenkis;
    }
    
    public void setOtsenkis(Set otsenkis) {
        this.otsenkis = otsenkis;
    }


}


