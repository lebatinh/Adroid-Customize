package com.example.customtoast;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tạo button trong activity rồi setOnclick cho nút
        Button button = findViewById(R.id.btn_show_toast);
        //
        button.setOnClickListener(v -> {
//                Toast.makeText(this, "This is a Toast", Toast.LENGTH_SHORT).show();
            Toast toast = new Toast(MainActivity.this);
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.layout_custom_toast, findViewById(R.id.layout_custom_toast));
            //set text động cho button
            TextView tvMessage = view.findViewById(R.id.tv_message);
            tvMessage.setText("Lê Bá Tình \n20240773");
            toast.setView(view);
            toast.setGravity(Gravity.CENTER, 0,0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.show();
        });

        //Khai báo bằng code ngoài giao diện
//        Toast.makeText(this, "This is a Toast", Toast.LENGTH_SHORT).show();
//        Toast toast = new Toast(this);
//        LayoutInflater inflater = getLayoutInflater();
//        View view = inflater.inflate(R.layout.layout_custom_toast, (ViewGroup) findViewById(R.id.layout_custom_toast));
//        toast.setView(view);
//        toast.setGravity(Gravity.CENTER, 0,0);
//        toast.setDuration(Toast.LENGTH_LONG);
//        toast.show();
//
    }
}