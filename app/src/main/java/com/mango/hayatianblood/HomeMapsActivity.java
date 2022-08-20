package com.mango.hayatianblood;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.mango.hayatianblood.databinding.ActivityHomeMapsBinding;

public class HomeMapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityHomeMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHomeMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        findViewById(R.id.btnShowAll).setOnClickListener(view->{
            Intent intent = new Intent(this,DonorListActivity.class);
            startActivity(intent);
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng a1 = new LatLng(32.6355326, 74.1604138);
        LatLng a2 = new LatLng(32.6351129, 74.1608418);
        LatLng a3 = new LatLng(32.6359224, 74.1601668);
        LatLng a4 = new LatLng(32.6354922, 74.1605938);
        LatLng a5 = new LatLng(32.6364922, 74.1615938);
        LatLng a6 = new LatLng(32.6334922, 74.1615938);
        mMap.addMarker(new MarkerOptions().position(a1).title("B-"));
        mMap.addMarker(new MarkerOptions().position(a2).title("A+"));
        mMap.addMarker(new MarkerOptions().position(a3).title("O-"));
        mMap.addMarker(new MarkerOptions().position(a4).title("O+"));
        mMap.addMarker(new MarkerOptions().position(a5).title("AB+"));
        mMap.addMarker(new MarkerOptions().position(a6).title("A+"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(a1));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(a1,17f));


    }
}