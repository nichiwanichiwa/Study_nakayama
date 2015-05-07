package com.example.nakayamanobuo.kadai1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.view.WindowManager;

public class setting extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_setting);
        this.getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
        SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
        SharedPreferences limit = getSharedPreferences("limit", MODE_PRIVATE);
        SharedPreferences setting = getSharedPreferences("setting", MODE_PRIVATE);
        SharedPreferences baby = getSharedPreferences("baby", MODE_PRIVATE);

        int a = 0;
        int c = 0;
        int l = 0;
        int s = 0;
        int b = 0;

        a = adult.getInt("adult", a);
        c = child.getInt("child",c);
        l = limit.getInt("limit", l);
        s = setting.getInt("setting",s);
        b = baby.getInt("baby",b);

        String adult_str = String.valueOf(a);
        String child_str = String.valueOf(c);
        String limit_str = String.valueOf(l);
        String setting_str = String.valueOf(s);
        String baby_str = String.valueOf(b);


        //必ずView変数で生成したデータを使うこと
        EditText adult_et = (EditText)findViewById(R.id.adultText);
        EditText child_et = (EditText)findViewById(R.id.child);
        EditText limit_et = (EditText)findViewById(R.id.limit);
        EditText setting_et = (EditText)findViewById(R.id.setting);
        EditText baby_et = (EditText)findViewById(R.id.babyText);


        //はいっちゃう
        adult_et.setText(adult_str);
        child_et.setText(child_str);
        limit_et.setText(limit_str);
        setting_et.setText(setting_str);
        baby_et.setText(baby_str);


        Button btnDisp = (Button)findViewById(R.id.home);
        btnDisp.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                SharedPreferences adult =getSharedPreferences("adult",MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences limit = getSharedPreferences("limit", MODE_PRIVATE);
                SharedPreferences setting = getSharedPreferences("setting", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby", MODE_PRIVATE);


                EditText adult_et = (EditText) findViewById(R.id.adultText);
                EditText child_et = (EditText)findViewById(R.id.child);
                EditText limit_et = (EditText)findViewById(R.id.limit);
                EditText setting_et = (EditText)findViewById(R.id.setting);
                EditText baby_et = (EditText)findViewById(R.id.babyText);

                String adult_str = adult_et.getText().toString();
                String child_str = child_et.getText().toString();
                String limit_str = limit_et.getText().toString();
                String setting_str = setting_et.getText().toString();
                String baby_str = baby_et.getText().toString();


                int a = Integer.parseInt(adult_str);
                int c = Integer.parseInt(child_str);
                int l = Integer.parseInt(limit_str);
                int s = Integer.parseInt(setting_str);
                int b = Integer.parseInt(baby_str);

              /*if(adult_et.length() <= 0&&child_et.length() <= 0 && limit_et.length() <= 0 &&
                      setting_et.length() <= 0 && baby_et.length() <= 0){
                    AlertDialog.Builder alart;
                    alart = new AlertDialog.Builder(setting.this);
                    alart.setMessage("数字を入力してください");
                    alart.show();

               }
               else {            */


                    SharedPreferences.Editor adult_e = adult.edit();
                    SharedPreferences.Editor child_e = child.edit();
                    SharedPreferences.Editor limit_e = limit.edit();
                    SharedPreferences.Editor setting_e = setting.edit();
                    SharedPreferences.Editor baby_e = baby.edit();


                    adult_e.putInt("adult", a);
                    child_e.putInt("child", c);
                    limit_e.putInt("limit", l);
                    setting_e.putInt("setting", s);
                    baby_e.putInt("baby", b);

                    adult_e.commit();
                    child_e.commit();
                    limit_e.commit();
                    setting_e.commit();
                    baby_e.commit();

                    // Sub 画面を起動
                    Intent intent = new Intent();
                    intent.setClassName("com.example.nakayamanobuo.kadai1", "com.example.nakayamanobuo.kadai1.MainActivity");
                    startActivity(intent);
                }
          // }
        });

        Button btnstock = (Button)findViewById(R.id.stockButton);
        btnstock.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                SharedPreferences adult =getSharedPreferences("adult",MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences limit = getSharedPreferences("limit", MODE_PRIVATE);
                SharedPreferences setting = getSharedPreferences("setting", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby", MODE_PRIVATE);


                EditText adult_et = (EditText) findViewById(R.id.adultText);
                EditText child_et = (EditText)findViewById(R.id.child);
                EditText limit_et = (EditText)findViewById(R.id.limit);
                EditText setting_et = (EditText)findViewById(R.id.setting);
                EditText baby_et = (EditText)findViewById(R.id.babyText);

                String adult_str = adult_et.getText().toString();
                String child_str = child_et.getText().toString();
                String limit_str = limit_et.getText().toString();
                String setting_str = setting_et.getText().toString();
                String baby_str = baby_et.getText().toString();


                int a = Integer.parseInt(adult_str);
                int c = Integer.parseInt(child_str);
                int l = Integer.parseInt(limit_str);
                int s = Integer.parseInt(setting_str);
                int b = Integer.parseInt(baby_str);

                SharedPreferences.Editor adult_e = adult.edit();
                SharedPreferences.Editor child_e = child.edit();
                SharedPreferences.Editor limit_e = limit.edit();
                SharedPreferences.Editor setting_e = setting.edit();
                SharedPreferences.Editor baby_e = baby.edit();


                adult_e.putInt("adult",a);
                child_e.putInt("child",c);
                limit_e.putInt("limit",l);
                setting_e.putInt("setting",s);
                baby_e.putInt("baby",b);

                adult_e.commit();
                child_e.commit();
                limit_e.commit();
                setting_e.commit();
                baby_e.commit();


                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.nakayamanobuo.kadai1","com.example.nakayamanobuo.kadai1.stock");
                startActivity(intent);
            }
        });


        Button btnfood = (Button)findViewById(R.id.food);
        btnfood.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                SharedPreferences adult =getSharedPreferences("adult",MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences limit = getSharedPreferences("limit", MODE_PRIVATE);
                SharedPreferences setting = getSharedPreferences("setting", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby", MODE_PRIVATE);


                EditText adult_et = (EditText) findViewById(R.id.adultText);
                EditText child_et = (EditText)findViewById(R.id.child);
                EditText limit_et = (EditText)findViewById(R.id.limit);
                EditText setting_et = (EditText)findViewById(R.id.setting);
                EditText baby_et = (EditText)findViewById(R.id.babyText);

                String adult_str = adult_et.getText().toString();
                String child_str = child_et.getText().toString();
                String limit_str = limit_et.getText().toString();
                String setting_str = setting_et.getText().toString();
                String baby_str = baby_et.getText().toString();


                int a = Integer.parseInt(adult_str);
                int c = Integer.parseInt(child_str);
                int l = Integer.parseInt(limit_str);
                int s = Integer.parseInt(setting_str);
                int b = Integer.parseInt(baby_str);

                SharedPreferences.Editor adult_e = adult.edit();
                SharedPreferences.Editor child_e = child.edit();
                SharedPreferences.Editor limit_e = limit.edit();
                SharedPreferences.Editor setting_e = setting.edit();
                SharedPreferences.Editor baby_e = baby.edit();


                adult_e.putInt("adult",a);
                child_e.putInt("child",c);
                limit_e.putInt("limit",l);
                setting_e.putInt("setting",s);
                baby_e.putInt("baby",b);

                adult_e.commit();
                child_e.commit();
                limit_e.commit();
                setting_e.commit();
                baby_e.commit();
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.nakayamanobuo.kadai1","com.example.nakayamanobuo.kadai1.food");
                startActivity(intent);
            }
        });







    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_setting, menu);
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
