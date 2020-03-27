public class Activity2 extends AppCompactActivity{
    EditText num1;
    EditText num2;

    Button btnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent intent = GetIntent();
        String name= intent.getStringExtra( name: "name";)
        TextView nameView = findViewById(R.id.txtName2);
        nameView.setText("Hello"+name);

        num1 = findViewById(R.id.edtNum1);
        num2 = findViewById(R.id.edtNum2);

        btnsend.setOnClickListener((V){
                String_n1 = num1.getText().toString();
        String_n2 = num2.getText().toString();
        Intent intent1 = new Intent (PackageContext:Activity2.this, Activity3.class)
        intent1.putExtra( name: "n1", n1);
        intent1.putExtra( name: "n2", n2);

        starActivity(intent);


        })

    }
}
