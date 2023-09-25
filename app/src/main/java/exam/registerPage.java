//package exam;
//
//
//import androidx.appcompat.app.AppCompatActivity;
//        import android.os.Bundle;
//        import android.view.View;
//        import android.widget.Button;
//        import android.widget.DatePicker;
//        import android.widget.EditText;
//        import android.widget.RadioButton;
//        import android.widget.RadioGroup;
//        import android.widget.Toast;
//public class registerPage extends AppCompatActivity {
//    EditText edtusername,edtpassword,edtaddress,edtage;
//
//    Button submit;
//    RadioGroup edtgender;
//    RadioButton male, female;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_register_page);
//        edtusername=findViewById(R.id.edtuname);
//        edtpassword=findViewById(R.id.edtpassword);
//        edtaddress=findViewById(R.id.edtaddress);
//        edtgender=findViewById(R.id.edtgender);
//        male=findViewById(R.id.male);
//
//
//        female=findViewById(R.id.female);
//        edtage=findViewById(R.id.edtage);
//        DatePick=findViewById(R.id.DatePick);
//        submit=findViewById(R.id.submit);
//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String username=edtusername.getText().toString();
//                String password=edtpassword.getText().toString();
//                String address=edtaddress.getText().toString();
//                String gender="";
//                if(male.isChecked()){
//                    gender="Male";
//                }
//                else{
//                    gender="Female";
//                }
//                String age=edtage.getText().toString();
//                DatePick = (DatePicker) findViewById(R.id.DatePick);
//                String day = "Day = " + DatePick.getDayOfMonth();
//                String month = "Month = " + (DatePick.getMonth() +
//                        1);
//                String year = "Year = " + DatePick.getYear();
//                Toast.makeText(registerPage.this, "Username: "+
//                                username +"\n Password: "+password +"\n Address: "+address+"\n Gender:
//                        "+gender+"\n Age: "+age+"\n DOB: "+day +month +year,
//                Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}
