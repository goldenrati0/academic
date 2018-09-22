package bd.ac.bracu.cse470.cse470;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button firstButton, secondButton;
    private TextView scoreTextView;

    private int num1, num2, score;
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstButton = (Button) findViewById(R.id.firstButton);
        secondButton = (Button) findViewById(R.id.secondButton);
        scoreTextView = (TextView) findViewById(R.id.scoreTextView);

        num1 = 0;
        num2 = 0;
        score = 0;
        random = new Random();
        setRandomNumber();
    }

    public void firstOnClick(View view) {
        if (num1 > num2) {
            score++;
            makeToast("Correct");
        } else {
            score--;
            makeToast("Wrong");
        }
        setRandomNumber();
    }

    public void secondOnClick(View view) {
        if (num1 < num2) {
            score++;
            makeToast("Correct");
        } else {
            score--;
            makeToast("Wrong");
        }
        setRandomNumber();
    }

    public void setRandomNumber() {

        num1 = random.nextInt(100);
        num2 = random.nextInt(100);

        firstButton.setText(String.valueOf(num1));
        secondButton.setText(String.valueOf(num2));
        scoreTextView.setText(String.valueOf("Score" + score));
    }

    public void makeToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
