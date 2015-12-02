package studios.redleef.jerkymatch.QuestionPages;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;

import studios.redleef.jerkymatch.R;

public class Question3 extends Activity {

    private final static String QUESTION_3_KEY = "QUESTION_3_KEY";
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        prefs = PreferenceManager.getDefaultSharedPreferences(this);
    }

    public void option1Select(View v)
    {
        prefs.edit().putInt(QUESTION_3_KEY, 1);
        StartNextQuestion();
    }
    public void option2Select(View v)
    {
        prefs.edit().putInt(QUESTION_3_KEY, 2);
        StartNextQuestion();

    }
    public void option3Select(View v)
    {
        prefs.edit().putInt(QUESTION_3_KEY, 3);
    }
    public void option4Select(View v)
    {
        prefs.edit().putInt(QUESTION_3_KEY, 4);
    }

    private void StartNextQuestion()
    {
        Intent i = new Intent(Question3.this, Question4.class);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        startActivity(i);
        finish();
    }
}
