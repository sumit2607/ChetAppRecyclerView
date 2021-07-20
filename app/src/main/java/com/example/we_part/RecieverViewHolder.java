package com.example.we_part;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecieverViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvRecieverSendMessage;

    public RecieverViewHolder(@NonNull View itemView) {
        super(itemView);
        intidviews(itemView);
    }

    private void intidviews(View itemView) {
        mTvRecieverSendMessage = itemView.findViewById(R.id.tvReceiverMessage);

    }

    public void setData(RecieverModel recieverModel){
        mTvRecieverSendMessage.setText(recieverModel.getReceiverMessage());

    }
}
