package com.example.hotelmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class SignUp extends AppCompatActivity {

    private MaterialButton signup;
    private TextView signin;
    private RelativeLayout signupPage;

    private TextInputEditText name, dob, phone, address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = findViewById(R.id.name);
        dob = findViewById(R.id.dob);
        phone = findViewById(R.id.phone);
        address = findViewById(R.id.address);
        signupPage = findViewById(R.id.signUpPage);
        // TODO Create Password and confirm password in signup page section
        signin = findViewById(R.id.login);
        signup = findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namestr = name.getText().toString();
                String dobstr = dob.getText().toString();
                String phonestr = phone.getText().toString();
                String addressstr = phone.getText().toString();
                //TODO take data and compare it

                if(namestr.isEmpty() || dobstr.isEmpty() || phonestr.isEmpty() || addressstr.isEmpty())
                {
                    Snackbar.make(signupPage, "Please! fill all the Details", Snackbar.LENGTH_INDEFINITE)
                            .setAction("Retry", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    Intent intent = new Intent(SignUp.this, SignUp.class);
                                    startActivity(intent);
                                }
                            }).show();
                }
                else
                {
                    Intent intent = new Intent(SignUp.this, HomeActivity.class);
                    startActivity(intent);
                }
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this, LogInActivity.class);
                startActivity(intent);
            }
        });
    }
}