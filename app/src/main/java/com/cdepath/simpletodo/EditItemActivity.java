package com.cdepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    public int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        pos = getIntent().getIntExtra("pos",-1);
        String itemText = getIntent().getStringExtra("text");
        EditText edText = (EditText) findViewById(R.id.edText);
        edText.setText("");
        edText.append(itemText);
    }
    public void onSaveItem(View v) {
        EditText edText = (EditText) findViewById(R.id.edText);
        Intent data = new Intent();
        data.putExtra("text", edText.getText().toString());
        data.putExtra("code", 20);
        data.putExtra("pos",pos);
        setResult(RESULT_OK, data);
        this.finish();
    }
}
