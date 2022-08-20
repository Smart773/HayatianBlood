package com.mango.hayatianblood;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mango.hayatianblood.dataClasses.DonorModel;

import java.util.List;

public class MyAdopter extends RecyclerView.Adapter<MyAdopter.Vholder> {


    List<DonorModel> Data;
    Activity activity;

    public MyAdopter(List<DonorModel> data, Activity activity) {
        Data = data;
        this.activity = activity;
    }

    public static class Vholder extends RecyclerView.ViewHolder{

        TextView name,city,phone,type,date;

        public Vholder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.txtCardName);
            city=itemView.findViewById(R.id.txtCardCity);
            phone=itemView.findViewById(R.id.txtCardPhone);
            type=itemView.findViewById(R.id.txtCardBloodType);
            date=itemView.findViewById(R.id.txtCardDate);
        }
    }

    @NonNull
    @Override
    public Vholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(parent.getContext());
        View v= inflater.inflate(R.layout.list_item,parent,false);
        return new Vholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Vholder holder, int position) {
        DonorModel myData = Data.get(position);
        holder.name.setText(myData.getName());
        holder.date.setText(myData.getDate());
        holder.type.setText(myData.getBloodType());
        holder.phone.setText(myData.getPhone());
        holder.city.setText(myData.getCity());

    }



    @Override
    public int getItemCount() {
        return Data.size();
    }

}
