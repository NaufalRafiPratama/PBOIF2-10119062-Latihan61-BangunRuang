/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119062.latihan61.bangunruang;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 * Deskripsi Progam : program ini berisi program untuk menampilkan
 * bangun ruang
 */
public class Tabung extends BangunRuang{
    public int t;

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
    
    public int getR() {
    return r;
    }

    public void setR(int r) {
        this.r = r;
    }
        
    @Override
    public double hitungVolume() {
        return Math.PI * Math.pow(r, 2) * t;
    }
}
