package LabMP;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.datingapp.ExampleDialouge;
import com.example.datingapp.R;

import view.OnClickListener;

public class MainActivity2 extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() );
        {
            public void onClick public void openDialouge (View) {
                openDialouge()
        }

            () {
            ExampleDialouge exampleDialouge = new ExampleDialouge();
            ExampleDialog.show(getSupportFragmentManager(), "example dialog");
        }
        };
    };
}