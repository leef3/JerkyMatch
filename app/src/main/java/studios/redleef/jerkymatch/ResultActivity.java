package studios.redleef.jerkymatch;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class ResultActivity extends Activity {

    SharedPreferences prefs;
    private final static String QUESTION_1_KEY = "QUESTION_1_KEY";
    private final static String QUESTION_2_KEY = "QUESTION_2_KEY";
    private final static String QUESTION_3_KEY = "QUESTION_3_KEY";
    private final static String QUESTION_4_KEY = "QUESTION_4_KEY";
    private final static String QUESTION_5_KEY = "QUESTION_5_KEY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        prefs = PreferenceManager.getDefaultSharedPreferences(this);

        TextView resultText = (TextView) findViewById(R.id.quizResult);

        resultText.setText(CalculateResult());

    }

    private String CalculateResult()
    {
        //Make the upper loop limit a stored value of num pages
        int question1 = prefs.getInt(QUESTION_1_KEY, 0);
        int question2 = prefs.getInt(QUESTION_2_KEY, 0);
        int question3 = prefs.getInt(QUESTION_3_KEY, 0);
        int question4 = prefs.getInt(QUESTION_4_KEY, 0);
        int question5 = prefs.getInt(QUESTION_5_KEY, 0);

        String resultInt = "" + question1 + question2 + question3 + question4 + question5;

        return resultInt;
    }
}
