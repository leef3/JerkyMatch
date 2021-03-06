package studios.redleef.jerkymatch;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class TutorialActivity extends AppIntro {

    @Override
    public void init(Bundle savedInstanceState) {

        // Instead of fragments, you can also use our default slide
        // Just set a title, description, background and image. AppIntro will do the rest
        addSlide(AppIntroFragment.newInstance(getString(R.string.Tutorial_Title_1), getString( R.string.Tutorial_Description_1), R.drawable.cow, Color.parseColor("#26A69A")));
        addSlide(AppIntroFragment.newInstance(getString(R.string.Tutorial_Title_2), getString( R.string.Tutorial_Description_2), R.drawable.choice, Color.parseColor("#26A69A")));
        addSlide(AppIntroFragment.newInstance(getString(R.string.Tutorial_Title_3), getString( R.string.Tutorial_Description_3), R.drawable.cowtarget, Color.parseColor("#26A69A")));
        addSlide(AppIntroFragment.newInstance(getString(R.string.Tutorial_Title_4), getString( R.string.Tutorial_Description_4), R.drawable.delivery, Color.parseColor("#26A69A")));

        // OPTIONAL METHODS
        // Override bar/separator color

        setBarColor(Color.parseColor("#3F51B5"));
        setSeparatorColor(Color.parseColor("#2196F3"));


        // Hide Skip/Done button
        showSkipButton(true);
        showDoneButton(true);
    }

    @Override
    public void onSkipPressed() {
        // Do something when users tap on Skip button.
        Intent i = new Intent(TutorialActivity.this, MainActivity.class);
        startActivity(i);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        finish();
    }

    @Override
    public void onDonePressed() {
        // Do something when users tap on Done button.
        Intent i = new Intent(TutorialActivity.this, MainActivity.class);
        startActivity(i);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        finish();
    }

    @Override
    public void onNextPressed() {

    }

    @Override
    public void onSlideChanged() {

    }
}