package ahhhlvin.c4q.nyc.hellodroid;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    Button button;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                returnLetterGrade(Integer.parseInt(editText.getText().toString()));
                Log.i("test", returnLetterGrade(Integer.parseInt(editText.getText().toString())));
                textView.setText(returnLetterGrade(Integer.parseInt(editText.getText().toString())));

            }
        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public static String returnLetterGrade(int grade) {

        String letterGrade = "";


        if (grade == 100) {
            letterGrade = "A+";
        } else if (grade >= 90 && grade <= 99) {
            letterGrade = "A";
        } else if (grade >= 80 && grade <= 89) {
            letterGrade = "B";
        } else if (grade >= 70 && grade <= 79) {
            letterGrade = "C";
        } else if (grade >= 60 && grade <= 69) {
            letterGrade = "D";
        } else if (grade >= 0 && grade <= 59) {
            letterGrade = "F";
        } else {
            letterGrade = "";
        }

        return letterGrade;
    }
}
