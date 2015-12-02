package studios.redleef.jerkymatch.QuestionPages;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;

import studios.redleef.jerkymatch.R;

public class Question4 extends Activity {

    private final static String QUESTION_4_KEY = "QUESTION_4_KEY";
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        prefs = PreferenceManager.getDefaultSharedPreferences(this);
    }

    public void option1Select(View v)
    {
        prefs.edit().putInt(QUESTION_4_KEY, 1);
        StartNextQuestion();
    }
    public void option2Select(View v)
    {
        prefs.edit().putInt(QUESTION_4_KEY, 2);
        StartNextQuestion();
    }
    public void option3Select(View v)
    {
        prefs.edit().putInt(QUESTION_4_KEY, 3);
    }
    public void option4Select(View v)
    {
        prefs.edit().putInt(QUESTION_4_KEY, 4);
    }

    private void StartNextQuestion()
    {
        Intent i = new Intent(Question4.this, Question5.class);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        startActivity(i);
        finish();
    }

}
