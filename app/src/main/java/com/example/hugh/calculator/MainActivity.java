package com.example.hugh.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String disformula = "";
    private String result = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Computing computing;

        final TextView textViewFormula = (TextView) findViewById(R.id.textViewFormula);
        final TextView textViewResult = (TextView) findViewById(R.id.textViewResult);

        ImageView imageViewButton0 = (ImageView) findViewById(R.id.imageViewButton0);
        ImageView imageViewButton1 = (ImageView) findViewById(R.id.imageViewButton1);
        ImageView imageViewButton2 = (ImageView) findViewById(R.id.imageViewButton2);
        ImageView imageViewButton3 = (ImageView) findViewById(R.id.imageViewButton3);
        ImageView imageViewButton4 = (ImageView) findViewById(R.id.imageViewButton4);
        ImageView imageViewButton5 = (ImageView) findViewById(R.id.imageViewButton5);
        ImageView imageViewButton6 = (ImageView) findViewById(R.id.imageViewButton6);
        ImageView imageViewButton7 = (ImageView) findViewById(R.id.imageViewButton7);
        ImageView imageViewButton8 = (ImageView) findViewById(R.id.imageViewButton8);
        ImageView imageViewButton9 = (ImageView) findViewById(R.id.imageViewButton9);

        ImageView imageViewReset = (ImageView) findViewById(R.id.imageViewReset);
        ImageView imageViewChangeSign = (ImageView) findViewById(R.id.imageViewChangeSign);
        ImageView imageViewPercent = (ImageView) findViewById(R.id.imageViewPercent);
        ImageView imageViewDivide = (ImageView) findViewById(R.id.imageViewDivide);
        ImageView imageViewTimes = (ImageView) findViewById(R.id.imageViewTimes);
        ImageView imageViewMinus = (ImageView) findViewById(R.id.imageViewMinus);
        ImageView imageViewPlus = (ImageView) findViewById(R.id.imageViewPlus);
        ImageView imageViewEquals = (ImageView) findViewById(R.id.imageViewEquals);
        ImageView imageViewPoint = (ImageView) findViewById(R.id.imageViewPoint);



        imageViewButton0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                disformula = String.valueOf(textViewFormula.getText());
                char[] disformulaToCahr = disformula.toCharArray();
                String disformulaLsatChar = String.valueOf(disformulaToCahr[disformulaToCahr.length-1]);
                String cons = "123456789.";
                //char[] cons = {'1', '2', '3', '4', '5', '6', '7', '8','9','.'};
                if (disformula.matches("") || cons.indexOf(disformulaLsatChar)==-1) {
                    textViewFormula.setText(disformula);
                }else {
                    textViewFormula.setText(disformula + "0");
                }
            }
        });

        imageViewButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disformula = String.valueOf(textViewFormula.getText());
                textViewFormula.setText(disformula + "1");
            }
        });

        imageViewButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disformula = String.valueOf(textViewFormula.getText());
                textViewFormula.setText(disformula + "2");
            }
        });

        imageViewButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disformula = String.valueOf(textViewFormula.getText());
                textViewFormula.setText(disformula + "3");
            }
        });

        imageViewButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disformula = String.valueOf(textViewFormula.getText());
                textViewFormula.setText(disformula + "4");
            }
        });

        imageViewButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disformula = String.valueOf(textViewFormula.getText());
                textViewFormula.setText(disformula + "5");
            }
        });

        imageViewButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disformula = String.valueOf(textViewFormula.getText());
                textViewFormula.setText(disformula + "6");
            }
        });

        imageViewButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disformula = String.valueOf(textViewFormula.getText());
                textViewFormula.setText(disformula + "7");
            }
        });

        imageViewButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disformula = String.valueOf(textViewFormula.getText());
                textViewFormula.setText(disformula + "8");
            }
        });

        imageViewButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disformula = String.valueOf(textViewFormula.getText());
                textViewFormula.setText(disformula + "9");
            }
        });

        imageViewPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disformula = String.valueOf(textViewFormula.getText());
                result = String.valueOf(textViewResult.getText());
                char[] disformulaToCahr = disformula.toCharArray();
                String disformulaLsatChar = String.valueOf(disformulaToCahr[disformulaToCahr.length-1]);
                String cons = "1234567890";
                String operator = "+-\u00F7\u00D7";
                if (cons.indexOf(disformulaLsatChar)!=-1) {
                    textViewFormula.setText(disformula + ".");
                }else if (operator.indexOf(disformulaLsatChar)!=-1) {
                    textViewFormula.setText(disformula +"0.");
                }else if (! result.matches("")) {
                    textViewFormula.setText("0.");
                    textViewResult.setText("");
                }else {
                    textViewFormula.setText(disformula);
                }
            }
        });

        imageViewPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disformula = String.valueOf(textViewFormula.getText());
                result = String.valueOf(textViewResult.getText());
                char[] disformulaToCahr = disformula.toCharArray();
                String disformulaLsatChar = String.valueOf(disformulaToCahr[disformulaToCahr.length-1]);
                String operator = "+-\u00F7\u00D7";
                if (! result.matches("")) {
                    textViewFormula.setText(result + "+");
                    textViewResult.setText("");
                }else if ((!disformula.matches("")) && (operator.indexOf(disformulaLsatChar) == -1)) {
                    textViewFormula.setText(disformula + "+");
                }else {
                    textViewFormula.setText(disformula);
                }
            }
        });

        imageViewMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disformula = String.valueOf(textViewFormula.getText());
                result = String.valueOf(textViewResult.getText());
                char[] disformulaToCahr = disformula.toCharArray();
                String disformulaLsatChar = String.valueOf(disformulaToCahr[disformulaToCahr.length-1]);
                String operator = "+-\u00F7\u00D7";
                if (! result.matches("")) {
                    textViewFormula.setText(result + "-");
                    textViewResult.setText("");
                }else if ((!disformula.matches("")) && (operator.indexOf(disformulaLsatChar) == -1)) {
                    textViewFormula.setText(disformula + "-");
                }else {
                    textViewFormula.setText(disformula);
                }
            }
        });

        imageViewTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disformula = String.valueOf(textViewFormula.getText());
                result = String.valueOf(textViewResult.getText());
                char[] disformulaToCahr = disformula.toCharArray();
                String disformulaLsatChar = String.valueOf(disformulaToCahr[disformulaToCahr.length-1]);
                String operator = "+-\u00F7\u00D7";
                if (! result.matches("")) {
                    textViewFormula.setText(result + "\u00D7");
                    textViewResult.setText("");
                }else if ((!disformula.matches("")) && (operator.indexOf(disformulaLsatChar) == -1)) {
                    textViewFormula.setText(disformula + "\u00D7");
                }else {
                    textViewFormula.setText(disformula);
                }
            }
        });

        imageViewDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disformula = String.valueOf(textViewFormula.getText());
                result = String.valueOf(textViewResult.getText());
                char[] disformulaToCahr = disformula.toCharArray();
                String disformulaLsatChar = String.valueOf(disformulaToCahr[disformulaToCahr.length-1]);
                String operator = "+-\u00F7\u00D7";
                if (! result.matches("")) {
                    textViewFormula.setText(result + "\u00F7");
                    textViewResult.setText("");
                }else if ((!disformula.matches("")) && (operator.indexOf(disformulaLsatChar) == -1)) {
                    textViewFormula.setText(disformula + "\u00F7");
                }else {
                    textViewFormula.setText(disformula);
                }
            }
        });

        imageViewReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewFormula.setText("");
                textViewResult.setText("");
            }
        });

        imageViewEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                disformula = String.valueOf(textViewFormula.getText());
//                Computing computing = new Computing(disformula);
//                String computResult = computing.getmResult();
//                textViewResult.setText(computResult);
                disformula = String.valueOf(textViewFormula.getText());
                result = String.valueOf(textViewResult.getText());
                char[] disformulaToCahr = disformula.toCharArray();
                String disformulaLsatChar = String.valueOf(disformulaToCahr[disformulaToCahr.length-1]);
                String operator = "+-\u00F7\u00D7";
                if (result.matches("") && disformula.matches("")){
                    textViewFormula.setText("");
                    textViewResult.setText("");
                }else if (operator.indexOf(disformulaLsatChar)!=-1) {
                    textViewFormula.setText(disformula);
                }else {
                    Computing computing = new Computing(disformula);
                    String computResult = computing.getmResult();
                    textViewFormula.setText("");
                    textViewResult.setText(computResult);
                }
            }
        });


    }
}
