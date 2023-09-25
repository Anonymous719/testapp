package exam;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.datingapp.R;

public class signup extends AppCompatActivity {
    EditText edtusername,edtpassword,edtage;
    RadioGroup edtgender;
    RadioButton male, female;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        edtusername=findViewById(R.id.edtname);
        edtpassword=findViewById(R.id.edtpassword);
        edtage=findViewById(R.id.edtage);
        edtgender=findViewById(R.id.edtgender);
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);
        submit=findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=edtusername.getText().toString();
                String password=edtpassword.getText().toString();
                String age=edtage.getText().toString();

                String gender="";
                if(male.isChecked()){
                    gender="Male";
                }
                else{
                    gender="Female";
                }
                Toast.makeText(getApplicationContext(), "name: "+ name +"\n Password: "+password +"\n Age: "+age+ "\n Gender: "+gender, Toast.LENGTH_SHORT).show();
            }
        });
    }
}


