package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int hour=0;
    int min=0;
    int i=0;
    int sec=0;
    static int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0, count10 = 0, count11 = 0, count12 = 0, count13 = 0, count14 = 0, count15 = 0, count16 = 0, count17 = 0, count18 = 0, count19 = 0, count20 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn1);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            while (i<5) {

                                TimeUnit.SECONDS.sleep(1);
                                updateText();
                                i++;
                            }


                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        });
    }

    public void scroll(View v) {

        ++count1;

        Toast.makeText(MainActivity.this, "cliked andriod_app_devlopment :" + count1, Toast.LENGTH_LONG).show();

        gotoUrl("https://courseware.cutm.ac.in/courses/android-app-development/");

    }

    public void scroll1(View v) {

        ++count2;

        Toast.makeText(MainActivity.this, "cliked Adavanced Analysis :" + count2, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/business-analytics/");
    }

    public void scroll2(View v) {

        ++count3;

        Toast.makeText(MainActivity.this, "cliked Business Reasearch :" + count3, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/business-analytics/");
    }

    public void scroll3(View v) {

        ++count4;

        Toast.makeText(MainActivity.this, "cliked Anesthsia for specality surgeries :" + count4, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/anesthesia-for-specialty-surgeries/");
    }

    public void scroll4(View v) {

        ++count5;

        Toast.makeText(MainActivity.this, "cliked Aero dynamic:" + count5, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/aerodynamic/");
    }

    public void scroll5(View v) {

        ++count6;

        Toast.makeText(MainActivity.this, "clicked Biochemistry :" + count6, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/biochemistry/");
    }

    public void scroll6(View v) {

        ++count7;

        Toast.makeText(MainActivity.this, "cliked Business Law:" + count7, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/business-law/");
    }

    public void scroll7(View v) {

        ++count8;

        Toast.makeText(MainActivity.this, "cliked 3D Game Art :" + count8, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/skill-course-3d-artist-for-game/");
    }

    public void scroll8(View v) {

        ++count9;

        Toast.makeText(MainActivity.this, "cliked Adavanced Extraction Technologies :" + count9, Toast.LENGTH_LONG).show();
        gotoUrl("http://courseware.cutm.ac.in/courses/advanced-extraction-technologies/");
    }

    public void scroll9(View v) {

        ++count10;

        Toast.makeText(MainActivity.this, "cliked Camera operator :" + count10, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/certificate-course-in-camera-operator/");
    }

    public void scroll10(View v) {

        ++count11;

        Toast.makeText(MainActivity.this, "cliked Banking Law and Practice :" + count11, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/banking-law-and-practice/");
    }

    public void scroll11(View v) {

        ++count12;

        Toast.makeText(MainActivity.this, "cliked Animation:" + count12, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/animation/");
    }

    public void scroll12(View v) {

        ++count13;

        Toast.makeText(MainActivity.this, "cliked IT infrastructure and management :" + count13, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/itim/");
    }

    public void scroll13(View v) {

        ++count14;

        Toast.makeText(MainActivity.this, "cliked Accounting for managers :" + count14, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/accounting-for-managers-2/");
    }

    public void scroll14(View v) {

        ++count15;

        Toast.makeText(MainActivity.this, "cliked Contact Lens :" + count15, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/contact-lens/");
    }

    public void scroll15(View v) {

        ++count16;

        Toast.makeText(MainActivity.this, "cliked Adavance Web Programming :" + count16, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/advanced-web-programming/");
    }

    public void scroll16(View v) {

        ++count17;

        Toast.makeText(MainActivity.this, "cliked Accident Investigation :" + count17, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/accident-investigations/");
    }

    public void scroll17(View v) {

        ++count18;

        Toast.makeText(MainActivity.this, "cliked CNC programmng :" + count18, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/cnc-programming/");
    }

    public void scroll18(View v) {

        ++count19;

        Toast.makeText(MainActivity.this, "cliked Digital Painiting :" + count19, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/digital-painting/");
    }

    public void scroll19(View v) {

        ++count20;

        Toast.makeText(MainActivity.this, "cliked Crime and society:" + count20, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/crime-and-society/");
    }


    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }


    public void updateText() {


        runOnUiThread(new Runnable() {
            @Override
            public void run() {

                String str;

                if (sec < 60) {

                    sec++;
                }
                if (sec == 59) {
                    min++;
                    sec = 0;
                }
                if (min > 59) {
                    hour++;
                    min = 0;
                    sec = 0;
                }
                str = Integer.toString(hour) + ":" + Integer.toString(min) + ":" + Integer.toString(sec);
                Toast.makeText(MainActivity.this, "Time :"+str, Toast.LENGTH_SHORT).show();


            }
        });
    }
}