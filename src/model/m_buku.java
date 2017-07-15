/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.EnumType; 
import javax.persistence.Enumerated; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.Table;
import javax.persistence.Temporal; 
import javax.persistence.TemporalType; 
import org.hibernate.annotations.GenericGenerator; 

/**
 *
 * @author F
 */
@Entity
@Table(name = "buku")
public class m_buku implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private String id;
    @Column(name = "judul")
    private String judul;
    @Column(name = "kategori")
    private String kategori;
    @Column(name = "pengarang")
    private String pengarang;
    @Column(name = "penerbit")
    private String penerbit;
    @Column(name = "tahun")
    private String tahun;
    @Column(name = "harga")
    private int harga;
    @Column(name = "persedian")
    private int persedian;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getPersedian() {
        return persedian;
    }

    public void setPersedian(int persedian) {
        this.persedian = persedian;
    }
    
}
