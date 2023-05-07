package com.example.bi5;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.aurelhubert.ahbottomnavigation.notification.AHNotification;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AHBottomNavigation bottomNavigation = findViewById(R.id.bottom_navigation);

        // Create items
        AHBottomNavigationItem item1 = new AHBottomNavigationItem(R.string.tab_1, R.drawable.home, R.color.black);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem(R.string.tab_2, R.drawable.favorite, R.color.yellow);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem(R.string.tab_3, R.drawable.mypage, R.color.green);

        // Add items
        bottomNavigation.addItem(item1);
        bottomNavigation.addItem(item2);
        bottomNavigation.addItem(item3);

        //đổi màu cả thanh Navigation cả khi ấn or ko ấn vào nút (nếu setColor = true)
        bottomNavigation.setColored(false);

        //chỉ đổi màu thanh Navigation
        bottomNavigation.setDefaultBackgroundColor(getResources().getColor(R.color.green));
        //đổi màu nút bị ấn vào
        bottomNavigation.setAccentColor(getResources().getColor(R.color.black));
        //đổi màu nút không bị ấn vào
        bottomNavigation.setInactiveColor(getResources().getColor(R.color.yellow));

        //hiển thị bộ đếm (cout) trên icon
        AHNotification notification = new AHNotification.Builder()
                .setText("1")
                .setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellow))
                .setTextColor(ContextCompat.getColor(MainActivity.this, R.color.black))
                .build();
        bottomNavigation.setNotification(notification, 1);

        //Hiển thị tilte lớn hơn khi ấn vào nút
        bottomNavigation.setTitleState(AHBottomNavigation.TitleState.SHOW_WHEN_ACTIVE_FORCE);
    }
}
