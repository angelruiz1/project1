package com.example.ar2211.project1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.io.InputStream;
import java.util.Scanner;
import java.lang.Object;
import java.lang.String;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Scanner(View view)
    {
       // int nextInt;
       // nextInt = 0;
       // Log.v("EditText value=", edit_text.getText().toString());
       // Scanner scan = new Scanner(System.in);
       // int first = scan.nextInt()
        String first = view.getText().toString();
        display(first);
    }
/*
    public void calcNum (View view)
    {
        int num1, num2, ;
        num1 = 2;
        num2 = 3;
        first = 0;
        first = first + num2;
        display(first);
    }
*/
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int first)
    {
        Button myButton;
        EditText myEdit;
        TextView myText;
        myEdit = (EditText)findViewById(R.id.editText);
        myEdit.getText().toString();
        myText.setText(myEdit.getText().toString());
    }
}
