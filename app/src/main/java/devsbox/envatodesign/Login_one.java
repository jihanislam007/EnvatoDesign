package devsbox.envatodesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login_one extends AppCompatActivity {

    TextView heading;
    TextView forgot_pass;
    EditText username;
    EditText passward;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_one);


        heading=(TextView) findViewById(R.id.HeadingTextView);
        forgot_pass=(TextView) findViewById(R.id.ForgotPassTextView);

        username = (EditText) findViewById(R.id.UserNameEditText);
        passward = (EditText) findViewById(R.id.PasswardEditText);

        login = (Button) findViewById(R.id.LogInButton);


      /* // Typeface font = Typeface.createFromAsset(getAssets(), "Century-Gothic.ttf");
        Typeface font = Typeface.createFromAsset(getAssets(), "Century-Gothic.ttf");
        heading.setTypeface(font);*/


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Login_one.this,Login_two.class);
                startActivity(in);
            }
        });
    }
}
