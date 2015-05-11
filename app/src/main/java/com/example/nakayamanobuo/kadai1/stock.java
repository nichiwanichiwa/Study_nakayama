package com.example.nakayamanobuo.kadai1;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.DialogInterface;
//import android.support.v7.app.ActionBarActivity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class stock extends Activity {
    final String TAG = "stock";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock);

        //イメージボタンを押された時の動き
        ImageButton btn = (ImageButton) findViewById(R.id.gas);
        btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                //アラートダイアログの出力
                AlertDialog.Builder gas_alert;
                gas_alert = new AlertDialog.Builder(stock.this);
                gas_alert.setTitle("ガスコンロ");

                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw = inflater.inflate(R.layout.activity_popup_1, null);


                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("ga", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.gasText);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                int a = adult.getInt("adult", 0);
                int c = child.getInt("child",0);
                int b = baby.getInt("baby",0);

                String a_str = "大人"+String.valueOf(a)+"人";
                String c_str = "子供"+String.valueOf(c)+"人";
                String b_str = "幼児"+String.valueOf(b)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                EditText child_et = (EditText)viw.findViewById(R.id.child);
                EditText baby_et = (EditText)viw.findViewById(R.id.baby);

                adult_et.setText(a_str);
                child_et.setText(c_str);
                baby_et.setText(b_str);


                gas_alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                       SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        EditText et = (EditText) viw.findViewById(R.id.gasText);
                        String str = et.getText().toString();

                        if(str.length() <= 0){
                            str = "0";
                        }

                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("ga",i);
                       // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });
                gas_alert.setView(viw);
                gas_alert.show();
            }
        });

        //イメージボタンを押された時の動き
        ImageButton btnmatti = (ImageButton) findViewById(R.id.matti);
        btnmatti.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("マッチ・ライター");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_popup_2, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("matti", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.fireText);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                int a = adult.getInt("adult", 0);
                int c = child.getInt("child",0);
                int b = baby.getInt("baby",0);

                String a_str = "大人"+String.valueOf(a)+"人";
                String c_str = "子供"+String.valueOf(c)+"人";
                String b_str = "幼児"+String.valueOf(b)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                EditText child_et = (EditText)viw.findViewById(R.id.child);
                EditText baby_et = (EditText)viw.findViewById(R.id.baby);

                adult_et.setText(a_str);
                child_et.setText(c_str);
                baby_et.setText(b_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        EditText et = (EditText) viw.findViewById(R.id.fireText);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("matti",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnbomb = (ImageButton) findViewById(R.id.bombe);
        btnbomb.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("ガスボンベ");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_popup_3, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("bomb", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.bombText);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                int a = adult.getInt("adult", 0);
                int c = child.getInt("child",0);
                int b = baby.getInt("baby",0);

                String a_str = "大人"+String.valueOf(a)+"人";
                String c_str = "子供"+String.valueOf(c)+"人";
                String b_str = "幼児"+String.valueOf(b)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                EditText child_et = (EditText)viw.findViewById(R.id.child);
                EditText baby_et = (EditText)viw.findViewById(R.id.baby);

                adult_et.setText(a_str);
                child_et.setText(c_str);
                baby_et.setText(b_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        EditText et = (EditText) viw.findViewById(R.id.bombText);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("bomb",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnhue = (ImageButton) findViewById(R.id.hue);
        btnhue.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("笛");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_popup_4, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("hue", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.hueText);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                int a = adult.getInt("adult", 0);
                int c = child.getInt("child",0);
                int b = baby.getInt("baby",0);

                String a_str = "大人"+String.valueOf(a)+"人";
                String c_str = "子供"+String.valueOf(c)+"人";
                String b_str = "幼児"+String.valueOf(b)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                EditText child_et = (EditText)viw.findViewById(R.id.child);
                EditText baby_et = (EditText)viw.findViewById(R.id.baby);

                adult_et.setText(a_str);
                child_et.setText(c_str);
                baby_et.setText(b_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        EditText et = (EditText) viw.findViewById(R.id.hueText);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("hue",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnsitagi = (ImageButton) findViewById(R.id.sitagi);
        btnsitagi.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("下着");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_popup_5, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("sitagi", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.sitagiText);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                int a = adult.getInt("adult", 0);
                int c = child.getInt("child",0);
                int b = baby.getInt("baby",0);

                String a_str = "大人"+String.valueOf(a)+"人";
                String c_str = "子供"+String.valueOf(c)+"人";
                String b_str = "幼児"+String.valueOf(b)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                EditText child_et = (EditText)viw.findViewById(R.id.child);
                EditText baby_et = (EditText)viw.findViewById(R.id.baby);

                adult_et.setText(a_str);
                child_et.setText(c_str);
                baby_et.setText(b_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        EditText et = (EditText) viw.findViewById(R.id.sitagiText);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("sitagi",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnthissyu = (ImageButton) findViewById(R.id.thissyu);
        btnthissyu.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("ティッシュ");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_popup_6, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("thissyu", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.thissyuText);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                int a = adult.getInt("adult", 0);
                int c = child.getInt("child",0);
                int b = baby.getInt("baby",0);

                String a_str = "大人"+String.valueOf(a)+"人";
                String c_str = "子供"+String.valueOf(c)+"人";
                String b_str = "幼児"+String.valueOf(b)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                EditText child_et = (EditText)viw.findViewById(R.id.child);
                EditText baby_et = (EditText)viw.findViewById(R.id.baby);

                adult_et.setText(a_str);
                child_et.setText(c_str);
                baby_et.setText(b_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        EditText et = (EditText) viw.findViewById(R.id.thissyuText);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("thissyu",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnalmi = (ImageButton) findViewById(R.id.arumi);
        btnalmi.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("アルミホイル");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_popup_7, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("almi", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.almiText);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                int a = adult.getInt("adult", 0);
                int c = child.getInt("child",0);
                int b = baby.getInt("baby",0);

                String a_str = "大人"+String.valueOf(a)+"人";
                String c_str = "子供"+String.valueOf(c)+"人";
                String b_str = "幼児"+String.valueOf(b)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                EditText child_et = (EditText)viw.findViewById(R.id.child);
                EditText baby_et = (EditText)viw.findViewById(R.id.baby);

                adult_et.setText(a_str);
                child_et.setText(c_str);
                baby_et.setText(b_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        EditText et = (EditText) viw.findViewById(R.id.almiText);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("almi",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btngunnte = (ImageButton) findViewById(R.id.gunnte);
        btngunnte.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(stock.this);
                alert.setTitle("軍手");
                LayoutInflater inflater = LayoutInflater.from(stock.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_popup_8, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("gunnte", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.gunnteText);

                //はいっちゃう
                et.setText(str);

                //大人子供幼児
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);


                int a = adult.getInt("adult", 0);
                int c = child.getInt("child",0);
                int b = baby.getInt("baby",0);

                String a_str = "大人"+String.valueOf(a)+"人";
                String c_str = "子供"+String.valueOf(c)+"人";
                String b_str = "幼児"+String.valueOf(b)+"人";


                EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                EditText child_et = (EditText)viw.findViewById(R.id.child);
                EditText baby_et = (EditText)viw.findViewById(R.id.baby);

                adult_et.setText(a_str);
                child_et.setText(c_str);
                baby_et.setText(b_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        EditText et = (EditText) viw.findViewById(R.id.gunnteText);
                        String str = et.getText().toString();
                        if(str.length() <= 0){
                            str = "0";
                        }
                        int i = Integer.parseInt(str);

                        Editor e = prefs.edit();
                        e.putInt("gunnte",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        Button btnDisp = (Button)findViewById(R.id.setting_Button);
        btnDisp.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.nakayamanobuo.kadai1","com.example.nakayamanobuo.kadai1.setting");
                startActivity(intent);
            }
        });
        Button btnfood = (Button)findViewById(R.id.foodButton);
        btnfood.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.nakayamanobuo.kadai1","com.example.nakayamanobuo.kadai1.food");
                startActivity(intent);
            }
        });
        Button btnhome = (Button)findViewById(R.id.homeButton);
        btnhome.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.nakayamanobuo.kadai1","com.example.nakayamanobuo.kadai1.MainActivity");
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_stock, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
