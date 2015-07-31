package com.example.kirill.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.util.Log;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity  {


    String[] stMas={"dfdf","fdfd"};
   final String LOG_TAG = "myLogs";

  ListView lvMain;

  /** Called when the activity is first created. */
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main2);

    lvMain = (ListView) findViewById(R.id.lvMain);

   // ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
   //     this, R.array.names, android.R.layout.simple_list_item_1);

      MyAdapter adapter=new MyAdapter(this,stMas);
    lvMain.setAdapter(adapter);

 /*   lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView<?> parent, View view,
                                int position, long id) {
            Log.d(LOG_TAG, "itemClick: position = " + position + ", id = "
                    + id);
        }
    });

      lvMain.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        public void onItemSelected(AdapterView<?> parent, View view,
                                   int position, long id) {
            Log.d(LOG_TAG, "itemSelect: position = " + position + ", id = "
                    + id);
        }

        public void onNothingSelected(AdapterView<?> parent) {
            Log.d(LOG_TAG, "itemSelect: nothing");
      }
    });*/

  }
}
