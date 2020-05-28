package com.aimtech.adi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button Btn9,Btn10,Btn11,Btn13,Btn17,Btn19,Btn21,Btn23,Btn_it120,Btn_it165,Btn_it220,Btn_sp15,Btn_sp18,Btn_sp22,Btn_add,Btn_mul;
    Button Btn_clear,Btn_Bracket,Btn_equal;
    Button Button01,Button02,Button03,Button04,Button05,Button06,Button07,Button08,Button09,Button00;
    EditText editText;
    TextView tvOutput;
    String process=" ";
    boolean checkBracket = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button01=findViewById(R.id.Button_01);
        Button02=findViewById(R.id.Button_02);
        Button03=findViewById(R.id.Button_03);
        Button04=findViewById(R.id.Button_04);
        Button05=findViewById(R.id.Button_05);
        Button06=findViewById(R.id.Button_06);
        Button07=findViewById(R.id.Button_07);
        Button08=findViewById(R.id.Button_08);
        Button09=findViewById(R.id.Button_09);
        Button00=findViewById(R.id.Button_00);

        Btn9=findViewById(R.id.btn_9);
        Btn10=findViewById(R.id.btn_10);
        Btn11=findViewById(R.id.btn_11);
        Btn13=findViewById(R.id.btn_13);
        Btn17=findViewById(R.id.btn_17);
        Btn19=findViewById(R.id.btn_19);
        Btn21=findViewById(R.id.btn_21);
        Btn23=findViewById(R.id.btn_23);
        Btn_it120=findViewById(R.id.btn_it120);
        Btn_it165=findViewById(R.id.btn_it165);
        Btn_it220=findViewById(R.id.btn_it220);
        Btn_sp15=findViewById(R.id.btn_sp15);
        Btn_sp18=findViewById(R.id.btn_sp18);
        Btn_sp22=findViewById(R.id.btn_sp22);
        editText=findViewById(R.id.editText);
        tvOutput=findViewById(R.id.textView);
        Btn_add=findViewById(R.id.btn_add);
        Btn_mul=findViewById(R.id.btn_mul);
        Btn_clear=findViewById(R.id.btn_clear);
        Btn_Bracket=findViewById(R.id.Btn_brac);
        Btn_equal=findViewById(R.id.btn_equal);

        Btn9.setOnClickListener(this);
        Btn10.setOnClickListener(this);
        Btn11.setOnClickListener(this);
        Btn13.setOnClickListener(this);
        Btn17.setOnClickListener(this);
        Btn19.setOnClickListener(this);
        Btn21.setOnClickListener(this);
        Btn23.setOnClickListener(this);
        Btn_it120.setOnClickListener(this);
        Btn_it165.setOnClickListener(this);
        Btn_it220.setOnClickListener(this);
        Btn_sp15.setOnClickListener(this);
        Btn_sp18.setOnClickListener(this);
        Btn_sp22.setOnClickListener(this);
        Btn_add.setOnClickListener(this);
        Btn_mul.setOnClickListener(this);
        Btn_clear.setOnClickListener(this);
        Btn_Bracket.setOnClickListener(this);
        Btn_equal.setOnClickListener(this);
        Button01.setOnClickListener(this);
        Button02.setOnClickListener(this);
        Button03.setOnClickListener(this);
        Button04.setOnClickListener(this);
        Button05.setOnClickListener(this);
        Button06.setOnClickListener(this);
        Button07.setOnClickListener(this);
        Button08.setOnClickListener(this);
        Button09.setOnClickListener(this);
        Button00.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.Button_01:process = editText.getText().toString();
                editText.setText(process+"1");break;
            case R.id.Button_02:process = editText.getText().toString();
                editText.setText(process+"2");break;
            case R.id.Button_03:process = editText.getText().toString();
                editText.setText(process+"3");break;
            case R.id.Button_04:process = editText.getText().toString();
                editText.setText(process+"4");break;
            case R.id.Button_05:process = editText.getText().toString();
                editText.setText(process+"5");break;
            case R.id.Button_06:process = editText.getText().toString();
                editText.setText(process+"6");break;
            case R.id.Button_07:process = editText.getText().toString();
                editText.setText(process+"7");break;
            case R.id.Button_08:process = editText.getText().toString();
                editText.setText(process+"8");break;
            case R.id.Button_09:process = editText.getText().toString();
                editText.setText(process+"9");break;
            case R.id.Button_00:process = editText.getText().toString();
                editText.setText(process+"0");break;

            case R.id.btn_9:process = editText.getText().toString();
                editText.setText(process+"16.9");

                break;
            case R.id.btn_10:process = editText.getText().toString();
                editText.setText(process+"17.5");
                break;
            case R.id.btn_11:process = editText.getText().toString();
                editText.setText(process+"20.3");
                break;
            case R.id.btn_13:process = editText.getText().toString();
                editText.setText(process+"25.3");
                break;
            case R.id.btn_17:process = editText.getText().toString();
                editText.setText(process+"34.6");
                break;
            case R.id.btn_19:process = editText.getText().toString();
                editText.setText(process+"35");
                break;
            case R.id.btn_21:process = editText.getText().toString();
                editText.setText(process+"38");
                break;
            case R.id.btn_23:process = editText.getText().toString();
                editText.setText(process+"43");
                break;
            case R.id.btn_it120:process = editText.getText().toString();
                editText.setText(process+"52");
                break;
            case R.id.btn_it165:process = editText.getText().toString();
                editText.setText(process+"58");
                break;
            case R.id.btn_it220:process = editText.getText().toString();
                editText.setText(process+"64");
                break;
            case R.id.btn_sp15:process = editText.getText().toString();
                editText.setText(process+"25");
                break;
            case R.id.btn_sp18:process = editText.getText().toString();
                editText.setText(process+"32.9");
                break;
            case R.id.btn_sp22:process = editText.getText().toString();
                editText.setText(process+"40.1");
                break;
            case R.id.btn_add:process = editText.getText().toString();
                editText.setText(process+"+");
                break;
            case R.id.btn_mul:process = editText.getText().toString();
                editText.setText(process+"*");
                break;
            case R.id.Btn_brac:
                if (checkBracket){
                    process = editText.getText().toString();
                    editText.setText(process + ")");
                    checkBracket = false;
                }else{process = editText.getText().toString();
                    editText.setText(process + "(");
                    checkBracket = true;
                }

                break;
            case R.id.btn_clear:
                tvOutput.setTextColor(Color.BLACK);
                checkBracket = false;
                process=" ";
                editText.setText(" ");
                tvOutput.setText(R.string.adi_power_system);
                break;

            case R.id.btn_equal:
                process = editText.getText().toString();

                Context rhino = Context.enter();

                rhino.setOptimizationLevel(-1);

                String final_Result = "";

                try {
                    Scriptable scriptable = rhino.initStandardObjects();
                    final_Result = rhino.evaluateString(scriptable,process,"javascript",1,null).toString();
                }catch (Exception e){
                    final_Result="0";
                }
                if(Double.parseDouble(final_Result)>2500)
                {
                    tvOutput.setTextColor(Color.RED);
                }
                else {
                    tvOutput.setTextColor(Color.BLACK);
                }

                tvOutput.setText(final_Result);

                break;



        }


    }
}
