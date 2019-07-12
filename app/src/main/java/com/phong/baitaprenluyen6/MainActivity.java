package com.phong.baitaprenluyen6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.phong.model.phuongtrinhbac2;

public class MainActivity extends AppCompatActivity {

    EditText edtHsa, edtHsb, edtHsc;
    Button btnTiepTuc, btnGiai, btnThoat;
    TextView txtKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();//Khởi tạ các biến controls
        addEvents();
    }

    private void addEvents() {
        btnTiepTuc.setOnClickListener(new myEvents());
        btnGiai.setOnClickListener(new myEvents());
        btnThoat.setOnClickListener(new myEvents());
    }

    private void addControls() {
        edtHsa = (EditText) findViewById(R.id.edtHsa);
        edtHsb = (EditText) findViewById(R.id.edtHsb);
        edtHsc = (EditText) findViewById(R.id.edtHsc);
        btnTiepTuc = (Button) findViewById(R.id.btnTiepTuc);
        btnGiai = (Button) findViewById(R.id.btnGiai);
        btnThoat = (Button) findViewById(R.id.btnThoat);
        txtKetQua = (TextView) findViewById(R.id.txtKetQua);
    }

    class myEvents implements View.OnClickListener
    {

        @Override
        public void onClick(View view) {
            switch (view.getId())
            {
                case R.id.btnTiepTuc:
                    xuLyTiepTuc();
                    break;
                case R.id.btnGiai:
                    xuLyGiai();
                    break;
                case R.id.btnThoat:
                    xuLyThoat();
                    break;
            }
        }
    }

    private void xuLyThoat() {
        finish();
    }

    private void xuLyGiai() {
        double a = Double.parseDouble(edtHsa.getText().toString());
        double b = Double.parseDouble(edtHsb.getText().toString());
        double c = Double.parseDouble(edtHsc.getText().toString());
        phuongtrinhbac2 ptb2 = new phuongtrinhbac2(a,b,c);
        txtKetQua.setText(ptb2.giai());
    }

    private void xuLyTiepTuc() {
        edtHsa.setText("");
        edtHsb.setText("");
        edtHsc.setText("");
        txtKetQua.setText("");
        edtHsa.requestFocus();
    }
}
