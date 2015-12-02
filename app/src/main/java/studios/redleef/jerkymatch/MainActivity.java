package studios.redleef.jerkymatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import studios.redleef.jerkymatch.QuestionPages.Question1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startBasic(View v)
    {
        Intent i = new Intent(MainActivity.this, Question1.class);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        startActivity(i);
        //When the sequence is started again make sure to clear the last memory (if use presses back the progress is lost)
    }
}
