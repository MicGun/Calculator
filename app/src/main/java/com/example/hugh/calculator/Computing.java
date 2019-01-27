package com.example.hugh.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Computing {
    private String mDisformula;
    private String mResult;
    //List<String> formulaSplitByOperator;


    public Computing(String mDisformula) {
        this.mDisformula = mDisformula;
    }



    public String getmResult() {
        char[] formulaChat = mDisformula.toCharArray();
        List<String> formulaSplitByOperator = formulaSplitByOperator(formulaChat);
        List<String> calculateTimesDivide = calculateTimesDivide(formulaSplitByOperator);
        mResult = calculateResult(calculateTimesDivide);

        return mResult;
    }

    private String calculateResult(List<String> calculateTimesDivide) {
        List<String> calculateResultList = new ArrayList<>();
        List<String> buffList = calculateTimesDivide;
        String calculateResult;
        Object[] obj =  calculateTimesDivide.toArray();
        String[] stringarray = Arrays.copyOf(obj, obj.length, String[].class);
        //String[] stringarray = GetStringArray((ArrayList<String>) calculateTimesDivide);
        String operator = "+-";
        int index2 = 0;
        double numb1;
        double numb2;

        do {
            String s = stringarray[index2];
            if (operator.indexOf(s)==-1){
                calculateResultList.add(s);
                buffList.remove(0);
                index2++;
            }else {
                String num1 = calculateResultList.get(calculateResultList.size()-1);
                calculateResultList.remove(calculateResultList.size()-1);
                buffList.remove(0);
                String num2 = buffList.get(0);
                numb1 = Double.parseDouble(num1);
                numb2 = Double.parseDouble(num2);
                double subTatol;
                if (s=="+") {
                    subTatol = numb1+numb2;
                }else {
                    subTatol = numb1-numb2;
                }
                calculateResultList.add(String.valueOf(subTatol));
                buffList.remove(0);
                index2+=2;
            }
        }while (buffList.size() < 1);
        calculateResult = calculateResultList.get(0);
        return calculateResult;
    }

    private List<String> calculateTimesDivide(List<String> formulaSplitByOperator) {
        List<String> calculateTimesDivide = new ArrayList<String>();
        List<String> buffList = formulaSplitByOperator;
        Object[] obj =  formulaSplitByOperator.toArray();
        String[] stringarray = Arrays.copyOf(obj, obj.length, String[].class);
        //String[] stringarray = GetStringArray((ArrayList<String>) formulaSplitByOperator);
        String operator = "\u00F7\u00D7";
        int index = 0;
        double numb1;
        double numb2;

        do {
            String s = stringarray[index];
            if (operator.indexOf(s) == -1) {
                calculateTimesDivide.add(s);
                buffList.remove(0);
                index++;
            }else {
                String num1 = calculateTimesDivide.get(calculateTimesDivide.size()-1);
                calculateTimesDivide.remove(calculateTimesDivide.size()-1);
                buffList.remove(0);
                String num2 =  stringarray[index+1];
                numb1 = Double.parseDouble(num1);
                numb2 = Double.parseDouble(num2);
                double subTatol;
                if (s=="\u00D7") {
                    subTatol = numb1*numb2;
                }else {
                    subTatol = numb1/numb2;
                }
                calculateTimesDivide.add(String.valueOf(subTatol));
                buffList.remove(0);
                index+=2;
            }
        }while (buffList.size() < 1);
        return calculateTimesDivide;
    }


    private List<String> formulaSplitByOperator(char[] formulaChat) {
        List<String> formulaSplitByOperator = new ArrayList<String>();

        String operator = "+-\u00F7\u00D7";
        String stringBuff = "";
        for (char c : formulaChat) {
            if (operator.indexOf(c)==-1){
                stringBuff = stringBuff + String.valueOf(c);
            }else {
                formulaSplitByOperator.add(stringBuff);
                formulaSplitByOperator.add(String.valueOf(c));
                stringBuff = "";
            }
        }
        return formulaSplitByOperator;
    }

    public static String[] GetStringArray(ArrayList<String> arr)
    {

        // declaration and initialise String Array
        String str[] = new String[arr.size()];

        // ArrayList to Array Conversion
        for (int j = 0; j < arr.size(); j++) {

            // Assign each value to String array
            str[j] = arr.get(j);
        }

        return str;
    }

}
