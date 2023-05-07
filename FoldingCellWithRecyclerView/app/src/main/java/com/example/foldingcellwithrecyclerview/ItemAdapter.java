package com.example.foldingcellwithrecyclerview;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.ramotion.foldingcell.FoldingCell;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private List<ItemObject> mListItems;

    @SuppressLint("NotifyDataSetChanged")
    public void setData(List<ItemObject> list) {
        this.mListItems = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        final  ItemObject itemObject = mListItems.get(position);
        if(itemObject == null){
            return;
        }
        holder.tvTitle.setText(itemObject.getTitle());
        holder.tvContent.setText(itemObject.getContent());

        holder.foldingCell.setOnClickListener(v -> holder.foldingCell.toggle(false));

        holder.tvTitle.setOnClickListener(v -> Toast.makeText(v.getContext(),itemObject.getTitle(), Toast.LENGTH_SHORT).show());

        holder.tvContent.setOnClickListener(v -> Toast.makeText(v.getContext(),itemObject.getContent(), Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        if(mListItems != null) {
            return mListItems.size();
        }
        return 0;
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {

        private final FoldingCell foldingCell;
        private final TextView tvTitle;
        private final TextView tvContent;

        public ItemViewHolder(View itemView) {
            super(itemView);

            foldingCell = itemView.findViewById(R.id.folding_cell);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvContent = itemView.findViewById(R.id.tv_content);

        }
    }
}
