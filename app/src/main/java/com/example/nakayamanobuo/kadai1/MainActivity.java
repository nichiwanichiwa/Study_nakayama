package com.example.nakayamanobuo.kadai1;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import java.util.Calendar;
import java.util.Date;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences setting = getSharedPreferences("setting", MODE_PRIVATE);
        SharedPreferences adult = getSharedPreferences("adult",MODE_PRIVATE);
        SharedPreferences child = getSharedPreferences("child",MODE_PRIVATE);

        TextView tw = (TextView)findViewById(R.id.Days);
        Calendar cale = Calendar.getInstance();
        tw.setText(cale.get(Calendar.YEAR)+"年"+(cale.get(Calendar.MONTH)+1)+"月"+cale.get(Calendar.DATE)+"日");

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
       // int mizu  = pref.getInt("mizu", 0);
       // int pokari  = pref.getInt("pokari", 0);
        int karori  = pref.getInt("karori", 0);
        int okasi  = pref.getInt("okasi", 0);

        String today_last = pref.getString("today","まだ入力されていません。");
        String today_last_s = pref.getString("today_s","まだ入力されていません。");


        int sum = g + m + b + h + s + t + a + gun;
        int sum2= r + k + kan + kanpan + kan2 + reto + f + karori + okasi;
        String str = "備蓄品:"+String.valueOf(sum);
        String str2 = "非常食:"+String.valueOf(sum2);
        int hoge = setting.getInt("setting_sp",0);
        int adult_n =adult.getInt("adult",0);
        int child_n =child.getInt("child",0);
        int fam = adult_n+child_n;
        double MAX;

        String str_fp="備蓄"+hoge;
        switch (hoge){
            case 0:
                double x = 7;//((sum2 - kanpan - karori) * 1) / 3;
                str_fp="備蓄は"+x+"です。";break;

            case 1:
                double y = 3;//((sum2 - kanpan - karori) * 1) / 3;
                str_fp="備蓄は"+y+"です。";break;
            case 2:
                double p;
                double z = ((sum2 - kanpan - karori) * 1)+(kanpan+karori)*3;
                if(z>=3*fam){ z=3*fam;}
                MAX=((adult_n*3)+(child_n*2))*z;
                p=-z/(MAX*50);

                str_fp="備蓄は"+p+"%です。";break;
            default:break;


            /*switch (x) {
                case 0:
                    str_sp = "備蓄は０％です。";
                    break;
                case 1:
                    str_sp = "備蓄は１０％です。";
                    break;
                case 2:
                    str_sp = "備蓄は２０％です。";
                    break;
                case 3:
                    str_sp = "備蓄は３０％です。";
                    break;
                case 4:
                    str_sp = "備蓄は４０％です。";
                    break;
                case 5:
                    str_sp = "備蓄は５０％です。";
                    break;
                case 6:
                    str_sp = "備蓄は６０％です。";
                    break;
                case 7:
                    str_sp = "備蓄は７０％です。";
                    break;
                case 8:
                    str_sp = "備蓄は８０％です。";
                    break;
                case 9:
                    str_sp = "備蓄は９０％です。";
                    break;
                case 10:
                    str_sp = "備蓄は１００％です。";
                    break;
                case 11:
                    str_sp = "備蓄は１１０％です。";
                    break;
                case 12:
                    str_sp = "備蓄は１２０％です。";
                    break;
                default:
                    str_sp = "備蓄は１２０％以上です。";
                    break;
            }*/

        }
        TextView et4 = (TextView) findViewById(R.id.food_p);
        et4.setText(str_fp);
        /*String str_sp;
        switch(sum2)
        {
            case 0 : str_fp = "備蓄は０％です。";break;
            case 1 : str_fp = "備蓄は１０％です。";break;
            case 2 : str_fp = "備蓄は２０％です。";break;
            case 3 : str_fp = "備蓄は３０％です。";break;
            case 4 : str_fp = "備蓄は４０％です。";break;
            case 5 : str_fp = "備蓄は５０％です。";break;
            case 6 : str_fp = "備蓄は６０％です。";break;
            case 7 : str_fp = "備蓄は７０％です。";break;
            case 8 : str_fp = "備蓄は８０％です。";break;
            case 9 : str_fp = "備蓄は９０％です。";break;
            case 10 : str_fp = "備蓄は１００％です。";break;
            case 11 : str_fp = "備蓄は１１０％です。";break;
            case 12 : str_fp = "備蓄は１２０％です。";break;
            default: str_fp = "備蓄は１２０％以上です。";break;
        }*/


        //必ずView変数で生成したデータを使うこと
        EditText et = (EditText) findViewById(R.id.test);
        EditText et2 = (EditText) findViewById(R.id.test2);
        TextView et3 = (TextView) findViewById(R.id.stock_p);

        TextView today_f  =(TextView)findViewById(R.id.food_cal);
        TextView today_s  =(TextView)findViewById(R.id.stock_cal);

        //はいっちゃう
        et.setText(str);
        et2.setText(str2);
       // et3.setText(str_sp);

        today_f.setText(today_last);
        today_s.setText(today_last_s);

        //レトルトごはんの期日が迫るとダイアログを表示する
        Calendar today =Calendar.getInstance();
        SharedPreferences limit = getSharedPreferences("limit", MODE_PRIVATE);
        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
        int lim = limit.getInt("limit",0);
        int ry = cal.getInt("kyear", cale.get(Calendar.YEAR));
        int rm = cal.getInt("rmonth",cale.get(Calendar.MONTH));
        int rd = cal.getInt("rday", cale.get(Calendar.DATE));
        Calendar calretltgohan = Calendar.getInstance();

        switch(rm){
            case 0:calretltgohan.set(ry,Calendar.JANUARY,rd,0,0,0);break;
            case 1:calretltgohan.set(ry,Calendar.FEBRUARY,rd,0,0,0);break;
            case 2:calretltgohan.set(ry,Calendar.MARCH,rd,0,0,0);break;
            case 3:calretltgohan.set(ry,Calendar.APRIL,rd,0,0,0);break;
            case 4:calretltgohan.set(ry,Calendar.MAY,rd,0,0,0);break;
            case 5:calretltgohan.set(ry,Calendar.JUNE,rd,0,0,0);break;
            case 6:calretltgohan.set(ry,Calendar.JULY,rd,0,0,0);break;
            case 7:calretltgohan.set(ry,Calendar.AUGUST,rd,0,0,0);break;
            case 8:calretltgohan.set(ry,Calendar.SEPTEMBER,rd,0,0,0);break;
            case 9:calretltgohan.set(ry,Calendar.OCTOBER,rd,0,0,0);break;
            case 10:calretltgohan.set(ry,Calendar.NOVEMBER,rd,0,0,0);break;
            case 11:calretltgohan.set(ry,Calendar.DECEMBER,rd,0,0,0);break;
            default:break;
        }

        long rdifference = calretltgohan.getTime().getTime() - today.getTime().getTime();
        double ri = rdifference/1000/60/60/24;

        if(lim>=ri&&ri > 0){
            AlertDialog.Builder alert;
            alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("警告");
            alert.setMessage("レトルトごはんは賞味期限到達"+(ri+1)+"日前です。");
            alert.show();
        }
        else if(ri<0){
            AlertDialog.Builder alert;
            alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("警告");
            alert.setMessage("レトルトごはんは賞味期限が過ぎています。");
            alert.show();
        }
        else{
            AlertDialog.Builder alert;
            alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("警告");
            alert.setMessage("レトルトごはんは賞味期限当日です");
            alert.show();
        }


        //缶詰の期日が迫るとダイアログを表示する
        ry = cal.getInt("kyear", cale.get(Calendar.YEAR));
        rm = cal.getInt("kmonth",cale.get(Calendar.MONTH));
        rd = cal.getInt("kday", cale.get(Calendar.DATE));
        //Calendar calkan = Calendar.getInstance();
        switch(rm){
            case 0:calretltgohan.set(ry,Calendar.JANUARY,rd,0,0,0);break;
            case 1:calretltgohan.set(ry,Calendar.FEBRUARY,rd,0,0,0);break;
            case 2:calretltgohan.set(ry,Calendar.MARCH,rd,0,0,0);break;
            case 3:calretltgohan.set(ry,Calendar.APRIL,rd,0,0,0);break;
            case 4:calretltgohan.set(ry,Calendar.MAY,rd,0,0,0);break;
            case 5:calretltgohan.set(ry,Calendar.JUNE,rd,0,0,0);break;
            case 6:calretltgohan.set(ry,Calendar.JULY,rd,0,0,0);break;
            case 7:calretltgohan.set(ry,Calendar.AUGUST,rd,0,0,0);break;
            case 8:calretltgohan.set(ry,Calendar.SEPTEMBER,rd,0,0,0);break;
            case 9:calretltgohan.set(ry,Calendar.OCTOBER,rd,0,0,0);break;
            case 10:calretltgohan.set(ry,Calendar.NOVEMBER,rd,0,0,0);break;
            case 11:calretltgohan.set(ry,Calendar.DECEMBER,rd,0,0,0);break;
            default:break;
        }



        long kandifference = calretltgohan.getTime().getTime() - today.getTime().getTime();
        long kani = kandifference/1000/60/60/24;


        if(kani==0) {
            AlertDialog.Builder alert;
            alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("警告");
            alert.setMessage("缶詰（主食）は賞味期限当日です。");
            alert.show();
        }
        else if(lim>=kani&&kani > 0 && calretltgohan!=today){
            AlertDialog.Builder alert;
            alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("警告");
            alert.setMessage("缶詰（主食）は賞味期限到達"+(kani+1)+"日前です。");
            alert.show();
        }
        else if(kani<0){
            AlertDialog.Builder alert;
            alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("警告");
            alert.setMessage("缶詰（主食）は賞味期限が過ぎています。");
            alert.show();
        }


        //乾麺の期日が迫るとダイアログを表示する
        ry = cal.getInt("kanyear", cale.get(Calendar.YEAR));
        rm = cal.getInt("kanmonth",cale.get(Calendar.MONTH));
        rd = cal.getInt("kanday", cale.get(Calendar.DATE));
        //Calendar calkan = Calendar.getInstance();
        switch(rm){
            case 0:calretltgohan.set(ry,Calendar.JANUARY,rd,0,0,0);break;
            case 1:calretltgohan.set(ry,Calendar.FEBRUARY,rd,0,0,0);break;
            case 2:calretltgohan.set(ry,Calendar.MARCH,rd,0,0,0);break;
            case 3:calretltgohan.set(ry,Calendar.APRIL,rd,0,0,0);break;
            case 4:calretltgohan.set(ry,Calendar.MAY,rd,0,0,0);break;
            case 5:calretltgohan.set(ry,Calendar.JUNE,rd,0,0,0);break;
            case 6:calretltgohan.set(ry,Calendar.JULY,rd,0,0,0);break;
            case 7:calretltgohan.set(ry,Calendar.AUGUST,rd,0,0,0);break;
            case 8:calretltgohan.set(ry,Calendar.SEPTEMBER,rd,0,0,0);break;
            case 9:calretltgohan.set(ry,Calendar.OCTOBER,rd,0,0,0);break;
            case 10:calretltgohan.set(ry,Calendar.NOVEMBER,rd,0,0,0);break;
            case 11:calretltgohan.set(ry,Calendar.DECEMBER,rd,0,0,0);break;
            default:break;
        }



        long kanmendifference = calretltgohan.getTime().getTime() - today.getTime().getTime();
        double kanmeni = kanmendifference/1000/60/60/24;

        if(lim>=kanmeni&&kanmeni >0){
            AlertDialog.Builder alert;
            alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("警告");
            alert.setMessage("乾麺は賞味期限到達"+(kanmeni+1)+"日前です。");
            alert.show();
        }
        else if(kanmeni<0){
            AlertDialog.Builder alert;
            alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("警告");
            alert.setMessage("乾麺は賞味期限が過ぎています。");
            alert.show();
        }
        else{
            AlertDialog.Builder alert;
            alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("警告");
            alert.setMessage("乾麺は賞味期限当日です。");
            alert.show();
        }


        //乾板の期日が迫るとダイアログを表示する
        ry = cal.getInt("kanpanyear", cale.get(Calendar.YEAR));
        rm = cal.getInt("kanpanmonth",cale.get(Calendar.MONTH));
        rd = cal.getInt("kanpanday", cale.get(Calendar.DATE));
        //Calendar calkan = Calendar.getInstance();
        switch(rm){
            case 0:calretltgohan.set(ry,Calendar.JANUARY,rd,0,0,0);break;
            case 1:calretltgohan.set(ry,Calendar.FEBRUARY,rd,0,0,0);break;
            case 2:calretltgohan.set(ry,Calendar.MARCH,rd,0,0,0);break;
            case 3:calretltgohan.set(ry,Calendar.APRIL,rd,0,0,0);break;
            case 4:calretltgohan.set(ry,Calendar.MAY,rd,0,0,0);break;
            case 5:calretltgohan.set(ry,Calendar.JUNE,rd,0,0,0);break;
            case 6:calretltgohan.set(ry,Calendar.JULY,rd,0,0,0);break;
            case 7:calretltgohan.set(ry,Calendar.AUGUST,rd,0,0,0);break;
            case 8:calretltgohan.set(ry,Calendar.SEPTEMBER,rd,0,0,0);break;
            case 9:calretltgohan.set(ry,Calendar.OCTOBER,rd,0,0,0);break;
            case 10:calretltgohan.set(ry,Calendar.NOVEMBER,rd,0,0,0);break;
            case 11:calretltgohan.set(ry,Calendar.DECEMBER,rd,0,0,0);break;
            default:break;
        }



        long difference = calretltgohan.getTime().getTime() - today.getTime().getTime();
        double i = difference/1000/60/60/24;

        if(lim>=i&&i >0){
            AlertDialog.Builder alert;
            alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("警告");
            alert.setMessage("乾麺は賞味期限到達"+(i+1)+"日前です。");
            alert.show();
        }
        else if(i<0){
            AlertDialog.Builder alert;
            alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("警告");
            alert.setMessage("乾麺は賞味期限が過ぎています。");
            alert.show();
        }
        else{
            AlertDialog.Builder alert;
            alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("警告");
            alert.setMessage("乾パンは賞味期限当日です。");
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
