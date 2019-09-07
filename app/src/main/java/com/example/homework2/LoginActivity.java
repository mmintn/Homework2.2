package com.example.homework2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.homework2.model.Auth;

public class LoginActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //ใช้ตัวแปร loginButton อ้างอิงไปยังปุ่มใน layout
        Button loginButton = findViewById(R.id.login_button);

        //วิธีที่1
        //สร้าง Listener จากคลาส MyListener
//        MyListener listener = new MyListener();

        //ผูกปุ่มกับ Listener เข้าด้วยกัน
//        lloginButton.setOnClickListener(listener);

        //วิธีืที่ 2 (ถ้าไม่มี MyListener)
//        loginButton.setOnClickListener(this);

        //วิธีที3 (ส่วนมากใช้วิธีนี้)
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(LoginActivity.this,"Hello",Toast.LENGTH_SHORT);
                t.show();
            }
        });

        //
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText emailEditText = findViewById(R.id.email_edit_text);

                EditText passwordEditText = findViewById(R.id.password_edit_text);
                CheckBox rememberPasswordCheckBox = findViewById(R.id.remember_password_checkbox);




                String inputEmail = emailEditText.getText().toString();
                String inputPassword = passwordEditText.getText().toString();


                //วิธีที่2 การใส่รหัส (ต้องไปสร้าง Auth ด้วยอีกโฟลเดอร์ในไฟล์java ใน modle)
                Auth auth = new Auth(inputEmail, inputPassword);
//                auth.setmEmail(inputEmail);
//                auth.setmPassword(inputPassword);

                boolean result = auth.check();

                if(result){
                    //login สำเร็จ
//                    Toast.makeText(
//                    LoginActivity.this,
//                            R.string.login_success,
//                            Toast.LENGTH_SHORT
//                    ).show();

                    //กรอกรหัสถูกให้เลือกจำรหัสผ่าน
                    if(rememberPasswordCheckBox.isChecked()){
                        Toast.makeText(
                                LoginActivity.this,
                                "คุณเลือกจำรหัสผ่าน",
                                Toast.LENGTH_SHORT
                        ).show();
                    }else{
                        Toast.makeText(
                                LoginActivity.this,
                                "คุณเลือกจำรหัสผ่าน",
                                Toast.LENGTH_SHORT
                        ).show();
                    }

                }else {
                    //login ไม่สำเร๋็จ
//                    Toast.makeText(
//                           LoginActivity.this,
//                            R.string.login_faild,
//                            Toast.LENGTH_SHORT
//                    ).show();
                    new AlertDialog.Builder(LoginActivity.this)
                    .setTitle("Error")
                    .setMessage(R.string.login_faild)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //โค้ดที่ให้ทำงานเมื่อ user กดปุ่ม OK
                            //todo;

                        }
                    })
                    //Negative ด้านลบ เป็นปฏิเสธ
                    .setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //โค้ดที่ให้ทำงานเมื่อ user กดปุ่ม Cancle
                                    //todo;

                                }
                    })
                    .setNeutralButton("Ignore", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //โค้ดที่ให้ทำงานเมื่อ user กดปุ่ม Ignore
                                    //todo;

                                }
                    })
                    .show();
                }

                //วิธีที่1 การใส่รหัส
//                String loginSuccessText = getString(R.string.login_success);
//                String loginFaildText = getString(R.string.login_faild);

//                if(inputEmail.equals(EMAIL) && auth.inputPassword.equals(PASSWORD)){
//                    Toast.makeText(
//                            LoginActivity.this,
//                            R.string.login_success,
//                            Toast.LENGTH_SHORT
//                    ).show();
//                }else {
//                    Toast.makeText(
//                            LoginActivity.this,
//                            R.string.login_faild,
//                            Toast.LENGTH_SHORT
//                    ).show();
//                }

            }
        });




// ของการบ้าน
//        Toast t = Toast.makeText(LoginActivity.this,"Welcome to My ToDo application!",Toast.LENGTH_SHORT);
//        t.show();

    }
     //วิธีที่2
//    @Override
//    public void onClick(View view) {
//        Toast t = Toast.makeText(LoginActivity.this,"Hello",Toast.LENGTH_SHORT);
//        t.show();
//
//    }

    //วิธีที่1
//    private class MyListener implements View.OnClickListener{
//        @Override
//        public void onClick(View view) {
//            Toast t = Toast.makeText(LoginActivity.this,"Hello",Toast.LENGTH_SHORT);
//            t.show();
//        }
//    }


}
