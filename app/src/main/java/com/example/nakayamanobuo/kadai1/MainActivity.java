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
import android.widget.TextView;
import android.view.View.OnClickListener;
import java.util.Calendar;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tw = (TextView)findViewById(R.id.Days);
        Calendar cal = Calendar.getInstance();
        tw.setText(cal.get(Calendar.YEAR)+"年"+(cal.get(Calendar.MONTH)+1)+"月"+cal.get(Calendar.DATE)+"日");

        SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
        int g = pref.getInt("ga", 0);
        int m = pref.getInt("matti", 0);
        int b =  pref.getInt("bomb", 0);
        int h = pref.getInt("hue", 0);
        int s = pref.getInt("sitagi", 0);
        int t =  pref.getInt("thissyu", 0);
        int a =  pref.getInt("almi", 0);
        int gun  = pref.getInt("gunnte", 0);

        int r  = pref.getInt("retoruto_gohan", 0);
        int k  = pref.getInt("kandume", 0);
        int kan  = pref.getInt("kanmen", 0);
        int kanpan  = pref.getInt("kanpan", 0);
        int kan2  = pref.getInt("kandumes", 0);
        int reto  = pref.getInt("retoruto", 0);
        int f  = pref.getInt("freaze", 0);
        int mizu  = pref.getInt("mizu", 0);
        int pokari  = pref.getInt("pokari", 0);
        int karori  = pref.getInt("karori", 0);
        int okasi  = pref.getInt("okasi", 0);


        int sum = g + m + b + h + s + t + a + gun;
        int sum2= r + k + kan + kanpan + kan2 + reto + f + mizu + pokari + karori + okasi;
        String str = String.valueOf(sum);
        String str2 = String.valueOf(sum2);

        //必ずView変数で生成したデータを使うこと
        EditText et = (EditText) findViewById(R.id.test);
        EditText et2 = (EditText) findViewById(R.id.test2);

        //はいっちゃう
        et.setText(str);
        et2.setText(str2);

        //期日が迫るとダイアログを表示する
        SharedPreferences limit = getSharedPreferences("limit", MODE_PRIVATE);
        int lim = limit.getInt("limit",0);
        if(lim<=10){
            AlertDialog.Builder alert;
            alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("警告");
            alert.setMessage("期日到達"+lim+"日前です。");
            alert.show();
        }

        Button btnDisp = (Button)findViewById(R.id.set_button);
        btnDisp.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.nakayamanobuo.kadai1","com.example.nakayamanobuo.kadai1.setting");
                startActivity(intent);
            }
        });

        Button btnstk = (Button)findViewById(R.id.stock_button);
        btnstk.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.nakayamanobuo.kadai1","com.example.nakayamanobuo.kadai1.stock");
                startActivity(intent);
            }
        });

        Button btnfood = (Button)findViewById(R.id.food_button);
        btnfood.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
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
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
