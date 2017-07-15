/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList; 
import java.util.List;
import model.m_buku;

/**
 *
 * @author F
 */
public class BukuTableModel extends DefaultTableModel{
    
    
    public BukuTableModel() {
        super(new String[]{
        "Ceklis", "No", "ID", 
        "Judul","Kategori","Pengarang", 
        "Penerbit","Tahun Terbit",
        "Harga","Persediaan",""},0);
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex){
            case 0 :
                return Boolean.class;
            case 1 :
                return String.class;
            case 2 :
                return String.class;
            case 3 :
                return String.class;
            case 4 :
                return String.class;
            case 5 :
                return String.class;
            case 6 :
                return String.class;
            case 7 :
                return String.class; 
            case 8 :
                return String.class;
            case 9 :
                return String.class;
            case 10 :
                return String.class;
            case 11 :
                return String.class;
            default :
                return String.class;
        }
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        return column == 0;
    }
}
