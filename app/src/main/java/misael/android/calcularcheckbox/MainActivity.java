package misael.android.calcularcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        String Num1_String = String.valueOf(e1.getText());
        String Num2_String = String.valueOf(e2.getText());
        int Num1_Int = Integer.parseInt(Num1_String);
        int Num2_Int = Integer.parseInt(Num2_String);
        String resultado_String = " ";
        int resultado_int= 0 ;

        if ((cb1.isChecked()) && (cb2.isChecked())){
                 resultado_int = Num1_Int + Num2_Int;
                 resultado_String = resultado_String + "La Suma es: "+resultado_int + " /";
                  resultado_int = Num1_Int - Num2_Int;
                  resultado_String = resultado_String + " La Resta es: " + resultado_int;


        }else {
            if(cb1.isChecked())
            {
                resultado_int = Num1_Int + Num2_Int;
                resultado_String = resultado_String + "La Suma es: "+resultado_int ;
            }

            if(cb2.isChecked())
            {
                resultado_int = Num1_Int + Num2_Int;
                resultado_String = resultado_String + " La Resta es: " + resultado_int;
            }
        }

        if ((cb1.isChecked()== false) && (cb2.isChecked()== false))
            Toast.makeText(this,"No a Seleccionado Ninguna Opcion ",Toast.LENGTH_LONG).show();

        tv1.setText(resultado_String);


    }
}