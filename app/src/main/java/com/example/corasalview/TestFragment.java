package com.example.corasalview;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class TestFragment extends Fragment {
    private TextView title;
    private RelativeLayout card;
    int col[] = {Color.BLUE, Color.GREEN, Color.RED, Color.YELLOW, Color.CYAN};

    public static TestFragment newInstance(String content, Context c) {

        TestFragment fragment = new TestFragment();

        fragment.mContent = content;
        return fragment;
    }

    private String mContent = "???";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup Rootview = (ViewGroup) inflater.inflate(R.layout.item,
                container, false);
        return Rootview;
    }
}
