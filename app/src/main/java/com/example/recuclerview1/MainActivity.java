package com.example.recuclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final ArrayList carList = new ArrayList();
    private final CarAdapter adapter = new CarAdapter(carList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rvCar = findViewById(R.id.recycler_view);
        loadCarsData();
        rvCar.setAdapter(adapter);
    }

    private void loadCarsData() {
        carList.add("Toyota");
        carList.add("Subaru");
        carList.add("Bugatti");
        carList.add("Nissan");
        carList.add("Ford");
        carList.add("Lexus");
        carList.add("Audi");
        carList.add("BMW");
        carList.add("Mercedes");
        carList.add("Chevrolet");
        carList.add("Cadillac");
        carList.add("Honda");
        carList.add("Jaguar");
        carList.add("Kia");
        carList.add("Lincoln");
        carList.add("Mazda");
        carList.add("Mini");
        carList.add("Mclaren");
        carList.add("Porsche");
        carList.add("Vaz");

    }

}