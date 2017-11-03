package com.example.stephan.yolopatatov5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    ImageView[] bodyImages = new ImageView[10];
    String[] bodyParts = {"arms", "ears", "eyebrows", "eyes", "glasses", "head",  "mouth",
                            "mustache", "nose", "shoes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBodyParts();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        for(int i = 0; i < bodyParts.length; i++) {
            savedInstanceState.putInt(bodyParts[i], bodyImages[i].getVisibility());
        }
    }

    @Override
    public void onRestoreInstanceState(Bundle saveInstanceState) {
        initBodyParts();
        super.onRestoreInstanceState(saveInstanceState);
        for(int i = 0; i < bodyParts.length; i++) {
            bodyImages[i].setVisibility(saveInstanceState.getInt(bodyParts[i]));
        }
    }

    public void initBodyParts() {
        bodyImages[0] = findViewById(R.id.arms);
        bodyImages[1] = findViewById(R.id.ears);
        bodyImages[2] = findViewById(R.id.eyebrown);
        bodyImages[3] = findViewById(R.id.eyes);
        bodyImages[4] = findViewById(R.id.glass);
        bodyImages[5] = findViewById(R.id.hat);
        bodyImages[6] = findViewById(R.id.mouth);
        bodyImages[7] = findViewById(R.id.mustache);
        bodyImages[8] = findViewById(R.id.nose);
        bodyImages[9] = findViewById(R.id.shoes);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {

            case R.id.CBarms:
                bodyImages[0] = findViewById(R.id.arms);
                bodyImages[0].setVisibility(checked ? View.VISIBLE: View.INVISIBLE);
                break;

            case R.id.CBears:
                bodyImages[1] = findViewById(R.id.ears);
                bodyImages[1].setVisibility(checked ? View.VISIBLE: View.INVISIBLE);
                break;

            case R.id.CBeyebrow:
                bodyImages[2] = findViewById(R.id.eyebrown);
                bodyImages[2].setVisibility(checked ? View.VISIBLE: View.INVISIBLE);
                break;

            case R.id.CBeyes:
                bodyImages[3] = findViewById(R.id.eyes);
                bodyImages[3].setVisibility(checked ? View.VISIBLE: View.INVISIBLE);
                break;

            case R.id.CBglasses:
                bodyImages[4] = findViewById(R.id.glass);
                bodyImages[4].setVisibility(checked ? View.VISIBLE: View.INVISIBLE);
                break;

            case R.id.CBhat:
                bodyImages[5] = findViewById(R.id.hat);
                bodyImages[5].setVisibility(checked ? View.VISIBLE: View.INVISIBLE);
                break;

            case R.id.CBmouth:
                bodyImages[6] = findViewById(R.id.mouth);
                bodyImages[6].setVisibility(checked ? View.VISIBLE: View.INVISIBLE);
                break;

            case R.id.CBmustache:
                bodyImages[7] = findViewById(R.id.mustache);
                bodyImages[7].setVisibility(checked ? View.VISIBLE: View.INVISIBLE);
                break;
            case R.id.CBnose:
                bodyImages[8]= findViewById(R.id.nose);
                bodyImages[8].setVisibility(checked ? View.VISIBLE: View.INVISIBLE);
                break;

            case R.id.CBshoes:
                bodyImages[9] = findViewById(R.id.shoes);
                bodyImages[9].setVisibility(checked ? View.VISIBLE: View.INVISIBLE);
                break;
        }
    }
}