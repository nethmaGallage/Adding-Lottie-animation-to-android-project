package gloginexample.example.moremeals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup_form extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    EditText address;
    EditText email;
    EditText password;
    Button   register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_form);

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        address = findViewById(R.id.address);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkDataEntered();
            }
        });
    }


    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }

    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    private void checkDataEntered() {
        if (isEmpty(firstName)) {
            Toast t = Toast.makeText(this, "You must enter first name to register!", Toast.LENGTH_SHORT);
            t.show();
        }

        if (isEmpty(firstName)) {
            firstName.setError("First name is required!");
        }


        if (isEmpty(lastName)) {
            lastName.setError("Last name is required!");
        }

        if (isEmpty(address)) {
            address.setError("address is required!");
        }

        if (isEmpty(password)) {
            password.setError("password is required!");
        }

        if (isEmail(email) == false) {
            email.setError("Enter valid email!");
        }


    }

}