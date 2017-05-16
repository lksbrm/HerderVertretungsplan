package tv.lksbrm.herdervertretungsplan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    VarManager varManager;

    RecyclerView rv;
    RecyclerView.Adapter rvadapter;
    RecyclerView.LayoutManager rvlayoutmanager;

    static ArrayList<SubstElement> elements = new ArrayList<SubstElement>();



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //TEMP
        elements.add(0, new SubstElement("9c", "1/2", "Gj", "E002", "E", "", "Entfall"));
        //TEMP

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        varManager = new VarManager(this);

        rv = (RecyclerView) findViewById(R.id.recycler);
        rvlayoutmanager = new LinearLayoutManager(this);
        rv.setLayoutManager(rvlayoutmanager);

        rvadapter = new SubstAdapter();
        rv.setAdapter(rvadapter);

        /**if(!(varManager.getPreferences("login").getBoolean("loggedin", false)))
        {
            Intent i = new Intent(this, LoginActivity.class);
            startActivity(i);
            finish();
         }*/
    }
}