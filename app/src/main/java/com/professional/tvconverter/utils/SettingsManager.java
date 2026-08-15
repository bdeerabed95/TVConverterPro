package com.professional.tvconverter.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SettingsManager {
    private static final String PREF_NAME = "tv_converter_settings";
    private SharedPreferences preferences;
    
    public SettingsManager(Context context) {
        preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }
    
    public void setDarkMode(boolean enabled) {
        preferences.edit().putBoolean("dark_mode", enabled).apply();
    }
    
    public boolean isDarkMode() {
        return preferences.getBoolean("dark_mode", true);
    }
    
    public void setSearchEngine(String engine) {
        preferences.edit().putString("search_engine", engine).apply();
    }
    
    public String getSearchEngine() {
        return preferences.getString("search_engine", "google");
    }
}
