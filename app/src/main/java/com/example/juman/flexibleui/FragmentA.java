package com.example.juman.flexibleui;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Juman on 5/5/2016.
 */
public class FragmentA extends Fragment implements AdapterView.OnItemClickListener{

    ListView listView;
    Communicator communicator;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        listView = (ListView) view.findViewById(R.id.listView);
        communicator = (Communicator) getActivity();
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.chapter,
                android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int index, long id) {
            communicator.respond(index);
    }


}
