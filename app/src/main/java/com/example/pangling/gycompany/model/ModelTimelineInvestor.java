package com.example.pangling.gycompany.model;

/**
 * Created by Pangling on 11/24/2017.
 */

public class ModelTimelineInvestor {
    int img;
    String judul;
    String keterangan;
    String nomorTelp;
    String linkyt;
    String dari;

    public ModelTimelineInvestor(int img, String judul, String keterangan, String nomorTelp, String linkyt,String dari) {
        this.img = img;
        this.judul = judul;
        this.keterangan = keterangan;
        this.nomorTelp = nomorTelp;
        this.linkyt = linkyt;
        this.dari = dari;
    }

    public String getDari() {
        return dari;
    }

    public int getImg() {
        return img;
    }

    public String getJudul() {
        return judul;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public String getNomorTelp() {
        return nomorTelp;
    }

    public String getLinkyt() {
        return linkyt;
    }
}
