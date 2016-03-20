package main.tempcon.com.tempcon;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.tempcon.converter.TemperatureConverter;

public class MainActivity extends AppCompatActivity {

    private EditText txtInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtInput = (EditText) findViewById(R.id.txtInput);
    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.btnCalculate:
                RadioButton celsiusBtn = (RadioButton)findViewById(R.id.radCelsius);
                RadioButton fahrenheitBtn = (RadioButton)findViewById(R.id.radFahrenheit);
                if(txtInput.getText().length() == 0){
                    Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                    return;
                }

                float inputVal = Float.parseFloat(txtInput.getText().toString());
                if(celsiusBtn.isChecked()){
                    txtInput.setText(String.valueOf(TemperatureConverter.fahrenheitToCelsius(inputVal)));
                    celsiusBtn.setChecked(false);
                    fahrenheitBtn.setChecked(true);
                }else{
                    txtInput.setText(String.valueOf(TemperatureConverter.celsiusToFahrenheit(inputVal)));
                    celsiusBtn.setChecked(true);
                    fahrenheitBtn.setChecked(false);
                }
                break;
        }
    }
}
