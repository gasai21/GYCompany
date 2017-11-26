package com.example.pangling.gycompany.model;

/**
 * Created by Pangling on 11/25/2017.
 */

public class ModelAbout {
    int icon;
    String tulisan;

    public ModelAbout(int icon, String tulisan) {
        this.icon = icon;
        this.tulisan = tulisan;
    }

    public int getIcon() {
        return icon;
    }

    public String getTulisan() {
        return tulisan;
    }
}
