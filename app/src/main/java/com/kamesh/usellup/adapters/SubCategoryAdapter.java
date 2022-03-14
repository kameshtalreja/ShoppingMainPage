package com.kamesh.usellup.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kamesh.usellup.R;

public class SubCategoryAdapter extends RecyclerView.Adapter<SubCategoryAdapter.SubCategoryViewHolder>{

    Context context;

    public SubCategoryAdapter(Context context){
        this.context = context;
    }
    @NonNull
    @Override
    public SubCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_sub_category_card,parent,false);
        return new SubCategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubCategoryViewHolder holder, int position) {
        holder.tvTitle.setText(context.getString(R.string.category)+position);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class SubCategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        public SubCategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvCategoryTitle);
        }
    }
}
