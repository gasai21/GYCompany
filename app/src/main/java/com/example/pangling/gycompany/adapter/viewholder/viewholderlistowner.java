package com.example.pangling.gycompany.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pangling.gycompany.R;
import com.example.pangling.gycompany.model.ModelListOwner;

/**
 * Created by Pangling on 11/22/2017.
 */

public class viewholderlistowner extends RecyclerView.ViewHolder {

    ImageView img;
    TextView tulisan;
    public viewholderlistowner(View itemView) {
        super(itemView);
        img = (ImageView) itemView.findViewById(R.id.imgListOwner);
        tulisan = (TextView) itemView.findViewById(R.id.tvPenjelasanOwner);
    }

    public void setUpData(ModelListOwner data){
        img.setImageResource(data.getIcon());
        tulisan.setText(data.getTulisan());
    }

}
