package com.example.pangling.gycompany.adapter.viewholder;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pangling.gycompany.EditPostOwnerActivity;
import com.example.pangling.gycompany.R;
import com.example.pangling.gycompany.model.ModelTimelineOwner;

/**
 * Created by Pangling on 11/24/2017.
 */

public class viewholdertimelineowner extends RecyclerView.ViewHolder {
    ImageView img;
    TextView judul,keterangan,delete,edit;
    public viewholdertimelineowner(View itemView) {
        super(itemView);

        img = (ImageView) itemView.findViewById(R.id.imgTimelineProfilOwner);
        judul = (TextView) itemView.findViewById(R.id.tvJudulTimelineOwner);
        keterangan = (TextView) itemView.findViewById(R.id.tvKeteranganTimelineOwner);
        delete = (TextView) itemView.findViewById(R.id.btnHapusOwner);
        edit = (TextView) itemView.findViewById(R.id.btnEditTimelineOwner);

        hapusdata();
        editdata();
    }

    public void setUpData(ModelTimelineOwner data){
        judul.setText(data.getJudul());
        keterangan.setText(data.getKeterangan());
        img.setImageResource(data.getImg());
    }

    public void hapusdata(){
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(itemView.getContext(),"Data Berhasil di hapus!",Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void editdata(){
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(itemView.getContext(), EditPostOwnerActivity.class);
                i.putExtra("judul",judul.getText().toString());
                i.putExtra("keterangan",keterangan.getText().toString());
                itemView.getContext().startActivity(i);
            }
        });
    }

}
