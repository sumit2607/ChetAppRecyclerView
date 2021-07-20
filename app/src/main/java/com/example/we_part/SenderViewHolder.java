package com.example.we_part;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SenderViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvSenderMessage;

    public SenderViewHolder(@NonNull View itemView) {
        super(itemView);
        intidviews(itemView);
    }

    private void intidviews(View itemView) {
        mTvSenderMessage = itemView.findViewById(R.id.tvSenderMessage);

    }

    public void setData(SenderModel senderModel){
        mTvSenderMessage.setText(senderModel.getMessage());

    }
}
