package com.example.recuclerview1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarViewHolder extends RecyclerView.ViewHolder {
    private final TextView tvCar;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCar = itemView.findViewById(R.id.tv_car);
    }

    public void bind(String car) {
        tvCar.setText(car);
    }
}
