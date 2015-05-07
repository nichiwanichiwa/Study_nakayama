package com.example.nakayamanobuo.kadai1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Calendar;


public class food extends Activity {

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

                //今日の年月日の出力
                Calendar cal = Calendar.getInstance();
                alert.setMessage("今日は"+cal.get(Calendar.YEAR)+"年"+(cal.get(Calendar.MONTH)+1)+"月"+cal.get(Calendar.DATE)+"日です。");
                alert.setView(viw);
                alert.show();
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

                alert.setView(viw);
                alert.show();
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
                Calendar cal = Calendar.getInstance();
                alert.setMessage("今日は"+cal.get(Calendar.YEAR)+"年"+(cal.get(Calendar.MONTH)+1)+"月"+cal.get(Calendar.DATE)+"日です。");

                alert.setView(viw);
                alert.show();
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
                Calendar cal = Calendar.getInstance();
                alert.setMessage("今日は"+cal.get(Calendar.YEAR)+"年"+(cal.get(Calendar.MONTH)+1)+"月"+cal.get(Calendar.DATE)+"日です。");

                alert.setView(viw);
                alert.show();
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
                Calendar cal = Calendar.getInstance();
                alert.setMessage("今日は"+cal.get(Calendar.YEAR)+"年"+(cal.get(Calendar.MONTH)+1)+"月"+cal.get(Calendar.DATE)+"日です。");

                alert.setView(viw);
                alert.show();
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
                Calendar cal = Calendar.getInstance();
                alert.setMessage("今日は"+cal.get(Calendar.YEAR)+"年"+(cal.get(Calendar.MONTH)+1)+"月"+cal.get(Calendar.DATE)+"日です。");

                alert.setView(viw);
                alert.show();
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
                int i = 0;
                i = pref.getInt("freaze", i);
                String str = String.valueOf(i);

                //必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.freazeText);

                //はいっちゃう
                et.setText(str);


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
                Calendar cal = Calendar.getInstance();
                alert.setMessage("今日は"+cal.get(Calendar.YEAR)+"年"+(cal.get(Calendar.MONTH)+1)+"月"+cal.get(Calendar.DATE)+"日です。");

                alert.setView(viw);
                alert.show();
            }
        });

        ImageButton btnmizu = (ImageButton) findViewById(R.id.mizu);
        btnmizu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //アラートダイアログの出力
                AlertDialog.Builder alert;
                alert = new AlertDialog.Builder(food.this);
                alert.setTitle("mizu");
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
                Calendar cal = Calendar.getInstance();
                alert.setMessage("今日は"+cal.get(Calendar.YEAR)+"年"+(cal.get(Calendar.MONTH)+1)+"月"+cal.get(Calendar.DATE)+"日です。");

                alert.setView(viw);
                alert.show();
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
                Calendar cal = Calendar.getInstance();
                alert.setMessage("今日は"+cal.get(Calendar.YEAR)+"年"+(cal.get(Calendar.MONTH)+1)+"月"+cal.get(Calendar.DATE)+"日です。");

                alert.setView(viw);
                alert.show();
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
                Calendar cal = Calendar.getInstance();
                alert.setMessage("今日は"+cal.get(Calendar.YEAR)+"年"+(cal.get(Calendar.MONTH)+1)+"月"+cal.get(Calendar.DATE)+"日です。");

                alert.setView(viw);
                alert.show();
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
                Calendar cal = Calendar.getInstance();
                alert.setMessage("今日は"+cal.get(Calendar.YEAR)+"年"+(cal.get(Calendar.MONTH)+1)+"月"+cal.get(Calendar.DATE)+"日です。");

                alert.setView(viw);
                alert.show();
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
