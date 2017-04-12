package com.kablesoft.cheongsu;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private WebView mWebView;
    private WebView mHome;
    private WebView mgyoga;
    private ImageView mschool;
    private AdView mMoney1;
    private AdView mMoney2;
    private AdView mMoney3;
    private static final String TAG = "MainActivity";
    URL myFileUrl = null;
    FileOutputStream fos = null;
    HttpURLConnection conn = null;
    String strColor = "#000000";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);
        startActivity(new Intent(this, SplashActivity.class));
        ImageView picschool = (ImageView) findViewById(R.id.main_pic);
        TabHost th = (TabHost) findViewById(R.id.main_tab);
        th.setup();
        TabHost.TabSpec sp1 = th.newTabSpec("tab1");
        sp1.setIndicator(getString(R.string.ttab1));
        sp1.setContent(R.id.tab1);
        th.addTab(sp1);
        TabHost.TabSpec sp2 = th.newTabSpec("tab2");
        sp2.setIndicator(getString(R.string.ttab2));
        sp2.setContent(R.id.tab2);
        th.addTab(sp2);
        TabHost.TabSpec sp3 = th.newTabSpec("tab3");
        sp3.setIndicator(getString(R.string.ttab3));
        sp3.setContent(R.id.tab3);
        th.addTab(sp3);

        mMoney1 = (AdView) findViewById(R.id.money1);
        mMoney2 = (AdView) findViewById(R.id.money2);
        mMoney3 = (AdView) findViewById(R.id.money3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mMoney1.loadAd(adRequest);
        mMoney2.loadAd(adRequest);
        mMoney3.loadAd(adRequest);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alert_confirm = new AlertDialog.Builder(MainActivity.this);
        alert_confirm.setMessage("앱을 종료하시겠습니까?").setTitle("앱 종료").setCancelable(false).setPositiveButton("확인",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // 'YES'
                        moveTaskToBack(true);
                        finish();
                        android.os.Process.killProcess(android.os.Process.myPid());
                    }
                }).setNegativeButton("취소",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // 'No'
                        return;
                    }
                });
        AlertDialog alert = alert_confirm.create();
        alert.show();
        }
    public void bapload(View view){
        startActivity(new Intent(this, bapact.class));
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_right);
    }
    public void diload(View view){
        startActivity(new Intent(this, diloader.class));
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_right);
    }
    public void notyload(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ccs.caehs.kr/boardCnts/list.do?boardID=120235&m=0201&s=ccs"));
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_right);
        startActivity(intent);
    }
    public void info_tab(View view){
        startActivity(new Intent(this, InfoLoader.class));
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_right);
    }
    public void congo(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ccs.caehs.kr/"));
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_right);
        startActivity(intent);
    }
    public void waytogo(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://naver.me/xqrtfiOM"));
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_right);
        startActivity(intent);
    }
        public void callsch(View view){
            AlertDialog.Builder alert_confirm = new AlertDialog.Builder(MainActivity.this);
            alert_confirm.setMessage("장난전화를 걸지 마세요").setTitle("학교로 전화걸기").setCancelable(false).setPositiveButton("행정실",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // 'YES'
                            Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:041-590-7100"));
                            startActivity(intent);
                        }
                    }).setNegativeButton("교무실",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // 'No'
                            Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:041-590-7110"));
                            startActivity(intent);
                        }
                    }).setNeutralButton("취소",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // 'No'
                            return;
                        }
                    });
            AlertDialog alert = alert_confirm.create();
            alert.show();
        }

}
// startActivity(new Intent(this,UpdateLogDialog.class));