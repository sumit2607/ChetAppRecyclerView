package com.example.we_part;

public class SenderModel extends BsseModel {

    private String message;

    public SenderModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    int getViewType() {
        return 0;
    }
}
