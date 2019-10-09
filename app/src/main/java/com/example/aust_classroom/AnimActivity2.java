package com.example.aust_classroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimActivity2 extends AppCompatActivity {

    private ImageView imageViewAnim2;
    private TextView textViewAnim2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim2);

        imageViewAnim2 = findViewById(R.id.imageviewanim2);
        textViewAnim2 = findViewById(R.id.textviewanim2);
        textViewAnim2.setText("Aust Classroom\n\nby\n\nFahmid Muttaki Aurnob\n&\nJarin Sultana\n\n\nAust CSE 2.2");

        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.mytransition2);

        imageViewAnim2.startAnimation(myanim2);
        textViewAnim2.startAnimation(myanim2);

        final Intent intent = new Intent(AnimActivity2.this, MainActivity.class);

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
