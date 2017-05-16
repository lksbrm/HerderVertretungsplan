package tv.lksbrm.herdervertretungsplan;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Lukas on 08.04.2017.
 */
public class VarManager
{


    public MainActivity ma;


    public VarManager(MainActivity m)
    {
        ma = m;
    }


    public SharedPreferences.Editor getPreferencesEditor(String filename)
    {
        SharedPreferences preferences = ma.getSharedPreferences(filename, Context.MODE_PRIVATE);

        return preferences.edit();
    }

    public SharedPreferences getPreferences(String filename)
    {
        SharedPreferences preferences = ma.getSharedPreferences(filename, Context.MODE_PRIVATE);

        return preferences;
    }

}
