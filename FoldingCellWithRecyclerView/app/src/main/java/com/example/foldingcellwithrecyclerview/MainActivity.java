package com.example.foldingcellwithrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rcvItems = findViewById(R.id.rcv_item);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvItems.setLayoutManager(linearLayoutManager);

        ItemAdapter itemAdapter =  new ItemAdapter();
        itemAdapter.setData(getListItems());
        rcvItems.setAdapter(itemAdapter);
    }

    private List<ItemObject> getListItems() {
        List<ItemObject> list = new ArrayList<>();
        for (int i = 0 ; i < 20 ; i++) {
            list.add(new ItemObject("Title Item " + i , "Content item " + i));
        }
        return list;
    }
}