package com.example.wecare;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    ArrayList<User> userArrayList;

    public MainAdapter(ArrayList<User> userArrayList) {
        this.userArrayList = userArrayList;
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_people_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainAdapter.ViewHolder holder, int position) {
        holder.Name.setText(userArrayList.get(position).getName());
        holder.Age.setText(userArrayList.get(position).getAge());
        holder.Gender.setText(userArrayList.get(position).getGender());
        holder.Bloodtype.setText(userArrayList.get(position).getBloodtype());
    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView Name;
        public TextView Age;
        public TextView Bloodtype;
        public TextView Gender;

        public ViewHolder(View itemView) {
            super(itemView);
            Name = (TextView) itemView.findViewById(R.id.textView8);
            Name = (TextView) itemView.findViewById(R.id.textView9);
            Age = (TextView) itemView.findViewById(R.id.textView10);
            Bloodtype = (TextView) itemView.findViewById(R.id.textView14);
            Gender = (TextView) itemView.findViewById(R.id.textView15);
        }
    }
}
