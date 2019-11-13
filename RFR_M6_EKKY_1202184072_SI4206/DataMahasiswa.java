/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RFR_M6_EKKY_1202184072_SI4206;

/**
 *
 * @author efelcomp
 */
public class DataMahasiswa {
    String nama,kelas, jurusan,fakultas;
    int posisi;
    public DataMahasiswa(int posisi,String nama, String kelas, String jurusan, String fakultas) {
        this.posisi=posisi;
        this.nama = nama;
        this.kelas = kelas;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
    }

    public int getPosisi() {
        return posisi;
    }

    public void setPosisi(int posisi) {
        this.posisi = posisi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    
}
