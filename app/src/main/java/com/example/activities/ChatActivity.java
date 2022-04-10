package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.R;
import com.example.activities.models.User;
import com.example.activities.utilities.Constants;
import com.example.databinding.ActivityChatBinding;

public class ChatActivity extends AppCompatActivity {
    private ActivityChatBinding binding;
    private User receiverUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
        loadReceiverDetails();

    }
    private void loadReceiverDetails(){
        receiverUser = (User) getIntent().getSerializableExtra(Constants.KEY_USER);
        binding.textName.setText(receiverUser.name);//
    }

    private void setListeners(){
        binding.imageBack.setOnClickListener( view -> onBackPressed());
        //binding.imageBack.setOnClickListener(v -> onBackPressed());
    }
}