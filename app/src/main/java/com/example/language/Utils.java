package com.example.language;


import android.app.Activity;
import android.content.Intent;

public class Utils
{
    private static int sTheme;


    public final static int THEME_GREEN = 0;
    public final static int THEME_BLUE = 1;
    public final static int THEME_BLACK = 2;


    public static void changeToTheme(Activity activity, int theme)
    {
        sTheme = theme;
        activity.finish();

        activity.startActivity(new Intent(activity, activity.getClass()));

    }


    public static void onActivityCreateSetTheme(Activity activity)
    {
        switch (sTheme)
        {
            default:

                break;
            case THEME_GREEN:
                activity.setTheme(R.style.AppThemeGreen);
                break;
            case THEME_BLUE:
                activity.setTheme(R.style.AppThemeBlue);
                break;
            case THEME_BLACK:
                activity.setTheme(R.style.AppThemeBlack);
                break;
        }
    }
}
