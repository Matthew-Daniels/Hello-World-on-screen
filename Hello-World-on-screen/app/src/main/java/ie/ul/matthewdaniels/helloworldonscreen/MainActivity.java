package ie.ul.matthewdaniels.helloworldonscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCounter = 0;
    private TextView mMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //This method is called when the app launches.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //The code you add goes after the setContentView call.
        mMessageTextView = findViewById(R.id.messager_textview);

        final Button resetButton = findViewById(R.id.reset_button);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter = 0;
                updateView();

            }
        });

        // temp area
        //mMessageTextView.setText("Matt is cool!");
        Log.d("HB",  "This is a log cat log. Logs are important!");

        //example crash not good
        //mMessageTextView = findViewById(0);
       // mMessageTextView.setText("Matt will crash!");
    }



    //own functions and method here.

    public void handleDecrement(View view){
      mCounter -= 1;
      updateView();

    }

    public void handleIncrement(View view){
       mCounter += 1;
       updateView();
    }


    //This function is used to update the view after buttons have been pressed
    private void updateView(){
        if (mCounter > 10)
            mMessageTextView.setVisibility(View.INVISIBLE);
        if (mCounter < 10)
            mMessageTextView.setVisibility(View.VISIBLE);
            mMessageTextView.setText(getString(R.string.message_format, mCounter));
       {

        }

    }
}
