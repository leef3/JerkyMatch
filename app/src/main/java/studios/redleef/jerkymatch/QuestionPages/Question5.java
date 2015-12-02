package studios.redleef.jerkymatch.QuestionPages;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import studios.redleef.jerkymatch.R;
import studios.redleef.jerkymatch.ResultActivity;

public class Question5 extends Activity {

    private final static String QUESTION_5_KEY = "QUESTION_5_KEY";
    SharedPreferences prefs;
    SeekBar spiceBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);

        prefs = PreferenceManager.getDefaultSharedPreferences(this);


        spiceBar = (SeekBar) findViewById(R.id.seekBar);
        spiceBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,boolean fromUser) {
                // TODO Auto-generated method stub

                SetTextLabel(progress);
            }
        });
    }

    private void SetTextLabel(int progress)
    {
        TextView spiceLabel = (TextView)findViewById(R.id.spiceLabel);
        TextView spiceProgress = (TextView)findViewById(R.id.spiceProgress);
        switch(progress)
        {
            case 0:
                spiceLabel.setText(getString(R.string.Question_5_option_1));
                spiceProgress.setText(progress + 1 + "");
                break;
            case 1:
                spiceLabel.setText(getString(R.string.Question_5_option_2));
                spiceProgress.setText(progress + 1 + "");
                break;
            case 2:
                spiceLabel.setText(getString(R.string.Question_5_option_3));
                spiceProgress.setText(progress + 1 + "");
                break;
            case 3:
                spiceLabel.setText(getString(R.string.Question_5_option_4));
                spiceProgress.setText(progress + 1 + "");
                break;
            case 4:
                spiceLabel.setText(getString(R.string.Question_5_option_5));
                spiceProgress.setText(progress + 1 + "");
                break;
            case 5:
                spiceLabel.setText(getString(R.string.Question_5_option_6));
                spiceProgress.setText(progress + 1 + "");
                break;
            case 6:
                spiceLabel.setText(getString(R.string.Question_5_option_7));
                spiceProgress.setText(progress + 1 + "");
                break;
            case 7:
                spiceLabel.setText(getString(R.string.Question_5_option_8));
                spiceProgress.setText(progress + 1 + "");
                break;
            case 8:
                spiceLabel.setText(getString(R.string.Question_5_option_9));
                spiceProgress.setText(progress + 1 + "");
                break;
            default:
                break;
        }
    }

    public void saveSeekBar(View v)
    {
        int seekBarInt = spiceBar.getProgress() + 1;
        prefs.edit().putInt(QUESTION_5_KEY, seekBarInt);
        StartNextQuestion();

    }

    private void StartNextQuestion()
    {
        Intent i = new Intent(Question5.this, ResultActivity.class);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        startActivity(i);
        finish();
    }
}
