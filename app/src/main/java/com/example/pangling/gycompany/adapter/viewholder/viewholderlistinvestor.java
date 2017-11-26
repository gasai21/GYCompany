package com.example.pangling.gycompany.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pangling.gycompany.R;
import com.example.pangling.gycompany.model.ModelListInvestor;

/**
 * Created by Pangling on 11/24/2017.
 */

public class viewholderlistinvestor extends RecyclerView.ViewHolder {
    TextView text;
    ImageView viewss;
    public viewholderlistinvestor(View itemView) {
        super(itemView);

        text = (TextView) itemView.findViewById(R.id.tvPenjelasanOwner);
        viewss = (ImageView) itemView.findViewById(R.id.imgListOwner);
    }

    public void setUpData(ModelListInvestor data){
        text.setText(data.getTulisan());
        viewss.setImageResource(data.getIcon());
    }
}
