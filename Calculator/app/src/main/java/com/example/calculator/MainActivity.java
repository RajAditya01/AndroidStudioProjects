package com.example.calculator;
        import androidx.appcompat.app.AppCompatActivity;
        import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
public class MainActivity extends Activity {
    Button bt1,bt2,bt3,bt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=findViewById(R.id.button);
        bt2=findViewById(R.id.button2);
        bt3=findViewById(R.id.button3);
        bt4=findViewById(R.id.button4);
    }
    public void Add(View v){
        EditText et1=(EditText)findViewById(R.id.editTextNumber);
        EditText et2=(EditText)findViewById(R.id.editTextNumber2);
        EditText et3=(EditText)findViewById(R.id.editTextNumber5);
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1+n2;
        et3.setText("add value" + result);
    }
    public void subtract(View v){
        EditText et1=(EditText)findViewById(R.id.editTextNumber);
        EditText et2=(EditText)findViewById(R.id.editTextNumber2);
        EditText et3=(EditText)findViewById(R.id.editTextNumber5);
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1-n2;
        et3.setText("subtract value" + result);
    }
    public void multiply(View v){
        EditText et1=(EditText)findViewById(R.id.editTextNumber);
        EditText et2=(EditText)findViewById(R.id.editTextNumber2);
        EditText et3=(EditText)findViewById(R.id.editTextNumber5);
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1*n2;
        et3.setText("multiply value" + result);
    }
    public void Divide(View v){
        EditText et1=(EditText)findViewById(R.id.editTextNumber);
        EditText et2=(EditText)findViewById(R.id.editTextNumber2);
        EditText et3=(EditText)findViewById(R.id.editTextNumber5);
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1/n2;
        et3.setText("Divide value" + result);
    }
}