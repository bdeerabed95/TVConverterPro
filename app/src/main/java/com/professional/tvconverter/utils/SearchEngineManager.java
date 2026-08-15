package com.professional.tvconverter.utils;

import java.util.ArrayList;
import java.util.List;

public class SearchEngineManager {
    private List<String> searchEngines;
    
    public SearchEngineManager() {
        searchEngines = new ArrayList<>();
        searchEngines.add("Google");
        searchEngines.add("Bing");
        searchEngines.add("DuckDuckGo");
        searchEngines.add("Yandex");
    }
    
    public List<String> getSearchEngines() {
        return searchEngines;
    }
    
    public String buildSearchUrl(String engine, String query) {
        String encodedQuery = android.net.Uri.encode(query);
        
        switch (engine) {
            case "Google":
                return "https://www.google.com/search?q=" + encodedQuery;
            case "Bing":
                return "https://www.bing.com/search?q=" + encodedQuery;
            case "DuckDuckGo":
                return "https://duckduckgo.com/?q=" + encodedQuery;
            case "Yandex":
                return "https://yandex.com/search/?text=" + encodedQuery;
            default:
                return "https://www.google.com/search?q=" + encodedQuery;
        }
    }
}
