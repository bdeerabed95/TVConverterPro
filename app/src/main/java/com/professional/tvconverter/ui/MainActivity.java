package com.professional.tvconverter.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText searchInput;
    private Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // إنشاء الواجهة برمجياً بدلاً من XML:
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(16, 16, 16, 16);
        
        searchInput = new EditText(this);
        searchInput.setHint("ابحث هنا...");
        layout.addView(searchInput);
        
        searchButton = new Button(this);
        searchButton.setText("بحث");
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String query = searchInput.getText().toString();
                if (!query.isEmpty()) {
                    Toast.makeText(MainActivity.this, 
                        "البحث عن: " + query, 
                        Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, 
                        "أدخل نص البحث", 
                        Toast.LENGTH_SHORT).show();
                }
            }
        });
        layout.addView(searchButton);
        
        setContentView(layout);
    }
}
