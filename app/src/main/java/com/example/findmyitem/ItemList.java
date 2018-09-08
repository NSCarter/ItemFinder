package com.example.findmyitem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ItemList extends AppCompatActivity{

    private List<Item> itemList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ItemListAdapter mAdapter;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        mAdapter = new ItemListAdapter(itemList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        prepareItemListData();
    }

    private void prepareItemListData() {
        //Item item = new Item(//Info name, description, picture
        //itemList.add(item);

        mAdapter.notifyDataSetChanged();
    }
}
