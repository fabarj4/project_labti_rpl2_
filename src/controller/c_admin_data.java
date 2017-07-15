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

    public c_admin_data(v_admin_data adminDataView) {
        this.adminDataView = adminDataView;
    }
    
    public void tambahData(){
        String id = adminDataView.getT_id().getText().trim();
        String judul = adminDataView.getT_judul().getText().trim();
        String pengarang = adminDataView.getT_pengarang().getText().trim();
        String penerbit = adminDataView.getT_penerbit().getText().trim();
        String tahunTerbit = adminDataView.getT_tahun().getText().trim();
        String harga = adminDataView.getT_harga().getText().trim();
        int persedian = (int) adminDataView.getT_persediaan().getValue();
        String kategori = String.valueOf(adminDataView.getT_kategori().getSelectedIndex());
        
        m_buku bukuModel = new m_buku();
        bukuModel.setJudul(judul);
        bukuModel.setPengarang(pengarang);
        bukuModel.setPenerbit(penerbit);
        bukuModel.setTahun(tahunTerbit);
        bukuModel.setPersedian(persedian);
        bukuModel.setKategori(kategori);
        
        daoTokoBuku.saveBuku(bukuModel);
        clear();
        JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan", "info",JOptionPane.INFORMATION_MESSAGE); 
    }
    
    public void clear(){
        this.adminDataView.getT_id().setText("");
        this.adminDataView.getT_harga().setText("");
        this.adminDataView.getT_judul().setText("");
        this.adminDataView.getT_kategori().setSelectedIndex(0);
        this.adminDataView.getT_penerbit().setText("");
        this.adminDataView.getT_pengarang().setText("");
        this.adminDataView.getT_persediaan().setValue(0);
        this.adminDataView.getT_tahun().setText("");
    }
}
