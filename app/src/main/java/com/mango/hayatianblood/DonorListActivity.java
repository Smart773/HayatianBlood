package com.mango.hayatianblood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mango.hayatianblood.dataClasses.DonorModel;

import java.util.ArrayList;
import java.util.List;

public class DonorListActivity extends AppCompatActivity {

    List Data = new ArrayList<DonorModel>();
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_list_page);
        recyclerView=findViewById(R.id.allDonoRecyclerView);

        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        Data.add(new DonorModel("Usama","Gujrat","03027598955","12/12/2000","O+"));
        MyAdopter adopter = new MyAdopter(Data, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adopter);
    }
}