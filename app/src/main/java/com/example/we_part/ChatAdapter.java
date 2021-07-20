package com.example.we_part;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<BsseModel> bsseModelArrayList;

    public ChatAdapter(ArrayList<BsseModel> bsseModelArrayList) {
        this.bsseModelArrayList = bsseModelArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case 0:
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sender_item_layout, parent, false);
                return new SenderViewHolder(view);

            case 1:
                View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.receiver_item_layout, parent, false);
                return new RecieverViewHolder(view1);

        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        int viewType = bsseModelArrayList.get(position).getViewType();
        switch (viewType) {
            case 0:
                if (holder instanceof SenderViewHolder) {
                    ((SenderViewHolder) holder).setData((SenderModel) bsseModelArrayList.get(position));
                }
                break;
            case 1:
                if(holder instanceof RecieverViewHolder){
                    ((RecieverViewHolder) holder).setData((RecieverModel) bsseModelArrayList.get(position));
                }
                break;
        }

    }

    @Override
    public int getItemViewType(int position) {

        return bsseModelArrayList.get(position).getViewType();

    }

    @Override
    public int getItemCount() {
        return bsseModelArrayList.size();
    }
}
