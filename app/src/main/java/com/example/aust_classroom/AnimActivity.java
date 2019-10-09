package com.example.aust_classroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimActivity extends AppCompatActivity {

    private ImageView imageViewAnim;
    private TextView textViewAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim);

        imageViewAnim = findViewById(R.id.imageviewanim);
        textViewAnim = findViewById(R.id.textviewanim);
        textViewAnim.setText("Ahsanullah University\nof\nScience & Technology");

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);

        imageViewAnim.startAnimation(myanim);
        textViewAnim.startAnimation(myanim);

        final Intent intent = new Intent(AnimActivity.this, AnimActivity2.class);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();

    }
}
