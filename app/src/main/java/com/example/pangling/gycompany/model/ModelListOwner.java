package com.example.pangling.gycompany.model;

/**
 * Created by Pangling on 11/22/2017.
 */

public class ModelListOwner {
    int icon;
    String tulisan;

    public ModelListOwner(int icon, String tulisan) {
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
