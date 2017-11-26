package com.example.pangling.gycompany.adapter.viewholder;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.pangling.gycompany.DetailPostActivity;
import com.example.pangling.gycompany.R;
import com.example.pangling.gycompany.model.ModelTimelineInvestor;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pangling on 11/24/2017.
 */

public class viewholdertimelineinvestor extends RecyclerView.ViewHolder {
    ImageView img;
    TextView judul,isi,link,nomor,dari;
    CardView cd;
    TextView btnLihat;
    String url = "https://api.mainapi.net/smsnotification/1.0.0/messages";
    RequestQueue requestQueue;
    StringRequest stringRequest;
    public viewholdertimelineinvestor(View itemView) {
        super(itemView);

        img = (ImageView) itemView.findViewById(R.id.imgTimelineProfilInvestor);
        judul = (TextView) itemView.findViewById(R.id.tvJudulTimelineInvestor);
        isi = (TextView) itemView.findViewById(R.id.tvKeteranganTimelineInvestor);
        link = (TextView) itemView.findViewById(R.id.tvlinkInvestor);
        nomor = (TextView) itemView.findViewById(R.id.tvnomorInvestor);
        cd = (CardView) itemView.findViewById(R.id.cdTimelineInvestorr);
        btnLihat = (TextView) itemView.findViewById(R.id.btnEditTimelineInvestor);
        dari = (TextView) itemView.findViewById(R.id.tvdariInvestor);
        requestQueue = Volley.newRequestQueue(itemView.getContext());

        ngeclick();
    }

    public void setUpData(ModelTimelineInvestor data){
        img.setImageResource(data.getImg());
        judul.setText(data.getJudul());
        isi.setText(data.getKeterangan());
        link.setText(data.getLinkyt());
        nomor.setText(data.getNomorTelp());
        dari.setText(data.getDari());
    }

    private void ngeclick(){
        btnLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(itemView.getContext(), DetailPostActivity.class);
                i.putExtra("dari",dari.getText());
                i.putExtra("projek",judul.getText());
                i.putExtra("judul",judul.getText());
                itemView.getContext().startActivity(i);
                ngirimpesanNotif();
            }
        });
    }

    private void ngirimpesanNotif(){
        stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject obj = new JSONObject(response);
                    String message = obj.getString("message");
                    if(message.equals("SUCCESS")){
                        Toast.makeText(itemView.getContext(),"Berhasil di kirim",Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(itemView.getContext(),"Gagal di kirim",Toast.LENGTH_SHORT).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("ERR",error.getMessage().toString());
                //Toast.makeText(itemView.getContext(),"Error",Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String,String> param = new HashMap<>();
                param.put("Accept","application/json");
                param.put("Content-Type","application/x-www-form-urlencoded");
                param.put("Authorization","Bearer b1d27b8d99cba1b526226e6ddfae00a4");
                return param;
            }

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String,String> params = new HashMap<>();
                params.put("msisdn","081388625823");
                params.put("content","Hello");
                return params;
            }
        };
        exec();
    }

    private void exec(){
        requestQueue.add(stringRequest);
    }
}
