package fi.jamk.basicuicontrols2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,new String[]{"Pasi","Juha","Kairi","Jouni","Esa","Hannu"});
        AutoCompleteTextView actv = (AutoCompleteTextView)
                findViewById(R.id.editTextLogin);
        actv.setAdapter(aa);
    }

    /* TO IMPLEMENT, SHOW TOAST
    public void selectButtonClicked(View view) {
        //find radiogroup
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        int id = rg.getCheckedRadioButtonId();
        //find button
        RadioButton rb = (RadioButton) findViewById(id);
        //get radiobutton text
        String text = (String) rb.getText();
        //toast message to screen
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    } */

}
