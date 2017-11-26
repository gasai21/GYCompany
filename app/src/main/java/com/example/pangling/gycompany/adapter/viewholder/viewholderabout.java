package com.example.pangling.gycompany.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pangling.gycompany.R;
import com.example.pangling.gycompany.model.ModelAbout;

/**
 * Created by Pangling on 11/25/2017.
 */

public class viewholderabout extends RecyclerView.ViewHolder {
    ImageView img;
    TextView kata;
    public viewholderabout(View itemView) {
        super(itemView);

        img = (ImageView) itemView.findViewById(R.id.imgListOwner);
        kata = (TextView) itemView.findViewById(R.id.tvPenjelasanOwner);
    }

    public void setUpData(ModelAbout data){
        img.setImageResource(data.getIcon());
        kata.setText(data.getTulisan());
    }
}
