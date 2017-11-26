package com.example.pangling.gycompany.model;

/**
 * Created by Pangling on 11/24/2017.
 */

public class ModelListInvestor {
    int icon;
    String tulisan;

    public ModelListInvestor(int icon, String tulisan) {
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
