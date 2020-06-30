package com.londonappbrewery.iampoor;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rvRoot;
    TextView tvTitle,tvTitle2;
    ImageView ivCoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvRoot=findViewById(R.id.rlRoot);
        tvTitle=findViewById(R.id.tvTitle);
        tvTitle2=findViewById(R.id.tvTitle2);
        ivCoal=findViewById(R.id.ivCoal);

        ivCoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context;
                final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Its all Perspective");
                builder.setMessage("Diamonds make you Rich, but Coal kept you warm in Winters, But if you give Coal some time it will turn into Diamond ");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.dismiss();

                    }
                });
                builder.show();
            }
        });
    }
}
