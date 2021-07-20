package com.example.we_part;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EditText mEtOption;
    private EditText mEtSendMessage;
    private ImageView mIvSend;
    private ArrayList<BsseModel> messagelist = new ArrayList<>();
    private ChatAdapter chatAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intidview();
        //buildview();
        setview();
    }

    private void setview() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        chatAdapter = new ChatAdapter(messagelist);
        recyclerView.setAdapter(chatAdapter);
    }

    private void buildview() {

        if (mEtOption.getText().toString().equals("1")) {
            messagelist.add(new SenderModel(mEtSendMessage.getText().toString()));
        } else if (mEtOption.getText().toString().equals("0")) {
            messagelist.add(new RecieverModel(mEtSendMessage.getText().toString()));
        }
        chatAdapter.notifyDataSetChanged();
    }

    private void intidview() {
        recyclerView = findViewById(R.id.recyclerView);
        mEtOption = findViewById(R.id.etChoice);
        mEtSendMessage = findViewById(R.id.etSendMessage);
        mIvSend = findViewById(R.id.ivSend);
        mIvSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buildview();
            }
        });
    }
}