package app.mylogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText email , password ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.edemail);
        password = (EditText) findViewById(R.id.edpassword);

    }
    public void OnLogin(View view){
        String useremail=email.getText().toString();
        String userpassword=password.getText().toString();
        String type="login";
        backgroundwalker back = new backgroundwalker(this);
        back.execute(type,useremail,userpassword);
    }
    public void OpenREG(View view){
        startActivity(new Intent(this,Register.class));
    }
}
