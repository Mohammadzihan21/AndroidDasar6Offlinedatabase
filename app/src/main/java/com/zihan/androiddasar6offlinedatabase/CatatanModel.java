package com.zihan.androiddasar6offlinedatabase;

public class CatatanModel extends RealmObject {
    @PrimaryKey
    private int id;
    private String judul;
    private String Jumlahhutang;
    private String tanggal;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJumlahhutang() {
        return Jumlahhutang;
    }

    public void setJumlahhutang(String jumlahhutang) {
        Jumlahhutang = jumlahhutang;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
