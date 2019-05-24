package pl.robertburek.nazwaaplikacji;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mNextButton;
    private Button PrevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView view1 = findViewById(R.id.textView1);
        final TextView view2 = findViewById(R.id.textView2);
        final TextView view3 = findViewById(R.id.textView3);
        final TextView view4 = findViewById(R.id.textView4);
        mNextButton = findViewById(R.id.button_next);
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Kolejne powitanie zaraz na ekranie", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                //  view1.setVisibility(R.id.textView1);
            }
        });

        Button button_prev = findViewById(R.id.button_prev);
        button_prev.setOnClickListener(new Button_Prev_Class());


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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

    public void innyButtonClickHandler(View view) {
        Snackbar.make(view, "Z metody w pliku XML", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    class Button_Prev_Class implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Snackbar.make(view, "Poprzednie powitanie zaraz na ekranie", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            //view.setVisibility(R.id.textView1);

        }
    }
}
