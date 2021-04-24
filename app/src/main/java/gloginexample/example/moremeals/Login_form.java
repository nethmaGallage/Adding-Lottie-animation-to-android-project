package gloginexample.example.moremeals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class Login_form extends AppCompatActivity {

    EditText username;
    EditText password;
    Button register;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        setupUI();
        setupListeners();
    }

    private void setupListeners() {

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUsername();

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(Login_form.this,activity3.class)
                //startActivity(i);

            }
        });
    }

    private void checkUsername() {
        boolean isValid = true;

        if(isEmpty(username)){

            username.setError("You must enter username to login ! ");
            isValid = false;
        }
        else {

            if (!isEmail(username)) {

                username.setError("Enter Valid email ! ");
                isValid = false;
            }
        }

        if(isEmpty(password)){

            password.setError("password is incorrect");
            isValid = false;
        }

        else{

            if(password.getText().toString().length() < 4){
                password.setError("password must be at least 4 characters long ");
                isValid = false ;
            }
        }

        if(isValid){

            String usernameValue = username.getText().toString();
            String passwordValue = password.getText().toString();

            if (usernameValue.equals("test@test.com") && passwordValue.equals(("password1234"))){
                //everything checked will open new Activity

                Intent i = new Intent(Login_form.this , MainActivity3.class);
                startActivity(i);

                //close the activity
                this.finish();
            }

            else{

                Toast t = Toast.makeText(this,"Wrong email or password " ,Toast.LENGTH_SHORT);
                t.show();

            }
        }
    }

    private boolean isEmail(EditText text) {

        CharSequence email = text.getText().toString();
        return  (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    private boolean isEmpty(EditText text) {

        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }


    private void setupUI() {

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        register = findViewById(R.id.register);
        login = findViewById(R.id.login);

    }
}