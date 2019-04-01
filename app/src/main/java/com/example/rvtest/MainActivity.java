package com.example.rvtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.rvtest.data.DummyData;
import com.example.rvtest.data.Person;
import com.example.rvtest.view.PeopleListAdapter;

public class MainActivity extends AppCompatActivity implements PeopleListAdapter.PersonListener{

    private RecyclerView rvPeopleList;
    private PeopleListAdapter peopleListAdapter;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DummyData.generate();

        rvPeopleList = (RecyclerView) findViewById(R.id.rvPeopleList);
        rvPeopleList.setLayoutManager(new LinearLayoutManager(this));
        rvPeopleList.setHasFixedSize(true);

        peopleListAdapter = new PeopleListAdapter(this);
        rvPeopleList.setAdapter(peopleListAdapter);


    }

    @Override
    public void onClickPersonListener(Person p) {
        if (this.toast != null) {
            toast.cancel();
        }
        this.toast = Toast.makeText(this, p.getLastName(), Toast.LENGTH_SHORT);
        this.toast.show();
    }
}
