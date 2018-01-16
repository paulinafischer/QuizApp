package com.example.android.quizapp;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tx1, tx2, tx3;
    Typeface tf1, tf2, tf3;
    private static int score = 0;
    private EditText editTextAnswer1;
    private EditText editTextAnswer2;
    private EditText editTextAnswer3;
    private EditText editTextAnswer1_Q8;
    private EditText editTextAnswer2_Q8;
    private EditText editTextAnswer3_Q8;
    private CheckBox box1;
    private CheckBox box2;
    private CheckBox box3;
    private CheckBox box4;
    private CheckBox box5;
    private CheckBox box6;
    private CheckBox box7;
    private CheckBox box8;
    private CheckBox box9;
    private CheckBox box10;
    private CheckBox box11;
    private CheckBox box12;
    private boolean isChoiceBoxA1 = false;
    private boolean isChoiceBoxA2 = false;
    private boolean isChoiceBoxA3 = false;
    private boolean isChoiceBoxA4 = false;
    private boolean isChoiceBoxB5 = false;
    private boolean isChoiceBoxB6 = false;
    private boolean isChoiceBoxB7 = false;
    private boolean isChoiceBoxB8 = false;
    private boolean isChoiceBoxC9 = false;
    private boolean isChoiceBoxC10 = false;
    private boolean isChoiceBoxC11 = false;
    private boolean isChoiceBoxC12 = false;
    private RadioGroup radioGroupQuizA;
    private RadioGroup radioGroupQuizB;
    private RadioGroup radioGroupQuizC;
    private boolean isChoiceRadio1 = false;
    private boolean isChoiceRadio2 = false;
    private boolean isChoiceRadio3 = false;
    private boolean isChoiceRadio4 = false;
    private boolean isChoiceRadio5 = false;
    private boolean isChoiceRadio6 = false;
    private RadioGroup.OnCheckedChangeListener radioCheckChangeListener;
    private CompoundButton.OnCheckedChangeListener chkCheckedListner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.music);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);


        Resources res = getResources();
            float height = res.getDimension(R.dimen.layout_height);
            float width = res.getDimension(R.dimen.layout_width);
            float radius = res.getDimension(R.dimen.layout_radius);
            float text_p = res.getDimension(R.dimen.text_p);
            float text_h1 = res.getDimension(R.dimen.text_h1);
            float text_h2 = res.getDimension(R.dimen.text_h2);
            float text_h3 = res.getDimension(R.dimen.text_h3);
            float padding = res.getDimension(R.dimen.padding);
            float padding_left_image = res.getDimension(R.dimen.padding_left_image);
            float padding_vertical = res.getDimension(R.dimen.padding_vertical);
            float padding_horizontal = res.getDimension(R.dimen.padding_horizontal);
            float margin_vertical = res.getDimension(R.dimen.margin_vertical);
            float margin_bottom = res.getDimension(R.dimen.margin_bottom);
            float margin = res.getDimension(R.dimen.margin);
            float quizbox_padding = res.getDimension(R.dimen.quiz_box_padding);
            float quizbox_margin = res.getDimension(R.dimen.quiz_box_margin);
            float quizmargin = res.getDimension(R.dimen.quiz_margin);
            float cover_height = res.getDimension(R.dimen.cover_height);
            float cover_margin_bottom = res.getDimension(R.dimen.cover_margin_bottom);
            float cover_image_top = res.getDimension(R.dimen.cover_image_top);
            float cover_text_margin_top = res.getDimension(R.dimen.cover_text_margin_top);
            float margin_bottom_check = res.getDimension(R.dimen.margin_bottom_check);
            float padding_button= res.getDimension(R.dimen.padding_button);
            float margin_button= res.getDimension(R.dimen.margin_button);
            String submitText = getResources().getString(R.string.submit_label);
            String app_name = getResources().getString(R.string.app_name);
            String reset = getResources().getString(R.string.reset_label);
            String title1 = getResources().getString(R.string.title1);
            String title2 = getResources().getString(R.string.title2);
            String title3 = getResources().getString(R.string.title3);
            String let = getResources().getString(R.string.lets);
            String instruction = getResources().getString(R.string.instruction);
            String instruction2 = getResources().getString(R.string.instruction2);
            String q1 = getResources().getString(R.string.questionOne);
            String q2 = getResources().getString(R.string.questionTwo);
            String q3 = getResources().getString(R.string.questionThree);
            String q4 = getResources().getString(R.string.questionFour);
            String q5 = getResources().getString(R.string.questionFive);
            String q6 = getResources().getString(R.string.questionSix);
            String q7 = getResources().getString(R.string.questionSeven);
            String Spanish1 = getResources().getString(R.string.Spanish1);
            String Spanish2 = getResources().getString(R.string.Spanish2);
            String Spanish3 = getResources().getString(R.string.Spanish3);
            String Spanish4 = getResources().getString(R.string.Spanish4);
            String French1 = getResources().getString(R.string.French1);
            String French2 = getResources().getString(R.string.French2);
            String French3 = getResources().getString(R.string.French3);
            String French4 = getResources().getString(R.string.French1);
            String Italian1 = getResources().getString(R.string.Italian1);
            String Italian2 = getResources().getString(R.string.Italian2);
            String Italian3 = getResources().getString(R.string.Italian3);
            String Italian4 = getResources().getString(R.string.Italian1);
            String Choose1 = getResources().getString(R.string.choose1);
            String Choose2 = getResources().getString(R.string.choose2);
            String Choose3 = getResources().getString(R.string.choose3);
            String Choose4 = getResources().getString(R.string.choose4);
            String Choose5 = getResources().getString(R.string.choose5);
            String Choose6 = getResources().getString(R.string.choose1);
            String name = getResources().getString(R.string.name);
            String web = getResources().getString(R.string.web);
        // Initialize the CheckBoxes-p.fischer
        box1= (CheckBox) findViewById(R.id.check_1);
        box2= (CheckBox) findViewById(R.id.check_2);
        box3= (CheckBox) findViewById(R.id.check_3);
        box4= (CheckBox) findViewById(R.id.check_4);
        box5= (CheckBox) findViewById(R.id.check_5);
        box6= (CheckBox) findViewById(R.id.check_6);
        box7= (CheckBox) findViewById(R.id.check_7);
        box8= (CheckBox) findViewById(R.id.check_8);
        box9= (CheckBox) findViewById(R.id.check_9);
        box10= (CheckBox) findViewById(R.id.check_10);
        box11= (CheckBox) findViewById(R.id.check_11);
        box12= (CheckBox) findViewById(R.id.check_12);
            // Initialize EditText-p.fischer
            editTextAnswer1 = (EditText) findViewById(R.id.answer_1);
            editTextAnswer2 = (EditText) findViewById(R.id.answer_2);
            editTextAnswer3 = (EditText) findViewById(R.id.answer_3);
            editTextAnswer1_Q8 = (EditText) findViewById(R.id.answer_1_Q8);
            editTextAnswer2_Q8 = (EditText) findViewById(R.id.answer_2_Q8);
            editTextAnswer3_Q8 = (EditText) findViewById(R.id.answer_3_Q8);


        // Initialize the RadioGroup-p.fischer
        radioGroupQuizA = (RadioGroup) findViewById(R.id.group1);
        radioGroupQuizB = (RadioGroup) findViewById(R.id.group2);
        radioGroupQuizC = (RadioGroup) findViewById(R.id.group3);
        setListeners();
        tx1 = (TextView) findViewById(R.id.h1);
        tx2 = (TextView) findViewById(R.id.below_h1);
        tx3 = (TextView) findViewById(R.id.h1_2);
        tf1 = Typeface.createFromAsset(getAssets(),"Capture_it_2.ttf");
        tf2 = Typeface.createFromAsset(getAssets(),"RobotoCondensed-Italic.ttf");
        tf3 = Typeface.createFromAsset(getAssets(),"Capture_it_2.ttf");
        tx1.setTypeface(tf1);
        tx2.setTypeface(tf2);
        tx3.setTypeface(tf3);
        }
    public void setListeners() {
        // CheckBox listeners-p.fischer
        chkCheckedListner = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton selectedCheckBox, boolean isChecked) {
                // Check which checkbox was clicked
                switch (selectedCheckBox.getId()) {
                    case R.id.check_1:
                        if (isChecked) {
                            isChoiceBoxA1 = true;
                        }
                        break;
                    case R.id.check_2:
                        if (isChecked) {
                            isChoiceBoxA2 = false;
                        }
                        break;
                    case R.id.check_3:
                        if (isChecked) {
                            isChoiceBoxA3 = false;
                        }
                        break;
                    case R.id.check_4:
                        if (isChecked) {
                            isChoiceBoxA4 = true;
                        }
                        break;
                    case R.id.check_5:
                        if (isChecked) {
                            isChoiceBoxB5 = false;
                        }
                        break;
                    case R.id.check_6:
                        if (isChecked) {
                            isChoiceBoxB6 = false;
                        }
                        break;
                    case R.id.check_7:
                        if (isChecked) {
                            isChoiceBoxB7 = true;
                        }
                        break;
                    case R.id.check_8:
                        if (isChecked) {
                            isChoiceBoxB8 = true;
                        }
                        break;
                    case R.id.check_9:
                        if (isChecked) {
                            isChoiceBoxC9 = true;
                        }
                        break;
                    case R.id.check_10:
                        if (isChecked) {
                            isChoiceBoxC10 = false;
                        }
                        break;
                    case R.id.check_11:
                        if (isChecked) {
                            isChoiceBoxC11 = true;
                        }
                        break;
                    case R.id.check_12:
                        if (isChecked) {
                            isChoiceBoxC12 = true;
                        }
                        break;
                }
            }
        };
       box1.setOnCheckedChangeListener(chkCheckedListner);
       box2.setOnCheckedChangeListener(chkCheckedListner);
       box3.setOnCheckedChangeListener(chkCheckedListner);
       box4.setOnCheckedChangeListener(chkCheckedListner);
       box5.setOnCheckedChangeListener(chkCheckedListner);
       box6.setOnCheckedChangeListener(chkCheckedListner);
       box7.setOnCheckedChangeListener(chkCheckedListner);
       box8.setOnCheckedChangeListener(chkCheckedListner);
       box9.setOnCheckedChangeListener(chkCheckedListner);
       box10.setOnCheckedChangeListener(chkCheckedListner);
       box11.setOnCheckedChangeListener(chkCheckedListner);
       box12.setOnCheckedChangeListener(chkCheckedListner);
        // RadioGroup Listeners-p.fischer
        radioCheckChangeListener = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (radioGroup.getId()) {
                    case R.id.group1:
                        if (R.id.radio_a == checkedId) {
                            isChoiceRadio1 = false;
                            Log.e("TAG", "onCheckedChanged: A ");
                    }
                    if (R.id.radio_b == checkedId) {
                        isChoiceRadio2 = true;
                        Log.e("TAG", "onCheckedChanged: B ");
                    }
                    break;
                    case R.id.group2:
                        if (R.id.radio_c == checkedId) {
                            isChoiceRadio3 = false;
                            Log.e("TAG", "onCheckedChanged: C ");
                        }
                        if (R.id.radio_d == checkedId) {
                            isChoiceRadio4 = true;
                            Log.e("TAG", "onCheckedChanged: D ");
                        }
                        break;
                    case R.id.group3:
                        if (R.id.radio_e == checkedId) {
                            isChoiceRadio5 = true;
                            Log.e("TAG", "onCheckedChanged: E ");
                        }
                        if (R.id.radio_f == checkedId) {
                            isChoiceRadio6 = false;
                            Log.e("TAG", "onCheckedChanged: F ");
                        }
                        break;
                }
            }
        };
        radioGroupQuizA.setOnCheckedChangeListener(radioCheckChangeListener);
        radioGroupQuizB.setOnCheckedChangeListener(radioCheckChangeListener);
        radioGroupQuizC.setOnCheckedChangeListener(radioCheckChangeListener);
    }
    public void addOne (View view) {
        score=0;
        if (isChoiceRadio2 && !isChoiceRadio1) {
            score += 1;
        }
        if (isChoiceRadio4 && !isChoiceRadio3) {
            score += 1;
        }
        if (isChoiceRadio5 && !isChoiceRadio6) {
            score += 1;
        }
        //test if code
        if (box1.isChecked() && box4.isChecked() && !box2.isChecked() && !box3.isChecked()) {
            score++;
        } else {
// do nothing here
        }
        display("SCORE: " + score);

/**end of the test if code*/
            if (box7.isChecked() && box8.isChecked() && !box5.isChecked() && !box6.isChecked()) {
                score++;
            }
        if (box9.isChecked() && box11.isChecked() && box12.isChecked() && !box10.isChecked()) {
            score++;
        } else {
// do nothing here
        }
            String answerOne = editTextAnswer1.getText().toString();
            if (answerOne.equals("Frau")) {
                score++;
            }
            String answerTwo = editTextAnswer2.getText().toString();
            if (answerTwo.equals("Katze")) {
                score++;
            }
            String answerThree = editTextAnswer3.getText().toString();
            if (answerThree.equals("Buch")) {
                score++;
        }
            String answerEightOne = editTextAnswer1_Q8.getText().toString();
        if (answerEightOne.equals("bröd")) {
            score++;
        }
        String answerEightTwo = editTextAnswer2_Q8.getText().toString();
        if (answerEightTwo.equals("klocka")) {
            score++;
        }
        String answerEightThree = editTextAnswer3_Q8.getText().toString();
        if (answerEightThree.equals("sova")) {
            score++;
        }
        display("SCORE: " + score);
        }
    public void reset(View view) {
        score=0;
        editTextAnswer1.setText("");
        editTextAnswer2.setText("");
        editTextAnswer3.setText("");
        editTextAnswer1_Q8.setText("");
        editTextAnswer2_Q8.setText("");
        editTextAnswer3_Q8.setText("");
        radioGroupQuizA.clearCheck();
        radioGroupQuizB.clearCheck();
        radioGroupQuizC.clearCheck();
        isChoiceRadio1=false;
        isChoiceRadio2=false;
        isChoiceRadio3=false;
        isChoiceRadio4=false;
        isChoiceRadio5=false;
        isChoiceRadio6=false;
        // Reset all CheckBoxes-p.fischer
        box1.setChecked(false);
        box2.setChecked(false);
        box3.setChecked(false);
        box4.setChecked(false);
        box5.setChecked(false);
        box6.setChecked(false);
        box7.setChecked(false);
        box8.setChecked(false);
        box9.setChecked(false);
        box10.setChecked(false);
        box11.setChecked(false);
        box12.setChecked(false);
        // Reset all RadioButtons
        for (int i = 0; i < radioGroupQuizA.getChildCount(); i++) {
            RadioButton childButton = (RadioButton) radioGroupQuizA.getChildAt(i);
            childButton.setChecked(false);
        }
        for (int i = 0; i < radioGroupQuizB.getChildCount(); i++) {
            RadioButton childButton = (RadioButton) radioGroupQuizB.getChildAt(i);
            childButton.setChecked(false);
        }
        for (int i = 0; i < radioGroupQuizC.getChildCount(); i++) {
            RadioButton childButton = (RadioButton) radioGroupQuizC.getChildAt(i);
            childButton.setChecked(false);
        }
        display("SCORE: " + score);
    }
    public void display(String message){
        TextView ScoreView = (TextView) findViewById(R.id.score);
        ScoreView.setText(message);
    }
    }
// Coded by Paulina Fischer

