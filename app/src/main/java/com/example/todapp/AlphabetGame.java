package com.example.todapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlphabetGame extends AppCompatActivity{

//    Button sA, sB, sC, sD, sE, sF, sG, sH, sI, sJ, sK, sL, sM, sN, sO, sP, sQ, sR, sS, sT, sU, sV, sW, sX, sY, sZ ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_game);


        Button levelOne = findViewById(R.id.level_one_btn);
        levelOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AlphabetLevelOne.class);
                startActivity(intent);
            }
        });

        Button levelTwo = findViewById(R.id.level_two_btn);
        levelTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AlphabetLevelTwo.class);
                startActivity(intent);
            }
        });




        final MediaPlayer a = MediaPlayer.create(this, R.raw.a);
        final MediaPlayer b = MediaPlayer.create(this, R.raw.b);
        final MediaPlayer c = MediaPlayer.create(this, R.raw.c);
        final MediaPlayer d = MediaPlayer.create(this, R.raw.d);
        final MediaPlayer e = MediaPlayer.create(this, R.raw.e);
        final MediaPlayer f = MediaPlayer.create(this, R.raw.f);
        final MediaPlayer g = MediaPlayer.create(this, R.raw.g);
        final MediaPlayer h = MediaPlayer.create(this, R.raw.h);
        final MediaPlayer i = MediaPlayer.create(this, R.raw.i);
        final MediaPlayer j = MediaPlayer.create(this, R.raw.j);
        final MediaPlayer k = MediaPlayer.create(this, R.raw.k);
        final MediaPlayer l = MediaPlayer.create(this, R.raw.l);
        final MediaPlayer m = MediaPlayer.create(this, R.raw.m);
        final MediaPlayer n = MediaPlayer.create(this, R.raw.n);
        final MediaPlayer o = MediaPlayer.create(this, R.raw.o);
        final MediaPlayer p = MediaPlayer.create(this, R.raw.p);
        final MediaPlayer q = MediaPlayer.create(this, R.raw.q);
        final MediaPlayer r = MediaPlayer.create(this, R.raw.r);
        final MediaPlayer s = MediaPlayer.create(this, R.raw.s);
        final MediaPlayer t = MediaPlayer.create(this, R.raw.t);
        final MediaPlayer u = MediaPlayer.create(this, R.raw.u);
        final MediaPlayer v = MediaPlayer.create(this, R.raw.v);
        final MediaPlayer w = MediaPlayer.create(this, R.raw.w);
        final MediaPlayer x = MediaPlayer.create(this, R.raw.x);
        final MediaPlayer y = MediaPlayer.create(this, R.raw.y);
        final MediaPlayer z = MediaPlayer.create(this, R.raw.z);

        Button sA = findViewById(R.id.a);
        Button sB = findViewById(R.id.b);
        Button sC = findViewById(R.id.c);
        Button sD = findViewById(R.id.d);
        Button sE = findViewById(R.id.e);
        Button sF = findViewById(R.id.f);
        Button sG = findViewById(R.id.g);
        Button sH = findViewById(R.id.h);
        Button sI = findViewById(R.id.i);
        Button sJ = findViewById(R.id.j);
        Button sK = findViewById(R.id.k);
        Button sL = findViewById(R.id.l);
        Button sM = findViewById(R.id.m);
        Button sN = findViewById(R.id.n);
        Button sO = findViewById(R.id.o);
        Button sP = findViewById(R.id.p);
        Button sQ = findViewById(R.id.q);
        Button sR = findViewById(R.id.r);
        Button sS = findViewById(R.id.s);
        Button sT = findViewById(R.id.t);
        Button sU = findViewById(R.id.u);
        Button sV = findViewById(R.id.v);
        Button sW = findViewById(R.id.w);
        Button sX = findViewById(R.id.x);
        Button sY = findViewById(R.id.y);
        Button sZ = findViewById(R.id.z);


        sA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.start();
            }
        });
        sB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.start();
            }
        });
        sC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c.start();
            }
        });
        sD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d.start();
            }
        });
        sE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.start();
            }
        });
        sF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f.start();
            }
        });
        sG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g.start();
            }
        });
        sH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                h.start();
            }
        });
        sI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.start();
            }
        });
        sJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j.start();
            }
        });
        sK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k.start();
            }
        });
        sL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l.start();
            }
        });
        sM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m.start();
            }
        });
        sN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n.start();
            }
        });
        sO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o.start();
            }
        });
        sP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p.start();
            }
        });
        sQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q.start();
            }
        });
        sR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.start();
            }
        });
        sS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.start();
            }
        });
        sT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.start();
            }
        });
        sU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u.start();
            }
        });
        sV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vi) {
                v.start();
            }
        });
        sW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                w.start();
            }
        });
        sX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.start();
            }
        });
        sY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y.start();
            }
        });
        sZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                z.start();
            }
        });
    }

}