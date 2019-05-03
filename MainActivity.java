package com.example.csumbassignment7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView courseList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* String Array */

        //List Item
        courseList = findViewById(R.id.course_list);

        //Fill courseItems array
        final ArrayList<String> courseItems = new ArrayList<>();
        courseItems.addAll(Arrays.asList(getResources().getStringArray(R.array.course_names)));
        //Fill courseDesc array
        final ArrayList<String> courseDesc = new ArrayList<>();
        courseDesc.addAll(Arrays.asList(getResources().getStringArray(R.array.course_desc)));

        //OnClick for the List
        courseList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                String courseDescLong = "";

                /*
                Grab position in list, grab the desc from the array in that position
                 */
                switch (position){
                    case 0:
                        courseDescLong = courseDesc.get(0);
                        break;
                    case 1:
                        courseDescLong = courseDesc.get(1);
                        break;
                    case 2:
                        courseDescLong = courseDesc.get(2);
                        break;
                    case 3:
                        courseDescLong = courseDesc.get(3);
                        break;
                    case 4:
                        courseDescLong = courseDesc.get(4);
                        break;
                    case 5:
                        courseDescLong = courseDesc.get(5);
                        break;
                    case 6:
                        courseDescLong = courseDesc.get(6);
                        break;
                    case 7:
                        courseDescLong = courseDesc.get(7);
                        break;
                    case 8:
                        courseDescLong = courseDesc.get(8);
                        break;
                    case 9:
                        courseDescLong = courseDesc.get(9);
                        break;
                    case 10:
                        courseDescLong = courseDesc.get(10);
                        break;
                    case 11:
                        courseDescLong = courseDesc.get(11);
                        break;
                    case 12:
                        courseDescLong = courseDesc.get(12);
                        break;
                    case 13:
                        courseDescLong = courseDesc.get(13);
                        break;
                    case 14:
                        courseDescLong = courseDesc.get(14);
                        break;
                }

                //Toast the desc
                Toast.makeText(getApplicationContext(),
                        courseDescLong, Toast.LENGTH_LONG).show();
            }
        });

        adapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                courseItems
        );

        courseList.setAdapter(adapter);

        /* Button and Text Field*/

        Button button;
        button = findViewById(R.id.button);

        //Text Field
        final EditText editText;
        editText = findViewById(R.id.editText);

        //OnClick for the button
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String courseDescLong;
                //Take entered text and store it
                String courseNum = editText.getText().toString();

                /*
                Check for specific course numbers only.
                Default displays error when not a course #.
                 */
                switch (courseNum){
                    case "237":
                        courseDescLong = courseDesc.get(0);
                        break;
                    case "170":
                        courseDescLong = courseDesc.get(1);
                        break;
                    case "150":
                        courseDescLong = courseDesc.get(2);
                        break;
                    case "151":
                        courseDescLong = courseDesc.get(3);
                        break;
                    case "300":
                        courseDescLong = courseDesc.get(4);
                        break;
                    case "338":
                        courseDescLong = courseDesc.get(5);
                        break;
                    case "311":
                        courseDescLong = courseDesc.get(6);
                        break;
                    case "334":
                        courseDescLong = courseDesc.get(7);
                        break;
                    case "336":
                        courseDescLong = courseDesc.get(8);
                        break;
                    case "363":
                        courseDescLong = courseDesc.get(9);
                        break;
                    case "370":
                        courseDescLong = courseDesc.get(10);
                        break;
                    case "383":
                        courseDescLong = courseDesc.get(11);
                        break;
                    case "428":
                        courseDescLong = courseDesc.get(12);
                        break;
                    case "462":
                        courseDescLong = courseDesc.get(13);
                        break;
                    case "499":
                        courseDescLong = courseDesc.get(14);
                        break;
                    default:
                        courseDescLong = "Error, please enter a course #";
                        break;
                }

                //Toast the desc
                Toast.makeText(getApplicationContext(),
                        courseDescLong, Toast.LENGTH_LONG).show();
            }
        });
    }


}
