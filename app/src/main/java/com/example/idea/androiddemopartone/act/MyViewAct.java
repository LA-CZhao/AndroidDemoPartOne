package com.example.idea.androiddemopartone.act;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.idea.androiddemopartone.R;
import com.example.idea.androiddemopartone.adapter.HomeListAdapter;
import com.example.idea.androiddemopartone.utils.ActUtils;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MyViewAct extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Bind(R.id.myView_list)
    ListView myView_list;

    private String[] titles = {"开飞机离开都是附近的考虑是否"};
    private HomeListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_view);
        ButterKnife.bind(this);

        initView();

    }

    private void initView() {


        adapter=new HomeListAdapter(this,titles);
        myView_list.setAdapter(adapter);

        myView_list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch(position){
            case 0:
                ActUtils.toMyView01(this,false);
                break;
            default:
                break;
        }
    }
}
