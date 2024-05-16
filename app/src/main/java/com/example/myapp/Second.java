package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void makeAcall(View view) {

        switch (view.getId()) {
            case R.id.bb1:
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01704318344"));
                startActivity(i1);
                break;

            case R.id.bb2:
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01930423211"));
                startActivity(i2);
                break;

            case R.id.bb3:
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01755301726"));
                startActivity(i3);
                break;

            case R.id.bb4:
                Intent i4 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01799313189"));
                startActivity(i4);
                break;

            case R.id.bb5:
                Intent i5 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01309312464"));
                startActivity(i5);
                break;

            case R.id.bb6:
                Intent i6 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01728776775"));
                startActivity(i6);
                break;

            case R.id.bb7:
                Intent i7 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01993419267"));
                startActivity(i7);
                break;

            case R.id.bb8:
                Intent i8 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01792309155"));
                startActivity(i8);
                break;

            case R.id.bb9:
                Intent i9 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01795035920"));
                startActivity(i9);
                break;

            case R.id.bb10:
                Intent i10 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01867983059"));
                startActivity(i10);
                break;

            case R.id.bb11:
                Intent i11 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01761898430"));
                startActivity(i11);
                break;

        }
    }
}
