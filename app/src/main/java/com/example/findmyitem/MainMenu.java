package com.example.findmyitem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void openAddForm (View view)
    {
        Intent intent = new Intent(this, AddForm.class);
        startActivity(intent);
    }

    public void openItemList (View view)
    {
        Intent intent = new Intent(this, ItemList.class);
        startActivity(intent);
    }
}
