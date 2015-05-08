package com.example.nakayamanobuo.kadai1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Calendar;


public class food extends Activity {

    //テスト用カレンダー
    final Calendar calendar = Calendar.getInstance();
 // カレンダーから現在の '年' を取得
    int mYear = calendar.get(Calendar.YEAR);
  // カレンダーから現在の '月' を取得
    int mMonth = calendar.get(Calendar.MONTH);
   // カレンダーから現在の '日' を取得
    int mDay = calendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog datePickerDialog;

    //レトルトごはんの賞味期限
    final Calendar rcalendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int rYear = rcalendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int rMonth = rcalendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int rDay = rcalendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog retorutgohan_datepickerdialog;

    //缶詰の賞味期限
    final Calendar kcalendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int kYear = kcalendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int kMonth = kcalendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int kday = kcalendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog kdatepickerdialog;

    //乾麺の賞味期限
    final Calendar kancalendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int kanYear = kancalendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int kanMonth = kancalendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int kanday = kancalendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog kandatepickerdialog;

    //乾板の賞味期限
    final Calendar kanpancalendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int kanpanYear = kanpancalendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int kanpanMonth = kanpancalendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int kanpanday = kanpancalendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog kanpandatepickerdialog;

    //缶詰(主菜）の賞味期限
    final Calendar k2calendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int k2Year = k2calendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int k2Month = k2calendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int k2Day = k2calendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog k2datepickerdialog;

    //レトルト(主菜）の賞味期限
    final Calendar r2calendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int r2Year = r2calendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int r2Month = r2calendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int r2Day = r2calendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog r2datepickerdialog;

    //フリーズドライの賞味期限
    final Calendar fcalendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int fYear = fcalendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int fMonth = fcalendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int fDay = fcalendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog fdatepickerdialog;

    //水の賞味期限
    final Calendar wcalendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int wYear = wcalendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int wMonth = wcalendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int wDay = wcalendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog wdatepickerdialog;

    //スポーツ飲料の賞味期限
    final Calendar pcalendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int pYear = pcalendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int pMonth = pcalendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int pDay = pcalendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog pdatepickerdialog;

    //カロリーメイトの賞味期限
    final Calendar karocalendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int karoYear = karocalendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int karoMonth = karocalendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int karoDay = karocalendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog karodatepickerdialog;

    //お菓子の賞味期限
    final Calendar okacalendar = Calendar.getInstance();
    // カレンダーから現在の '年' を取得
    int okaYear = okacalendar.get(Calendar.YEAR);
    // カレンダーから現在の '月' を取得
    int okaMonth = okacalendar.get(Calendar.MONTH);
    // カレンダーから現在の '日' を取得
    int okaDay = okacalendar.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog okadatepickerdialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        ImageButton btnretoruto = (ImageButton) findViewById(R.id.retoruto_gohan);
        btnretoruto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(food.this);
                alert.setTitle("レトルトごはん");

