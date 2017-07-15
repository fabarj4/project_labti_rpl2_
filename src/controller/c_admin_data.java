/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.HibernateUtil;
import dao.dao;
import javax.swing.JOptionPane;
import model.m_buku;
import view.v_admin_data;

/**
 *
 * @author F
 */
public class c_admin_data {
    
    private final v_admin_data adminDataView;
    private final dao daoTokoBuku = HibernateUtil.getTOKO_BUKU_DAO();
    private String idBuku;

    public c_admin_data(v_admin_data adminDataView) {
        this.adminDataView = adminDataView;
    }
    
    public void tambahData(){
        String judul = adminDataView.getT_judul().getText().trim();
        String pengarang = adminDataView.getT_pengarang().getText().trim();
        String penerbit = adminDataView.getT_penerbit().getText().trim();
        String tahunTerbit = adminDataView.getT_tahun().getText().trim();
        int harga = Integer.parseInt(adminDataView.getT_harga().getText());
        int persedian = (int) adminDataView.getT_persediaan().getValue();
        String kategori = String.valueOf(adminDataView.getT_kategori().getSelectedIndex());
        
        m_buku bukuModel = new m_buku();
        bukuModel.setJudul(judul);
        bukuModel.setPengarang(pengarang);
        bukuModel.setPenerbit(penerbit);
        bukuModel.setTahun(tahunTerbit);
        bukuModel.setHarga(harga);
        bukuModel.setPersedian(persedian);
        bukuModel.setKategori(kategori);
        
        daoTokoBuku.saveBuku(bukuModel);
        clear();
        JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan", "info",JOptionPane.INFORMATION_MESSAGE); 
    }
    
    public void editData(){
        String judul = adminDataView.getT_judul().getText().trim();
        String pengarang = adminDataView.getT_pengarang().getText().trim();
        String penerbit = adminDataView.getT_penerbit().getText().trim();
        String tahunTerbit = adminDataView.getT_tahun().getText().trim();
        int harga = Integer.parseInt(adminDataView.getT_harga().getText());
        int persedian = (int) adminDataView.getT_persediaan().getValue();
        String kategori = String.valueOf(adminDataView.getT_kategori().getSelectedIndex());
        
        m_buku bukuModel = new m_buku();
        bukuModel.setId(idBuku);
        bukuModel.setJudul(judul);
        bukuModel.setPengarang(pengarang);
        bukuModel.setPenerbit(penerbit);
        bukuModel.setTahun(tahunTerbit);
        bukuModel.setHarga(harga);
        bukuModel.setPersedian(persedian);
        bukuModel.setKategori(kategori);
        
        daoTokoBuku.updateBuku(bukuModel);
        clear();
        JOptionPane.showMessageDialog(null, "Data Berhasil di Edit", "info",JOptionPane.INFORMATION_MESSAGE); 
    }
    
    public void clear(){
        this.adminDataView.getT_harga().setText("");
        this.adminDataView.getT_judul().setText("");
        this.adminDataView.getT_kategori().setSelectedIndex(0);
        this.adminDataView.getT_penerbit().setText("");
        this.adminDataView.getT_pengarang().setText("");
        this.adminDataView.getT_persediaan().setValue(0);
        this.adminDataView.getT_tahun().setText("");
    }
    
    public void setData(m_buku buku){
        idBuku = buku.getId();
        this.adminDataView.getT_judul().setText(buku.getJudul());
        this.adminDataView.getT_pengarang().setText(buku.getPengarang());
        this.adminDataView.getT_penerbit().setText(buku.getPenerbit());
        this.adminDataView.getT_tahun().setText(buku.getTahun());
        this.adminDataView.getT_harga().setText(String.valueOf(buku.getHarga()));
        this.adminDataView.getT_persediaan().setValue(buku.getPersedian());
    }
}
