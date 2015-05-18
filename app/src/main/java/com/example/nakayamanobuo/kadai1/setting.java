package com.example.nakayamanobuo.kadai1;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class setting extends Activity {

    private Spinner selectSpinner;
    private Spinner human;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_setting);
        SharedPreferences setting = getSharedPreferences("setting", MODE_PRIVATE);

        // 設定のSpinnerの設定
        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(this, R.array.sample_array,android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        selectSpinner = (Spinner)findViewById(R.id.spinner_id);
        selectSpinner.setAdapter(adapter);
        selectSpinner.setSelection(setting.getInt("setting_sp",1));
        selectSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            SharedPreferences setting = getSharedPreferences("setting", MODE_PRIVATE);


            @Override

            public void onItemSelected(AdapterView parent, View view, int position, long id) {
                Spinner spinner = (Spinner) parent;
                //spinner.setSelection(1);
                TextView test = (TextView) view;

                switch(position){
                    case 0:spinner.setSelection(0);break;
                    case 1:spinner.setSelection(1);break;
                    case 2:spinner.setSelection(2);break;
                    default:break;
                }

                String g =test.getText().toString();

                int asd = Integer.valueOf(g);

                SharedPreferences.Editor setting_ep = setting.edit();
                setting_ep.putInt("setting_sp", position);
                setting_ep.commit();

                switch(asd) {
                    case 0:
                        asd = 7;
                        break;
                    case 1:
                        asd = 3;
                        break;
                    case 2:
                        asd = 1;
                        break;
                    default:
                        break;
                }

                SharedPreferences.Editor setting_e = setting.edit();
                setting_e.putInt("setting", asd);
                setting_e.commit();

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);
        //大人の設定
        ArrayAdapter<CharSequence> adapter_adult =
                ArrayAdapter.createFromResource(this, R.array.adult_array,android.R.layout.simple_spinner_item);

        adapter_adult.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        human = (Spinner)findViewById(R.id.spinner_adult);
        human.setAdapter(adapter_adult);
        human.setSelection(adult.getInt("adult_sp",0));
        human.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            SharedPreferences adult = getSharedPreferences("adult", MODE_PRIVATE);

            @Override

            public void onItemSelected(AdapterView parent, View view, int position, long id) {
                Spinner spinner = (Spinner) parent;
                //spinner.setSelection(1);
                TextView test = (TextView) view;

                switch(position){
                    case 0:spinner.setSelection(0);break;
                    case 1:spinner.setSelection(1);break;
                    case 2:spinner.setSelection(2);break;
                    case 3:spinner.setSelection(3);break;
                    case 4:spinner.setSelection(4);break;
                    case 5:spinner.setSelection(5);break;
                    case 6:spinner.setSelection(6);break;
                    case 7:spinner.setSelection(7);break;
                    case 8:spinner.setSelection(8);break;
                    default:break;
                }

                String g =test.getText().toString();

                int asd = Integer.valueOf(g);

                SharedPreferences.Editor ep = adult.edit();
                ep.putInt("adult_sp", position);
                ep.commit();

                switch(asd) {
                    case 0:
                        asd = 0;
                        break;
                    case 1:
                        asd = 1;
                        break;
                    case 2:
                        asd = 2;
                        break;
                    case 3:
                        asd = 3;
                        break;
                    case 4:
                        asd = 4;
                        break;
                    case 5:
                        asd = 5;
                        break;
                    case 6:
                        asd = 6;
                        break;
                    case 7:
                        asd = 7;
                        break;
                    case 8:
                        asd = 8;
                        break;
                    case 9:
                        asd = 9;
                        break;

                    default:
                        break;
                }

                SharedPreferences.Editor e = adult.edit();
                e.putInt("adult", asd);
                e.commit();

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);
        //子供の設定
        ArrayAdapter<CharSequence> adapter_c =
                ArrayAdapter.createFromResource(this, R.array.adult_array,android.R.layout.simple_spinner_item);

        adapter_c.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        human = (Spinner)findViewById(R.id.spinner_child);
        human.setAdapter(adapter_c);
        human.setSelection(child.getInt("child_sp",0));
        human.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            SharedPreferences child = getSharedPreferences("child", MODE_PRIVATE);

            @Override

            public void onItemSelected(AdapterView parent, View view, int position, long id) {
                Spinner spinner = (Spinner) parent;
                //spinner.setSelection(1);
                TextView test = (TextView) view;

                switch(position){
                    case 0:spinner.setSelection(0);break;
                    case 1:spinner.setSelection(1);break;
                    case 2:spinner.setSelection(2);break;
                    case 3:spinner.setSelection(3);break;
                    case 4:spinner.setSelection(4);break;
                    case 5:spinner.setSelection(5);break;
                    case 6:spinner.setSelection(6);break;
                    case 7:spinner.setSelection(7);break;
                    case 8:spinner.setSelection(8);break;
                    default:break;
                }

                String g =test.getText().toString();

                int asd = Integer.valueOf(g);

                SharedPreferences.Editor epc = child.edit();
                epc.putInt("child_sp", position);
                epc.commit();

                switch(asd) {
                    case 0:
                        asd = 0;
                        break;
                    case 1:
                        asd = 1;
                        break;
                    case 2:
                        asd = 2;
                        break;
                    case 3:
                        asd = 3;
                        break;
                    case 4:
                        asd = 4;
                        break;
                    case 5:
                        asd = 5;
                        break;
                    case 6:
                        asd = 6;
                        break;
                    case 7:
                        asd = 7;
                        break;
                    case 8:
                        asd = 8;
                        break;
                    case 9:
                        asd = 9;
                        break;

                    default:
                        break;
                }

                SharedPreferences.Editor ec = child.edit();
                ec.putInt("child", asd);
                ec.commit();

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        SharedPreferences baby = getSharedPreferences("baby", MODE_PRIVATE);
        //子供の設定
        ArrayAdapter<CharSequence> adapter_b =
                ArrayAdapter.createFromResource(this, R.array.adult_array,android.R.layout.simple_spinner_item);

        adapter_b.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        human = (Spinner)findViewById(R.id.spinner_b);
        human.setAdapter(adapter_b);
        human.setSelection(baby.getInt("baby_sp",0));
        human.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            SharedPreferences baby = getSharedPreferences("baby", MODE_PRIVATE);

            @Override

            public void onItemSelected(AdapterView parent, View view, int position, long id) {
                Spinner spinner = (Spinner) parent;
                //spinner.setSelection(1);
                TextView test = (TextView) view;

                switch(position){
                    case 0:spinner.setSelection(0);break;
                    case 1:spinner.setSelection(1);break;
                    case 2:spinner.setSelection(2);break;
                    case 3:spinner.setSelection(3);break;
                    case 4:spinner.setSelection(4);break;
                    case 5:spinner.setSelection(5);break;
                    case 6:spinner.setSelection(6);break;
                    case 7:spinner.setSelection(7);break;
                    case 8:spinner.setSelection(8);break;
                    default:break;
                }

                String g =test.getText().toString();

                int asd = Integer.valueOf(g);

                SharedPreferences.Editor epc = baby.edit();
                epc.putInt("baby_sp", position);
                epc.commit();

                switch(asd) {
                    case 0:
                        asd = 0;
                        break;
                    case 1:
                        asd = 1;
                        break;
                    case 2:
                        asd = 2;
                        break;
                    case 3:
                        asd = 3;
                        break;
                    case 4:
                        asd = 4;
                        break;
                    case 5:
                        asd = 5;
                        break;
                    case 6:
                        asd = 6;
                        break;
                    case 7:
                        asd = 7;
                        break;
                    case 8:
                        asd = 8;
                        break;
                    case 9:
                        asd = 9;
                        break;

                    default:
                        break;
                }

                SharedPreferences.Editor ec = baby.edit();
                ec.putInt("baby", asd);
                ec.commit();

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        SharedPreferences limit = getSharedPreferences("limit", MODE_PRIVATE);
        //子供の設定
        ArrayAdapter<CharSequence> adapter_l =
                ArrayAdapter.createFromResource(this, R.array.limit_array,android.R.layout.simple_spinner_item);

        adapter_l.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        human = (Spinner)findViewById(R.id.spinner_l);
        human.setAdapter(adapter_l);
        human.setSelection(limit.getInt("limit_sp",0));
        human.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            SharedPreferences limit = getSharedPreferences("limit", MODE_PRIVATE);

            @Override

            public void onItemSelected(AdapterView parent, View view, int position, long id) {
                Spinner spinner = (Spinner) parent;
                //spinner.setSelection(1);
                TextView test = (TextView) view;

                switch(position){
                    case 0:spinner.setSelection(0);break;
                    case 1:spinner.setSelection(1);break;
                    case 2:spinner.setSelection(2);break;
                    default:break;
                }

                String g =test.getText().toString();

                int asd = Integer.valueOf(g);

                SharedPreferences.Editor epc = limit.edit();
                epc.putInt("limit_sp", position);
                epc.commit();

                switch(asd) {
                    case 0:
                        asd = 14;
                        break;
                    case 1:
                        asd = 30;
                        break;
                    case 2:
                        asd = 60;
                        break;

                    default:
                        break;
                }

                SharedPreferences.Editor ec = limit.edit();
                ec.putInt("limit", asd);
                ec.commit();

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });



        ImageView btnDisp = (ImageView)findViewById(R.id.food_button);
        btnDisp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.nakayamanobuo.kadai1","com.example.nakayamanobuo.kadai1.food");
                startActivity(intent);
            }
        });

        ImageView btnstk = (ImageView)findViewById(R.id.stock_button);
        btnstk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.nakayamanobuo.kadai1","com.example.nakayamanobuo.kadai1.stock");
                startActivity(intent);
            }
        });

        ImageView btnfood = (ImageView)findViewById(R.id.home);
        btnfood.setOnClickListener(new View.OnClickListener() {
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
