package mobpro.inf.prak.spinerinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ArrayAdapter<CharSequence>	adapter	=	ArrayAdapter.createFromResource(this,
                R.array.labels_array,	android.R.layout.simple_spinner_item);

        Spinner	spinner	=	(Spinner)	findViewById(R.id.label_spinner);
        if	(spinner	!=	null)	{
            spinner.setOnItemSelectedListener(this);
        }

        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        if	(spinner	!=	null)	{
            spinner.setAdapter(adapter);
        }
    }

    public	class	MainActivity	extends	AppCompatActivity	implements
            AdapterView.OnItemSelectedListener	{

    }
}
