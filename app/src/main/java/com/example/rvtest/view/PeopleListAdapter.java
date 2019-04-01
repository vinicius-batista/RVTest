package com.example.rvtest.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rvtest.R;
import com.example.rvtest.data.DAOPerson;
import com.example.rvtest.data.Person;

import java.util.ArrayList;

public class PeopleListAdapter extends RecyclerView.Adapter<PeopleListViewHolder> {
    private ArrayList<Person> peopleList;
    private PersonListener listener;
    private int countCreate;

    public PeopleListAdapter (PersonListener listener) {
        this.peopleList = DAOPerson.getINSTANCE().getPeople();
        this.listener = listener;
        this.countCreate = 0;
    }

    public interface PersonListener {
        void onClickPersonListener(Person p);
    }

    @NonNull
    @Override
    public PeopleListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.view_holder_people_list, viewGroup, false);
        PeopleListViewHolder peopleListViewHolder = new PeopleListViewHolder(view, this.listener);
        return peopleListViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleListViewHolder peopleListViewHolder, int i) {
        peopleListViewHolder.bind(this.peopleList.get(i));
    }

    @Override
    public int getItemCount() {
        return this.peopleList.size();
    }
}
