package tv.lksbrm.herdervertretungsplan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity
{

    public Toolbar toolbar;
    public Button skip;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle("Anmelden");

        skip = (Button) findViewById(R.id.button);


    }
}
