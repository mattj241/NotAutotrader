package com.android.london.notautotrader;


import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.london.notautotrader.Models.Listing;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;


public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.MyViewHolder> {

    private List<Listing> results;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView profilePic;
        private TextView header, miles, price;

        public MyViewHolder(View view) {
            super(view);
            profilePic = view.findViewById(R.id.CarPic);
            header = view.findViewById(R.id.Header);
            miles = view.findViewById(R.id.Miles);
            price = view.findViewById(R.id.Price);
        }
    }

    public TaskAdapter(List<Listing> results, Context context) {
        this.results = results;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycleview_result, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Listing result = results.get(position);
        String customHeader = context.getResources().getString(R.string.holderHeader,
                result.getBuild().getYear().toString(),
                result.getBuild().getMake(),
                result.getBuild().getModel(),
                ""/*result.getBuild().getTrim()*/);

        holder.header.setText(customHeader);
        String formattedPrice = result.getPrice().toString();
        if (formattedPrice.contains(".0")){
            formattedPrice = formattedPrice.replace(".0", "");
            formattedPrice = "$"+formattedPrice;
        }
        holder.price.setText(formattedPrice);
        try
        {
            String formattedMiles = result.getMiles().toString();
            if (formattedMiles.contains(".0")){
                formattedMiles = formattedMiles.replace(".0", "");
            }
            formattedMiles += " miles";
            holder.miles.setText(formattedMiles);
        }
        catch ( NullPointerException e ){
            holder.miles.setText("No miles!");
        }

        List<String> photoLinks = result.getMedia().getPhotoLinks();
        if (!photoLinks.isEmpty()){
            Picasso.get().load(photoLinks.get(0)).into(holder.profilePic);
        }
        else {
            holder.profilePic.setImageResource(R.mipmap.noimage);
        }
    }

    @Override
    public int getItemCount() {
        return results.size();
    }


}


