package com.example.android.musicapp;

/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView nation = (TextView) findViewById(R.id.nation);

// Set a click listener on that View
        nation.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the nation View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nationIntent = new Intent(MainActivity.this, NationActivity.class);
                startActivity(nationIntent);
            }
        });

        // Find the View that shows the loseYourself category
        TextView lose = (TextView) findViewById(R.id.loseYourself);

// Set a click listener on that View
        lose.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the loseYourself View is clicked on.
            @Override
            public void onClick(View view) {
                Intent loseIntent = new Intent(MainActivity.this, LoseYourselfActivity.class);
                startActivity(loseIntent);
            }
        });

        // Find the View that shows the drake category
        TextView drake = (TextView) findViewById(R.id.drake);

// Set a click listener on that View
        drake.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent drakeIntent = new Intent(MainActivity.this, DrakeActivity.class);
                startActivity(drakeIntent);
            }
        });

        // Find the View that shows the collapse category
        TextView collapse = (TextView) findViewById(R.id.collapse);

// Set a click listener on that View
        collapse.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the collapse View is clicked on.
            @Override
            public void onClick(View view) {
                Intent collapseIntent = new Intent(MainActivity.this, CollapseActivity.class);
                startActivity(collapseIntent);
            }
        });
    }



}
