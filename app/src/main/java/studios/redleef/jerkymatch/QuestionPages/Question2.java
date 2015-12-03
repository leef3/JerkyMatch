package studios.redleef.jerkymatch.QuestionPages;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;

import studios.redleef.jerkymatch.R;

public class Question2 extends Activity {

    private final static String QUESTION_2_KEY = "QUESTION_2_KEY";
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        prefs = PreferenceManager.getDefaultSharedPreferences(this);
    }

    public void option1Select(View v)
    {
        prefs.edit().putInt(QUESTION_2_KEY, 1);
        StartNextQuestion(1);
    }
    public void option2Select(View v)
    {
        prefs.edit().putInt(QUESTION_2_KEY, 2);
        StartNextQuestion(2);
    }
    public void option3Select(View v)
    {
        prefs.edit().putInt(QUESTION_2_KEY, 3);
        StartNextQuestion(3);
    }
    public void option4Select(View v)
    {
        prefs.edit().putInt(QUESTION_2_KEY, 4);
        StartNextQuestion(4);
    }

    private void StartNextQuestion(int position)
    {
        Intent i = new Intent(Question2.this, Question3.class);
        Bundle extras = getIntent().getExtras();
        String preceding = "";
        if(extras != null)
        {
            preceding = extras.getString("JERKY_ID");
        }
        String selected = preceding + position;
        i.putExtra("JERKY_ID", selected);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        startActivity(i);
        finish();
    }
}
