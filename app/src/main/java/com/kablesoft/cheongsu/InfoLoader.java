package com.kablesoft.cheongsu;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TabHost;
import android.widget.Toast;

import java.util.Calendar;


public class InfoLoader extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_main);
        TabHost thx=(TabHost)findViewById(R.id.info_tab);
        thx.setup();

        TabHost.TabSpec sp1=thx.newTabSpec("tab1");
        sp1.setIndicator(getString(R.string.tab1));
        sp1.setContent(R.id.ttab1);
        thx.addTab(sp1);
        TabHost.TabSpec sp2=thx.newTabSpec("tab2");
        sp2.setIndicator(getString(R.string.tab2));
        sp2.setContent(R.id.ttab2);
        thx.addTab(sp2);
        TabHost.TabSpec sp3=thx.newTabSpec("tab3");
        sp3.setIndicator(getString(R.string.tab3));
        sp3.setContent(R.id.ttab3);
        thx.addTab(sp3);
    }
}