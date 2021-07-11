package com.example.liststring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
//                String[] names  = new String[]{
//                  "DEEPAK",
//                  "VIKAS",
//                  "DIVYA",
//                  "GAUTAM",
//                  "UMANG",
//                  "BHOOMI",
//                  "KARLIK",
//                  "CHIRAG",
//                  "SAHIL"
//                };
ArrayList<Teacher> teachers = Teacher.get10RandomTeacher();
                ListView lvnames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvnames = findViewById(R.id.lvnames);
        TeacherAdapter teacherAdapter =  new TeacherAdapter();
        lvnames.setAdapter(teacherAdapter);
//        ArrayAdapter<String> nameAdapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_list_item_1,
//                android.R.id.text1,
//                names
//        );
//        lvnames.setAdapter(nameAdapter);
    }
    class  TeacherAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return teachers.size();
        }

        @Override
        public Teacher getItem(int position) {
            return teachers.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }
    }
}