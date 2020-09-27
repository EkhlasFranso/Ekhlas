package com.example.editemployeegui;


import java.sql.Driver;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button searchBtn;
Button cancelBtn;
Button exitBtn;
Button updateBtn;
TextView textView3;
TextView textView4;
TextView textView5;
TextView textView6;
TextView textView7;
TextView textView8;
TextView textView9;
TextView textView10;
EditText employeeID;
EditText givenName;
EditText email;
EditText name;
EditText number;
EditText dateOfBirth;

    public class Database extends SQLiteOpenHelper {



        public static final String DATABASE_NAME= "Quicklauncher.db";
        public static final String PASSWORDB = "password_table";
        public static final String LEAVEDB = "LeaveType_table";

        public static final String COLUMN_PID = "ID";
        public static final String COLUMN_PASSWORD = "PASSWORD";
        public static final String COLUMN_ISNEWEMP = "ISNEWEMP";

        public static final String COLUMN_LTID = "LTID";
        public static final String COLUMN_LEAVENAME = "LEAVENAME";
        public static final String COLUMN_DAYSAVAIL = "DAYSAVAILABLE";
        Cursor c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchBtn.setOnClickListener(this);
        cancelBtn.setOnClickListener(this);;
        exitBtn.setOnClickListener(this);;
        updateBtn.setOnClickListener(this);;


    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.searchBtn) {
            connect();
            }
        if(view.getId()==R.id.updateBtn) {
            System.out.println("Update");
        }
        if(view.getId()==R.id.exitBtn) {
            System.out.println("Exit");
        }
        if(view.getId()==R.id.cancelBtn) {
            System.out.println("Cancel");
        }
    }

    public void connect() {
        if (employeeID.charAt(0) != 'e' && !(employeeID.length() == 6)) {
            System.out.println("Employee Id should start with e and should be 6 characters long");


        }
            else{

        try {
            Driver(employeeID);
        }



        } catch {

        }
    }
