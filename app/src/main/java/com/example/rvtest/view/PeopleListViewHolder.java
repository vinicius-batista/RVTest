package com.example.rvtest.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.rvtest.R;
import com.example.rvtest.data.Person;

public class PeopleListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private TextView txtName;
    private TextView txtAge;
    private TextView txtSsn;
    private Person person;
    private PeopleListAdapter.PersonListener listener;

    public PeopleListViewHolder(@NonNull View itemView, PeopleListAdapter.PersonListener listener) {
        super(itemView);
        this.txtName = (TextView) itemView.findViewById(R.id.txtName);
        this.txtAge = (TextView) itemView.findViewById(R.id.txtAge);
        this.txtSsn = (TextView) itemView.findViewById(R.id.txtSsn);
        this.listener = listener;
        itemView.setOnClickListener(this);
    }

    public void bind (Person p) {
        this.txtName.setText(p.getName());
        this.txtAge.setText(Integer.toString(p.getAge()));
        this.txtSsn.setText(p.getSsn());
        this.person = p;
    }

    @Override
    public void onClick(View v) {
        listener.onClickPersonListener(this.person);
    }
}
