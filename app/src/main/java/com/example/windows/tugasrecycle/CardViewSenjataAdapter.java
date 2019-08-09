package com.example.windows.tugasrecycle;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewSenjataAdapter extends RecyclerView.Adapter<CardViewSenjataAdapter.CardViewHolder> {

        private ArrayList<Senjata> listSenjata;
        public CardViewSenjataAdapter(ArrayList<Senjata> list) {
            this.listSenjata = list;
        }


    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_senjata, viewGroup, false);
            return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewHolder holder, int position) {
            Senjata senjata =listSenjata.get(position);

        Glide.with(holder.itemView.getContext())
                .load(senjata.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPhoto);
        holder.tvName.setText(senjata.getName());
        holder.tvFrom.setText(senjata.getFrom());
        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(), "Favorite" +
                        listSenjata.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_LONG).show();
            }
        });
        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(), "Share" +
                        listSenjata.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_LONG).show();
            }
        });



    }

    @Override
    public int getItemCount() {
        return listSenjata.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvFrom;
        Button btnFavorite, btnShare;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvFrom = itemView.findViewById(R.id.tv_item_from);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }
}
