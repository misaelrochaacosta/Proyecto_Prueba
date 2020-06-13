package misael.android.calcularcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText e1,e2;
    private TextView tv1;
    private CheckBox cb1,cb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.txt_Num1);
        e2 = (EditText)findViewById(R.id.txt_Num2);
        cb1= (CheckBox)findViewById(R.id.cb_Sumar);
        cb2= (CheckBox)findViewById(R.id.cb_Restar);
        tv1= (TextView)findViewById(R.id.tv_Resultado);
    }

    public void Calculos(View view){
        
    }
}