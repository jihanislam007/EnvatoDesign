package devsbox.envatodesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login_two extends AppCompatActivity {

    TextView heading;
    TextView forgot_pass;
    EditText username;
    EditText passward;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_two);

        heading=(TextView) findViewById(R.id.HeadingTextView);
        forgot_pass=(TextView) findViewById(R.id.ForgotPassTextView);

        username = (EditText) findViewById(R.id.UserNameEditText);
        passward = (EditText) findViewById(R.id.PasswardEditText);

        login = (Button) findViewById(R.id.LogInButton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Login_two.this,Login_Three.class);
                startActivity(in);
            }
        });

       /* Thread thread = new Thread() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                try {
                    sleep(50000);
                    startActivity(new Intent(getApplicationContext(),
                            Login_one.class));
                    finish();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        };
        thread.start();*/
    }
}
