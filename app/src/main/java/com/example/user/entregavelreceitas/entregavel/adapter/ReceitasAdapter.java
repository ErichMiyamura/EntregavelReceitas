package com.example.user.entregavelreceitas.entregavel.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.entregavelreceitas.R;
import com.example.user.entregavelreceitas.entregavel.Model.Receitas;

import java.util.ArrayList;

public class ReceitasAdapter extends RecyclerView.Adapter<ReceitasAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Receitas> mList;

    public ReceitasAdapter(Context context, ArrayList<Receitas> list){
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        View view = layoutInflater.inflate(R.layout.receita_items, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Receitas receitaItems = mList.get(position);
        ImageView image = holder.item_image;
        TextView name,place;

        name = holder.item_name;
        place = holder.item_place;

        image.setImageResource(receitaItems.getImage());

        name.setText(receitaItems.getName());
        place.setText(receitaItems.getPlace());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView item_image;
        TextView item_name, item_place;

        public ViewHolder(View itemView) {
            super(itemView);

            item_image = itemView.findViewById(R.id.japanese_food);
            item_name = itemView.findViewById(R.id.item_name);
            item_place = itemView.findViewById(R.id.item_place);
        }
    }
}
