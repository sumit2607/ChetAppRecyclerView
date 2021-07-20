package com.example.we_part;

public class RecieverModel extends BsseModel {
    private String receiverMessage;

    public RecieverModel(String receiverMessage) {
        this.receiverMessage = receiverMessage;
    }

    public String getReceiverMessage() {
        return receiverMessage;
    }

    @Override
    int getViewType() {
        return 1;
    }
}
