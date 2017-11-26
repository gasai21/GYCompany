package com.example.pangling.gycompany.model;

/**
 * Created by Pangling on 11/24/2017.
 */

public class ModelTimelineOwner {
    int img;
    String judul;
    String keterangan;

    public ModelTimelineOwner(int img, String judul, String keterangan) {
        this.img = img;
        this.judul = judul;
        this.keterangan = keterangan;
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
}
