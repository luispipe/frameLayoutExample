package com.example.framelayoutexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton= findViewById(R.id.button);
        ImageView imagen= findViewById(R.id.imageView);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inicializamos o creamos la animación
                AnimationSet animationSet = new AnimationSet(true);
               //Se agregan caracteristicas a la animación (f es igual a flotante)
                animationSet.addAnimation(new ScaleAnimation(0.5f,1.5f,0.5f,1.5f));
                animationSet.addAnimation(new RotateAnimation(0,360,
                        Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f));
                animationSet.setDuration(2000);
                animationSet.setInterpolator(new AccelerateInterpolator());
                //Se le asigna la animación a la imagen
                imagen.startAnimation(animationSet);
            }
        });


    }
}