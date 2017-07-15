/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.m_buku;
import model.m_user;

/**
 *
 * @author F
 */
public interface dao {
    public boolean login(String username, String password);
    public void saveBuku(m_buku buku);
    public void updateBuku(m_buku buku);
    public void deleteBuku(m_buku buku);
    public List<m_buku> getDataBukus();
    public List<m_buku> getDataBukus(int kategori);
    public List<m_buku> getDataBukus(int kategori, String cari);
}
