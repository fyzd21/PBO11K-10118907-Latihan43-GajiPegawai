/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan43.gajipegawai;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan gaji pegawai menggunakan konsep OOP
 * 
 */
public class PBO11K10118907Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GajiPegawai g = new GajiPegawai();
        g.setNama("Rizki Adam Kurniawan");
        g.setAlamat("Jalan Semar dlm 4 No 72/66");
        g.setUangTransport(250000);
        g.setUangTunjangan(300000);
        g.setGajiPokok(4500000);
        g.setTotalGaji(g.totalGaji(300000, 250000, 4500000));
        
        g.tampilData(g.getNama(), g.getAlamat(), g.getUangTunjangan(), g.getUangTransport(), g.getGajiPokok(), g.getTotalGaji());
    }
    
}