                LayoutInflater inflater = LayoutInflater.from(food.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_retorutogohan, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("retoruto_gohan", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.freazegohanText);

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


                        EditText et = (EditText) viw.findViewById(R.id.freazegohanText);
                        String str = et.getText().toString();
                        int i = Integer.parseInt(str);

                        SharedPreferences.Editor e = prefs.edit();

                        e.putInt("retoruto_gohan",i);

                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                //プレファレンスの呼び出し
                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                rYear = cal.getInt("ryear",rYear);
                rMonth = cal.getInt("rmonth",rMonth);
                rDay = cal.getInt("rday",rDay);
                alert.setMessage("賞味期限は"+rYear+"年"+(rMonth+1)+"月"+rDay+"日です。");
                alert.setView(viw);
                alert.show();

                ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                btnCal.setOnClickListener(new View.OnClickListener(){
                    public  void onClick(View v) {
                        //プレファレンスの呼び出し
                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        rYear = cal.getInt("ryear",rYear);
                        rMonth = cal.getInt("rmonth",rMonth);
                        rDay = cal.getInt("rday",rDay);
                        DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                rYear = year;
                                rMonth = monthOfYear;
                                rDay = dayOfMonth;
                                //プリファレンスに保存
                                SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                SharedPreferences.Editor ryear = cal.edit();
                                SharedPreferences.Editor rmonth = cal.edit();
                                SharedPreferences.Editor rday = cal.edit();

                                ryear.putInt("ryear",year);
                                rmonth.putInt("rmonth",monthOfYear);
                                rday.putInt("rday",dayOfMonth);

                                ryear.commit();
                                rmonth.commit();
                                rday.commit();
                    }

                        };

                        retorutgohan_datepickerdialog = new DatePickerDialog(
                                food.this,
                                listener,
                                rYear,
                                rMonth,
                                rDay
                        );

                        retorutgohan_datepickerdialog.show();

                    }

                });
            }
        });

        ImageButton btnkandume = (ImageButton) findViewById(R.id.kandume);
        btnkandume.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(food.this);
                alert.setTitle("缶詰");
                LayoutInflater inflater = LayoutInflater.from(food.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_kandume, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("kandume", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.kandumeText);

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

                        EditText et = (EditText) viw.findViewById(R.id.kandumeText);
                        String str = et.getText().toString();
                        int i = Integer.parseInt(str);

                        SharedPreferences.Editor e = prefs.edit();
                        e.putInt("kandume",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });
                //プリファレンス呼び出し
                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                kYear = cal.getInt("kyear",kYear);
                kMonth = cal.getInt("kmonth",kMonth);
                kday = cal.getInt("kday",kday);
                alert.setMessage("賞味期限は"+kYear+"年"+(kMonth+1)+"月"+kday+"日です。");

                alert.setView(viw);
                alert.show();

                ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                btnCal.setOnClickListener(new View.OnClickListener(){
                    public  void onClick(View v) {
                        //プリファレンス呼び出し
                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        kYear = cal.getInt("kyear",kYear);
                        kMonth = cal.getInt("kmonth",kMonth);
                        kday = cal.getInt("kday",kday);

                        DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {


                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                kYear = year;
                                kMonth = monthOfYear;
                                kday = dayOfMonth;
                                //プリファレンスに保存
                                SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                SharedPreferences.Editor kyear = cal.edit();
                                SharedPreferences.Editor kmonth = cal.edit();
                                SharedPreferences.Editor kday = cal.edit();

                                kyear.putInt("kyear",year);
                                kmonth.putInt("kmonth",monthOfYear);
                                kday.putInt("kday",dayOfMonth);

                                kyear.commit();
                                kmonth.commit();
                                kday.commit();
                            }
                        };

                        kdatepickerdialog = new DatePickerDialog(
                                food.this,
                                listener,
                                kYear,
                                kMonth,
                                kday
                        );
                        kdatepickerdialog.show();

                    }

                });
            }
        });

        ImageButton btnkanmen = (ImageButton) findViewById(R.id.kanmen);
        btnkanmen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(food.this);
                alert.setTitle("乾麺");
                LayoutInflater inflater = LayoutInflater.from(food.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_kanmen, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("kanmen", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.kanmenText);

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

                        EditText et = (EditText) viw.findViewById(R.id.kanmenText);
                        String str = et.getText().toString();
                        int i = Integer.parseInt(str);

                        SharedPreferences.Editor e = prefs.edit();
                        e.putInt("kanmen",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });
                //プリファレンス呼び出し
                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                kanYear = cal.getInt("kanyear",kanYear);
                kanMonth = cal.getInt("kanmonth",kanMonth);
                kanday = cal.getInt("kanday",kanday);
                alert.setMessage("賞味期限は"+kanYear+"年"+(kanMonth+1)+"月"+kanday+"日です。");

                alert.setView(viw);
                alert.show();

                ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                btnCal.setOnClickListener(new View.OnClickListener(){
                    public  void onClick(View v) {
                        //プリファレンス呼び出し
                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        kanYear = cal.getInt("kanyear",kanYear);
                        kanMonth = cal.getInt("kanmonth",kanMonth);
                        kanday = cal.getInt("kanday",kanday);
                        DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                kanYear = year;
                                kanMonth = monthOfYear;
                                kanday = dayOfMonth;

                                //プリファレンスに保存
                                SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                SharedPreferences.Editor kanyear = cal.edit();
                                SharedPreferences.Editor kanmonth = cal.edit();
                                SharedPreferences.Editor kanday = cal.edit();

                                kanyear.putInt("kanyear",year);
                                kanmonth.putInt("kanmonth",monthOfYear);
                                kanday.putInt("kanday",dayOfMonth);

                                kanyear.commit();
                                kanmonth.commit();
                                kanday.commit();
                            }
                        };

                        kandatepickerdialog = new DatePickerDialog(
                                food.this,
                                listener,
                                kanYear,
                                kanMonth,
                                kanday
                        );
                        kandatepickerdialog.show();

                    }

                });
            }
        });

        ImageButton btnkanpan = (ImageButton) findViewById(R.id.kanpan);
        btnkanpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(food.this);
                alert.setTitle("乾パン");
                LayoutInflater inflater = LayoutInflater.from(food.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_kanpan, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("kanpan", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.kanpanText);

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

                        EditText et = (EditText) viw.findViewById(R.id.kanpanText);
                        String str = et.getText().toString();
                        int i = Integer.parseInt(str);

                        SharedPreferences.Editor e = prefs.edit();
                        e.putInt("kanpan",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });
                //プリファレンス呼び出し
                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                kanpanYear = cal.getInt("kanpanyear",kanpanYear);
                kanpanMonth = cal.getInt("kanpanmonth",kanpanMonth);
                kanpanday = cal.getInt("kanpanday",kanpanday);
                alert.setMessage("賞味期限は"+kanpanYear+"年"+(kanpanMonth+1)+"月"+kanpanday+"日です。");

                alert.setView(viw);
                alert.show();

                ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                btnCal.setOnClickListener(new View.OnClickListener(){
                    public  void onClick(View v) {

                        //プリファレンス呼び出し
                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        kanpanYear = cal.getInt("kanpanyear",kanpanYear);
                        kanpanMonth = cal.getInt("kanpanmonth",kanpanMonth);
                        kanpanday = cal.getInt("kanpanday",kanpanday);
                        DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                kanpanYear = year;
                                kanpanMonth = monthOfYear;
                                kanpanday = dayOfMonth;

                                //プリファレンスに保存
                                SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                SharedPreferences.Editor kanpanyear = cal.edit();
                                SharedPreferences.Editor kanpanmonth = cal.edit();
                                SharedPreferences.Editor kanpanday = cal.edit();

                                kanpanyear.putInt("kanpanyear",year);
                                kanpanmonth.putInt("kanpanmonth",monthOfYear);
                                kanpanday.putInt("kanpanday",dayOfMonth);

                                kanpanyear.commit();
                                kanpanmonth.commit();
                                kanpanday.commit();
                            }
                        };

                       kanpandatepickerdialog = new DatePickerDialog(
                                food.this,
                                listener,
                                kanpanYear,
                                kanpanMonth,
                                kanpanday
                        );
                        kanpandatepickerdialog.show();

                    }

                });
            }
        });

        ImageButton btnkan_syusai = (ImageButton) findViewById(R.id.kandume_syusai);
        btnkan_syusai.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(food.this);
                alert.setTitle("缶詰");
                LayoutInflater inflater = LayoutInflater.from(food.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_kandume_syusai, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("kandumes", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.kansyuText);

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

                        EditText et = (EditText) viw.findViewById(R.id.kansyuText);
                        String str = et.getText().toString();
                        int i = Integer.parseInt(str);

                        SharedPreferences.Editor e = prefs.edit();
                        e.putInt("kandumes",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });
                //プリファレンス呼び出し
                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                r2Year = cal.getInt("r2year",r2Year);
                r2Month = cal.getInt("r2month",r2Month);
                r2Day = cal.getInt("r2day",r2Day);
                alert.setMessage("賞味期限は"+r2Year+"年"+(r2Month+1)+"月"+r2Day+"日です。");

                alert.setView(viw);
                alert.show();

                ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                btnCal.setOnClickListener(new View.OnClickListener(){
                    public  void onClick(View v) {

                        //プリファレンス呼び出し

                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        k2Year = cal.getInt("k2year",k2Year);
                        k2Month = cal.getInt("k2month",k2Month);
                        k2Day = cal.getInt("k2day",k2Day);
                        DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                k2Year = year;
                                k2Month = monthOfYear;
                                k2Day = dayOfMonth;

                                //プリファレンスに保存
                                SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                SharedPreferences.Editor k2year = cal.edit();
                                SharedPreferences.Editor k2month = cal.edit();
                                SharedPreferences.Editor k2day = cal.edit();

                                k2year.putInt("k2year",year);
                                k2month.putInt("k2month",monthOfYear);
                                k2day.putInt("k2day",dayOfMonth);

                                k2year.commit();
                                k2month.commit();
                                k2day.commit();
                            }
                        };

                        k2datepickerdialog = new DatePickerDialog(
                                food.this,
                                listener,
                                k2Year,
                                k2Month,
                                k2Day
                        );
                        k2datepickerdialog.show();

                    }

                });
            }
        });

        ImageButton btnretorutos = (ImageButton) findViewById(R.id.retoruto);
        btnretorutos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(food.this);
                alert.setTitle("レトルト");
                LayoutInflater inflater = LayoutInflater.from(food.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_retoruto, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("retoruto", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.retorutoText);

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

                        EditText et = (EditText) viw.findViewById(R.id.retorutoText);
                        String str = et.getText().toString();
                        int i = Integer.parseInt(str);

                        SharedPreferences.Editor e = prefs.edit();
                        e.putInt("retoruto",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });
                //プリファレンス呼び出し
                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                r2Year = cal.getInt("r2year",r2Year);
                r2Month = cal.getInt("r2month",r2Month);
                r2Day = cal.getInt("r2day",r2Day);
                alert.setMessage("賞味期限は"+r2Year+"年"+(r2Month+1)+"月"+r2Day+"日です。");

                alert.setView(viw);
                alert.show();

                ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                btnCal.setOnClickListener(new View.OnClickListener(){
                    public  void onClick(View v) {

                        //プリファレンス呼び出し
                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        r2Year = cal.getInt("r2year",r2Year);
                        r2Month = cal.getInt("r2month",r2Month);
                        r2Day = cal.getInt("r2day",r2Day);
                        DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                r2Year = year;
                                r2Month = monthOfYear;
                                r2Day = dayOfMonth;

                                //プリファレンスに保存
                                SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                SharedPreferences.Editor r2year = cal.edit();
                                SharedPreferences.Editor r2month = cal.edit();
                                SharedPreferences.Editor r2day = cal.edit();

                                r2year.putInt("r2year",year);
                                r2month.putInt("r2month",monthOfYear);
                                r2day.putInt("r2day",dayOfMonth);

                                r2year.commit();
                                r2month.commit();
                                r2day.commit();
                            }
                        };

                        r2datepickerdialog = new DatePickerDialog(
                                food.this,
                                listener,
                                r2Year,
                                r2Month,
                                r2Day
                        );
                        r2datepickerdialog.show();

                    }

                });
            }
        });

        ImageButton btnfreaze = (ImageButton) findViewById(R.id.furizu);
        btnfreaze.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(food.this);
                alert.setTitle("フリーズドライ");
                LayoutInflater inflater = LayoutInflater.from(food.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_freaze, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
                SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
                SharedPreferences baby = getSharedPreferences("baby",MODE_PRIVATE);

                int i = 0;
                i = pref.getInt("freaze", i);
                int a = adult.getInt("adult", 0);
                int c = child.getInt("child",0);
                int b = baby.getInt("baby",0);


                String str = String.valueOf(i);
                String a_str = "大人"+String.valueOf(a)+"人";
                String c_str = "子供"+String.valueOf(c)+"人";
                String b_str = "幼児"+String.valueOf(b)+"人";

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.freazeText);
                EditText adult_et = (EditText)viw.findViewById(R.id.adult);
                EditText child_et = (EditText)viw.findViewById(R.id.child);
                EditText baby_et = (EditText)viw.findViewById(R.id.baby);


                //はいっちゃう
                et.setText(str);
                adult_et.setText(a_str);
                child_et.setText(c_str);
                baby_et.setText(b_str);


                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences prefs =getSharedPreferences("Preferences",MODE_PRIVATE);

                        EditText et = (EditText) viw.findViewById(R.id.freazeText);
                        String str = et.getText().toString();
                        int i = Integer.parseInt(str);

                        SharedPreferences.Editor e = prefs.edit();
                        e.putInt("freaze",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                //プリファレンス呼び出し
                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                fYear = cal.getInt("fyear",fYear);
                fMonth = cal.getInt("fmonth",fMonth);
                fDay = cal.getInt("fday",fDay);
                alert.setMessage("賞味期限は"+fYear+"年"+(fMonth+1)+"月"+fDay+"日です。");

                alert.setView(viw);
                alert.show();

                ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                btnCal.setOnClickListener(new View.OnClickListener(){
                    public  void onClick(View v) {

                        //プリファレンス呼び出し
                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        fYear = cal.getInt("fyear",fYear);
                        fMonth = cal.getInt("fmonth",fMonth);
                        fDay = cal.getInt("fday",fDay);
                        DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                fYear = year;
                                fMonth = monthOfYear;
                                fDay = dayOfMonth;

                                //プリファレンスに保存
                                SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                SharedPreferences.Editor fyear = cal.edit();
                                SharedPreferences.Editor fmonth = cal.edit();
                                SharedPreferences.Editor fday = cal.edit();

                                fyear.putInt("fyear",year);
                                fmonth.putInt("fmonth",monthOfYear);
                                fday.putInt("fday",dayOfMonth);

                                fyear.commit();
                                fmonth.commit();
                                fday.commit();
                            }
                        };

                        fdatepickerdialog = new DatePickerDialog(
                                food.this,
                                listener,
                                fYear,
                                fMonth,
                                fDay
                        );
                        fdatepickerdialog.show();

                    }

                });
            }
        });

        ImageButton btnmizu = (ImageButton) findViewById(R.id.mizu);
        btnmizu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(food.this);
                alert.setTitle("水");
                LayoutInflater inflater = LayoutInflater.from(food.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_mizu, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("mizu", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.mizuText);

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

                        EditText et = (EditText) viw.findViewById(R.id.mizuText);
                        String str = et.getText().toString();
                        int i = Integer.parseInt(str);

                        SharedPreferences.Editor e = prefs.edit();
                        e.putInt("mizu",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                //プリファレンス呼び出し
                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                wYear = cal.getInt("wyear",wYear);
                wMonth = cal.getInt("wmonth",wMonth);
                wDay = cal.getInt("wday",wDay);
                alert.setMessage("賞味期限は"+wYear+"年"+(wMonth+1)+"月"+wDay+"日です。");

                alert.setView(viw);
                alert.show();

                ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                btnCal.setOnClickListener(new View.OnClickListener(){
                    public  void onClick(View v) {

                        //プリファレンス呼び出し
                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        wYear = cal.getInt("wyear",wYear);
                        wMonth = cal.getInt("wmonth",wMonth);
                        wDay = cal.getInt("wday",wDay);

                        DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                wYear = year;
                                wMonth = monthOfYear;
                                wDay = dayOfMonth;

                                //プリファレンスに保存
                                SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                SharedPreferences.Editor wyear = cal.edit();
                                SharedPreferences.Editor wmonth = cal.edit();
                                SharedPreferences.Editor wday = cal.edit();

                                wyear.putInt("wyear",year);
                                wmonth.putInt("wmonth",monthOfYear);
                                wday.putInt("wday",dayOfMonth);

                                wyear.commit();
                                wmonth.commit();
                                wday.commit();
                            }
                        };

                        wdatepickerdialog = new DatePickerDialog(
                                food.this,
                                listener,
                                wYear,
                                wMonth,
                                wDay
                        );
                        wdatepickerdialog.show();

                    }

                });
            }
        });

        ImageButton btnpokari = (ImageButton) findViewById(R.id.pokari);
        btnpokari.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(food.this);
                alert.setTitle("スポーツ飲料粉末");
                LayoutInflater inflater = LayoutInflater.from(food.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_pokari, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("pokari", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.pokariText);

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

                        EditText et = (EditText) viw.findViewById(R.id.pokariText);
                        String str = et.getText().toString();
                        int i = Integer.parseInt(str);

                        SharedPreferences.Editor e = prefs.edit();
                        e.putInt("pokari",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });
                //プリファレンス呼び出し
                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                pYear = cal.getInt("pyear",pYear);
                pMonth = cal.getInt("pmonth",pMonth);
                pDay = cal.getInt("pday",pDay);
                alert.setMessage("賞味期限は"+pYear+"年"+(pMonth+1)+"月"+pDay+"日です。");

                alert.setView(viw);
                alert.show();

                ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                btnCal.setOnClickListener(new View.OnClickListener(){
                    public  void onClick(View v) {

                        //プリファレンス呼び出し
                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        pYear = cal.getInt("pyear",pYear);
                        pMonth = cal.getInt("pmonth",pMonth);
                        pDay = cal.getInt("pday",pDay);
                        DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                pYear = year;
                                pMonth = monthOfYear;
                                pDay = dayOfMonth;

                                //プリファレンスに保存
                                SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                SharedPreferences.Editor pyear = cal.edit();
                                SharedPreferences.Editor pmonth = cal.edit();
                                SharedPreferences.Editor pday = cal.edit();

                                pyear.putInt("pyear",year);
                                pmonth.putInt("pmonth",monthOfYear);
                                pday.putInt("pday",dayOfMonth);

                                pyear.commit();
                                pmonth.commit();
                                pday.commit();
                            }
                        };

                        pdatepickerdialog = new DatePickerDialog(
                                food.this,
                                listener,
                                pYear,
                                pMonth,
                                pDay
                        );
                        pdatepickerdialog.show();

                    }

                });
            }
        });

        ImageButton btnkarori = (ImageButton) findViewById(R.id.karori);
        btnkarori.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(food.this);
                alert.setTitle("カロリーメイト");
                LayoutInflater inflater = LayoutInflater.from(food.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_karori, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("karori", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.karoriText);

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

                        EditText et = (EditText) viw.findViewById(R.id.karoriText);
                        String str = et.getText().toString();
                        int i = Integer.parseInt(str);

                        SharedPreferences.Editor e = prefs.edit();
                        e.putInt("karori",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });
                //プリファレンス呼び出し
                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                karoYear = cal.getInt("kalyear",karoYear);
                karoMonth = cal.getInt("kalmonth",karoMonth);
                karoDay = cal.getInt("kalday",karoDay);
                alert.setMessage("賞味期限は"+karoYear+"年"+(karoMonth+1)+"月"+karoDay+"日です。");

                alert.setView(viw);
                alert.show();

                ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                btnCal.setOnClickListener(new View.OnClickListener(){
                    public  void onClick(View v) {
                        //プリファレンス呼び出し
                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        karoYear = cal.getInt("kalyear",karoYear);
                        karoMonth = cal.getInt("kalmonth",karoMonth);
                        karoDay = cal.getInt("kalday",karoDay);
                        DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                karoYear = year;
                                karoMonth = monthOfYear;
                                karoDay = dayOfMonth;

                                //プリファレンスに保存
                                SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                SharedPreferences.Editor kalyear = cal.edit();
                                SharedPreferences.Editor kalmonth = cal.edit();
                                SharedPreferences.Editor kalday = cal.edit();

                                kalyear.putInt("kalyear",year);
                                kalmonth.putInt("kalmonth",monthOfYear);
                                kalday.putInt("kalday",dayOfMonth);

                                kalyear.commit();
                                kalmonth.commit();
                                kalday.commit();
                            }
                        };

                        karodatepickerdialog = new DatePickerDialog(
                                food.this,
                                listener,
                                karoYear,
                                karoMonth,
                                karoDay
                        );
                        karodatepickerdialog.show();

                    }

                });
            }
        });

        ImageButton btnokasi = (ImageButton) findViewById(R.id.okasi);
        btnokasi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(food.this);
                alert.setTitle("お菓子");
                LayoutInflater inflater = LayoutInflater.from(food.this);
                final View viw;
                viw = inflater.inflate(R.layout.activity_okasi, null);

                //プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("okasi", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.okasiText);

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

                        EditText et = (EditText) viw.findViewById(R.id.okasiText);
                        String str = et.getText().toString();
                        int i = Integer.parseInt(str);

                        SharedPreferences.Editor e = prefs.edit();
                        e.putInt("okasi",i);
                        // e.putString("ga"," ");
                        e.commit();

                        dialog.dismiss();


                    }
                });

                SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                okaYear = cal.getInt("okayear",okaYear);
                okaMonth = cal.getInt("okamonth",okaMonth);
                okaDay = cal.getInt("okaday",okaDay);

                alert.setMessage("賞味期限は"+okaYear+"年"+(okaMonth+1)+"月"+okaDay+"日です。");

                alert.setView(viw);
                alert.show();


                ImageButton btnCal = (ImageButton)viw.findViewById(R.id.cal);
                btnCal.setOnClickListener(new View.OnClickListener(){
                    public  void onClick(View v) {
                        //プリファレンス呼び出し
                        SharedPreferences cal = getSharedPreferences("Prifarence", MODE_PRIVATE);
                        okaYear = cal.getInt("okayear",okaYear);
                        okaMonth = cal.getInt("okamonth",okaMonth);
                        okaDay = cal.getInt("okaday",okaDay);

                        DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                okaYear = year;
                                okaMonth = monthOfYear;
                                okaDay = dayOfMonth;

                                //プリファレンスに保存
                                SharedPreferences cal =getSharedPreferences("Prifarence",MODE_PRIVATE);
                                SharedPreferences.Editor okayear = cal.edit();
                                SharedPreferences.Editor okamonth = cal.edit();
                                SharedPreferences.Editor okaday = cal.edit();

                                okayear.putInt("okayear",year);
                                okamonth.putInt("okamonth",monthOfYear);
                                okaday.putInt("okaday",dayOfMonth);

                                okayear.commit();
                                okamonth.commit();
                                okaday.commit();
                            }
                        };
                        okadatepickerdialog = new DatePickerDialog(
                                food.this,
                                listener,
                                okaYear,
                                okaMonth,
                                okaDay
                        );


                        okadatepickerdialog.show();

                    }

                });


            }
        });





        Button btnDisp = (Button)findViewById(R.id.home);
        btnDisp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.nakayamanobuo.kadai1","com.example.nakayamanobuo.kadai1.MainActivity");
                startActivity(intent);
            }
        });

        Button btnbitiku = (Button)findViewById(R.id.bichiku);
        btnbitiku.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.nakayamanobuo.kadai1","com.example.nakayamanobuo.kadai1.stock");
                startActivity(intent);
            }
        });
        Button btnset = (Button)findViewById(R.id.setting);
        btnset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.nakayamanobuo.kadai1","com.example.nakayamanobuo.kadai1.setting");
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_food, menu);
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
