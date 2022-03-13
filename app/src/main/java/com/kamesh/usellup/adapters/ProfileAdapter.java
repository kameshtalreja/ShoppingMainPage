package com.kamesh.usellup.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kamesh.usellup.R;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>{

    Context context;

    public ProfileAdapter(Context context){
        this.context = context;
    }
    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_profile_card,parent,false);
        return new ProfileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {
        holder.tvTitle.setText(context.getString(R.string.category)+position);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ProfileViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        public ProfileViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvPersonName);
        }
    }
}
