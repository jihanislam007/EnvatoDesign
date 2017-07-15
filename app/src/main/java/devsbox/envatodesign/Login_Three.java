package devsbox.envatodesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Login_Three extends AppCompatActivity {

    ImageView logo;
    TextView forgot_pass;
    EditText username;
    EditText passward;
    Button login;
    TextView fb;
    TextView google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__three);

        logo=(ImageView) findViewById(R.id.LogoImageView);

        username = (EditText) findViewById(R.id.UserNameEditText);
        passward = (EditText) findViewById(R.id.PasswardEditText);

        forgot_pass=(TextView) findViewById(R.id.ForgotPassTextView);

        login = (Button) findViewById(R.id.LogInButton);

        fb=(TextView) findViewById(R.id.fbTextView);
        google=(TextView) findViewById(R.id.googleTextView);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Login_Three.this,Login_Four.class);
                startActivity(in);
            }
        });

    }
}
