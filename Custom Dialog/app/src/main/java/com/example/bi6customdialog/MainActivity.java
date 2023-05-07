package com.example.bi6customdialog;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //khai báo button
        Button btnOpenDialogCenter = findViewById(R.id.open_dialog_center);
        Button btnOpenDialogBottom = findViewById(R.id.open_dialog_bottom);

        //khai báo sự kiện cho button
        btnOpenDialogCenter.setOnClickListener(v -> openFeedBackDialog(Gravity.CENTER));
        btnOpenDialogBottom.setOnClickListener(v -> openFeedBackDialog(Gravity.BOTTOM));
    }

    private void openFeedBackDialog(int gravity) {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.layout_dialog_feedback);
        Window window = dialog.getWindow();
        if(window == null){
            return;
        }

        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        WindowManager.LayoutParams windowAttributes = window.getAttributes();
        windowAttributes.gravity = gravity;
        window.setAttributes(windowAttributes);

        //mặc định có thể ấn thoát bằng cách ấn ra rìa nút open dialog bottom
        if(Gravity.BOTTOM == gravity){
            dialog.setCancelable(true);
        }
        //mặc định có thể ấn thoát bằng cách ấn ra rìa các button khác button open dialog bottom
        else {
            dialog.setCancelable(false);
        }

        //khai báo phần text có thể sửa đổi
        EditText edtFeedback = dialog.findViewById(R.id.edt_feedback);
        //khai báo nút
        Button btnNoThanks = dialog.findViewById(R.id.btn_no_thanks);
        Button btnSend = dialog.findViewById(R.id.btn_send);

        //đặt sự kiện cho nút No, Thanks
        btnNoThanks.setOnClickListener(v -> dialog.dismiss());

        //đặt sự kiện cho nút Send
        btnSend.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Send FeedBack Success", Toast.LENGTH_SHORT).show());

        //đưa tin nhắn ra màn hình
        dialog.show();
    }
}