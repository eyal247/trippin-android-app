package com.trippin.androidtrippin.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SaveSharedPreference
{
    static final String PREF_USER_NAME = "";
    static final String TRIP_ID = "tripID";
    static final String IS_GOOGLE_SIGN_IN = "isGoogleSignIN";

    static SharedPreferences getSharedPreferences(Context ctx)
    {
        return PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    public static void setUserName(Context ctx, String userName)
    {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_USER_NAME, userName);
        editor.commit();
    }

    public static String getUserName(Context ctx)
    {
        return getSharedPreferences(ctx).getString(PREF_USER_NAME, "");
    }

    public static void setIsGoogleSignIn(Context ctx, Boolean isGoogleSignIn)
    {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putBoolean(IS_GOOGLE_SIGN_IN, isGoogleSignIn);
        editor.commit();
    }

    public static Boolean getIsGoogleSignIn(Context ctx)
    {
        return getSharedPreferences(ctx).getBoolean(IS_GOOGLE_SIGN_IN, false);
    }

    public static void setCurrTripID(Context ctx, String tripID)
    {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(TRIP_ID, tripID);
        editor.commit();
    }

    public static String getTripId(Context ctx)
    {
        return getSharedPreferences(ctx).getString(TRIP_ID, null);
    }

    public static void removeUserName(Context ctx)
    {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.remove(PREF_USER_NAME);
    }
}