package com.appsfromholland.georgebush;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GWBAdapter extends RecyclerView.Adapter<GWBAdapter.GWBViewHolder> {

    private ArrayList<GeorgeBush> dataset;

    // Constructor
    public GWBAdapter(ArrayList<GeorgeBush> dataset) {
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public GWBViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        //View view = inflater.inflate(R.layout.gwb_row, viewGroup, false);
        View view = inflater.inflate(R.layout.gbw_row_ll, viewGroup, false);
        return new GWBViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GWBViewHolder holder, int i) {

        final GeorgeBush gwb = dataset.get(i);
        holder.name.setText(gwb.getName());

        int resid = holder.itemView.getResources().getIdentifier(
                gwb.getImageUrl(),
                "drawable",
                holder.itemView.getContext().getPackageName()
        );
        holder.avatar.setImageResource(resid);
    }

    @Override
    public int getItemCount() {
        //return 0;
        return this.dataset.size();
    }

    public class GWBViewHolder extends RecyclerView.ViewHolder {

        public ImageView avatar;
        public TextView name;
        public View layout;

        // Dit is een rij in de recycler view
        public GWBViewHolder(@NonNull View itemView) {
            super(itemView);
            this.layout = itemView;

            this.avatar = itemView.findViewById(R.id.gwb_avatar);
            this.name = itemView.findViewById(R.id.gwb_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(
                            view.getContext(),
                            GeorgeBushDetailedActivity.class);
                    Log.i("POSITION", "" + GWBViewHolder.super.getAdapterPosition());

                    // Get GWB object waarop is geclicked
                    GeorgeBush gwb = dataset.get(GWBViewHolder.super.getAdapterPosition());
                    intent.putExtra("GWB_OBJECT", gwb);

                    // Start de nieuwe activity
                    view.getContext().startActivity(intent);
                }
            });
        }


    }

}
