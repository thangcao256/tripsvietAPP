package com.thangcao.tripsviet.Personal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.thangcao.tripsviet.Login.ResetPhoneActivity;
import com.thangcao.tripsviet.R;
import com.thangcao.tripsviet.ultil.networkChangeListener;
import com.thangcao.tripsviet.ultil.sound;

public class Payment extends AppCompatActivity {

    Button cancel_payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        event();
        Show_Popup("Chức năng chưa cập nhật. Bạn có muốn thoát ra?");
    }

    private void event() {
//        cancel_payment = findViewById(R.id.cancel_payment);
//        cancel_payment.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Show_Popup("Bạn có muốn hủy quá trình thanh toán?");
//            }
//        });
    }

    //region check internet
    com.thangcao.tripsviet.ultil.networkChangeListener networkChangeListener = new networkChangeListener();
    @Override
    protected void onStart() {
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(networkChangeListener,filter);
        super.onStart();
    }
    @Override
    protected void onStop() {
        unregisterReceiver(networkChangeListener);
        super.onStop();
    }
    //endregion

    //region Custom a notification
    public void Show_Popup(String text){

        sound.playSound(Payment.this, R.raw.thongbao);

        Dialog dialog = new Dialog(Payment.this);

        dialog.setContentView(R.layout.custom_dialog_layout);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        TextView title = dialog.findViewById(R.id.content_alert);
        Button ok = dialog.findViewById(R.id.btn_okay);
        Button cancel = dialog.findViewById(R.id.btn_cancel);

        ok.setText("Thoát");

        title.setText(text);
        cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dialog.dismiss();
                sound.playSound(Payment.this, R.raw.thongbao);
                dialog.show();
            }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Payment.this.finish();
            }
        });
        dialog.show();
    }
    //endregion

    //region Ghi đè nút back trên điện thoại, vô hiệu hóa quay lại màn hình trước
    @Override
    public void onBackPressed() {
        Show_Popup("Bạn có muốn hủy quá trình thanh toán?");
    }
    //endregion
}