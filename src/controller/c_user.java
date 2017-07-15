/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.HibernateUtil;
import config.BukuTableModel;
import dao.dao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.m_buku;
import view.v_admin;
import view.v_admin_data;
import view.v_user;

/**
 *
 * @author F
 */
public class c_user {
    private final v_user adminView;
    private final dao daoTokoBuku = HibernateUtil.getTOKO_BUKU_DAO();
    private List<m_buku> dataBuku;
    private BukuTableModel bukuTableModel;

    public c_user(v_user adminView) {
        this.adminView = adminView;
    }
    
    public void tampilData(){
        dataBuku = daoTokoBuku.getDataBukus();
        System.out.println(dataBuku.size());
        bukuTableModel = new BukuTableModel();
        
        String kategori = null;
        for(int i=0;i<dataBuku.size();i++){
            switch(dataBuku.get(i).getKategori()){
                case "0":
                    kategori = "Semua";
                    break;
                case "1":
                    kategori = "Anak";
                    break;
                case "2":
                    kategori = "Novel";
                    break;
                case "3":
                    kategori = "Komik";
                    break;
                case "4":
                    kategori = "Majalah";
                    break;
                case "5":
                    kategori = "Kuliner";
                    break;
                case "6":
                    kategori = "Edukasi";
                    break;
            }
            bukuTableModel.addRow(new Object[]{
                false,
                i+1,
                dataBuku.get(i).getId(),
                dataBuku.get(i).getJudul(),
                kategori,
                dataBuku.get(i).getPengarang(),
                dataBuku.get(i).getPenerbit(),
                dataBuku.get(i).getTahun(),
                dataBuku.get(i).getHarga(),
                dataBuku.get(i).getPersedian(),
                "edit",
            });
        }
        this.adminView.getT_buku().setModel(bukuTableModel);
    }
    
    public void tampilData(int kategoriBuku){
        dataBuku = daoTokoBuku.getDataBukus(kategoriBuku);
        System.out.println(dataBuku.size());
        bukuTableModel = new BukuTableModel();
        
        String kategori = null;
        for(int i=0;i<dataBuku.size();i++){
            switch(dataBuku.get(i).getKategori()){
                case "0":
                    kategori = "Semua";
                    break;
                case "1":
                    kategori = "Anak";
                    break;
                case "2":
                    kategori = "Novel";
                    break;
                case "3":
                    kategori = "Komik";
                    break;
                case "4":
                    kategori = "Majalah";
                    break;
                case "5":
                    kategori = "Kuliner";
                    break;
                case "6":
                    kategori = "Edukasi";
                    break;
            }
            bukuTableModel.addRow(new Object[]{
                false,
                i+1,
                dataBuku.get(i).getId(),
                dataBuku.get(i).getJudul(),
                kategori,
                dataBuku.get(i).getPengarang(),
                dataBuku.get(i).getPenerbit(),
                dataBuku.get(i).getTahun(),
                dataBuku.get(i).getHarga(),
                dataBuku.get(i).getPersedian(),
                "edit",
            });
        }
        this.adminView.getT_buku().setModel(bukuTableModel);
    }
    
    public void tampilData(int kategoriBuku, String cari){
        dataBuku = daoTokoBuku.getDataBukus(kategoriBuku,cari);
        System.out.println(dataBuku.size());
        bukuTableModel = new BukuTableModel();
        
        String kategori = null;
        for(int i=0;i<dataBuku.size();i++){
            switch(dataBuku.get(i).getKategori()){
                case "0":
                    kategori = "Semua";
                    break;
                case "1":
                    kategori = "Anak";
                    break;
                case "2":
                    kategori = "Novel";
                    break;
                case "3":
                    kategori = "Komik";
                    break;
                case "4":
                    kategori = "Majalah";
                    break;
                case "5":
                    kategori = "Kuliner";
                    break;
                case "6":
                    kategori = "Edukasi";
                    break;
            }
            bukuTableModel.addRow(new Object[]{
                false,
                i+1,
                dataBuku.get(i).getId(),
                dataBuku.get(i).getJudul(),
                kategori,
                dataBuku.get(i).getPengarang(),
                dataBuku.get(i).getPenerbit(),
                dataBuku.get(i).getTahun(),
                dataBuku.get(i).getHarga(),
                dataBuku.get(i).getPersedian(),
                "edit",
            });
        }
        this.adminView.getT_buku().setModel(bukuTableModel);
    }
    
    public void selectData(int row){
        String judul = (String) this.adminView.getT_buku().getValueAt(row, 3);
        String pengarang = (String) this.adminView.getT_buku().getValueAt(row, 5);
        String penerbit = (String) this.adminView.getT_buku().getValueAt(row, 6);
        String tahunTerbit = (String) this.adminView.getT_buku().getValueAt(row, 7);
        int harga = (int) this.adminView.getT_buku().getValueAt(row, 8);
        int persedian = (int) this.adminView.getT_buku().getValueAt(row, 9);
        String kategori = (String) this.adminView.getT_buku().getValueAt(row, 4);
        
        m_buku buku = new m_buku();
        buku.setJudul(judul);
        buku.setPengarang(pengarang);
        buku.setPenerbit(penerbit);
        buku.setTahun(judul);
        buku.setHarga(harga);
        buku.setPersedian(persedian);
        buku.setKategori(kategori);
        
        v_admin_data editData = new v_admin_data(1,buku);
        editData.setVisible(true);
    }
    
    public void hapusData(){
        int count_check = 0;
        ArrayList idBuku = new ArrayList();
        for(int i=0;i<this.adminView.getT_buku().getRowCount();i++){
            Boolean check = Boolean.valueOf(this.adminView.getT_buku().getValueAt(i, 0).toString());
            String id = this.adminView.getT_buku().getValueAt(i, 2).toString();
            if(check){
                count_check += 1;
                idBuku.add(id);
            }
        }
        if(!idBuku.isEmpty()){
            int pilih = JOptionPane.showConfirmDialog(null, "Apakah data ingin dihapus ?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE); 
            if (pilih == JOptionPane.YES_OPTION){
                for(int i=0;i<idBuku.size();i++){
                    m_buku buku = new m_buku();
                    buku.setId(idBuku.get(i).toString());
                    daoTokoBuku.deleteBuku(buku);
                }
                tampilData();
                JOptionPane.showMessageDialog(null, "Data Berhasil di Hapus", "info", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Pilih data Terlebih Dahulu", "info",JOptionPane.INFORMATION_MESSAGE); 
        }
        System.out.println(count_check);
    }
}
