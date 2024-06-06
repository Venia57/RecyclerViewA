package com.veniaaurilia.recyclerviewa;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NegaraViewHolder extends RecyclerView.ViewHolder
{
    public ImageView _imageView1;
    public TextView _deskripsiTextView;
    public TextView _namaTextView;
    public NegaraViewHolder(@NonNull View itemView) {
        super(itemView);

        _imageView1 = (ImageView)itemView.findViewById(R.id.imageView1);
        _namaTextView = (TextView)itemView.findViewById(R.id.namaTextview);
        _deskripsiTextView =(TextView)itemView.findViewById(R.id.deskripsiTextView);

    }
}
