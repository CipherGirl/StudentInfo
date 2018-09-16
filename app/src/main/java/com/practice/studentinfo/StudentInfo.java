package com.practice.studentinfo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class StudentInfo extends Activity {

    //private finder find = new finder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);
    }
    public void onClickFind(View view){

        TextView info = (TextView) findViewById(R.id.data);
        Spinner roll = (Spinner) findViewById(R.id.roll);
        String roll_no = String.valueOf(roll.getSelectedItem());

        List<String> information_list = getInfo(roll_no);
        StringBuilder information_result = new StringBuilder();
        //information_list.add(getString(R.string.sixtyseven));

        for(String information : information_list){
            information_result.append(information).append("\n");
        }
        info.setText(information_result);
    }

    List<String> getInfo (String roll){
        List<String>information = new ArrayList<>();

        if(roll.equals("67")) {
            information.add(getString(R.string.sixtyseven));
//            ImageView image = (ImageView) findViewById(R.id.image);
//            int imageResource = getResources().getIdentifier("@drawable/visa", null, this.getPackageName());
//            image.setImageResource(imageResource);
        }
        else if(roll.equals("68"))
            information.add(getString(R.string.sixtyeight));
        else if(roll.equals("69"))
            information.add(getString(R.string.sixtynine));
        else if(roll.equals("73"))
            information.add(getString(R.string.seventythree));
        else if(roll.equals("74"))
            information.add(getString(R.string.seventyfour));
        else if(roll.equals("75"))
            information.add(getString(R.string.seventyfive));
        else if(roll.equals("77"))
            information.add(getString(R.string.seventyseven));
        else if(roll.equals("78"))
            information.add(getString(R.string.seventyeight));
        else
            information.add("No Data Found!");


        return information;
    }
}
