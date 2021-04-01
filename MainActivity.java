package com.example.dialog_custom;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {



     TextView txtLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLogin = (TextView) findViewById(R.id.textviewLogin);

        // sự kiện khi click vào txt login ở activity main
        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogLogin();
            }
        });
    }
        // gọi dialog, trong dialog co các sự kiện :...
    private void DialogLogin()
    {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_custom);
        dialog.setCanceledOnTouchOutside(false);

        // anh xa
        EditText edtUsername = (EditText) dialog.findViewById(R.id.editTextuser);
        EditText edtPass = (EditText) dialog.findViewById(R.id.editTextPass);
        Button btnDongy = (Button) dialog.findViewById(R.id.buttonDongy);
        Button btnHuy = (Button) dialog.findViewById(R.id.buttonHUy);

        btnDongy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtUsername.getText().toString().trim();
                String pass = edtPass.getText().toString().trim();
                if(username.equals("Khanh Huyen") && pass.equals("1407"))
                {
                    Toast.makeText(MainActivity.this, "Dang nhap thanh cong", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Loi dang nhap", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // sự kiện của button hủy
btnHuy.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        dialog.cancel();
    }
});

        dialog.show();
    }
}