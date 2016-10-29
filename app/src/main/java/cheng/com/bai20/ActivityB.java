package cheng.com.bai20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    private TextView tvTitle, tvDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        tvTitle = (TextView) findViewById(R.id.tv_title);
        tvDescription = (TextView) findViewById(R.id.tv_description);

       // setDataByExtras();
        setDataByBundle();

    }

    public void setDataByExtras(){
        Intent intent = getIntent();
        String title = intent.getStringExtra(ActivityA.TITLE);
        String description = intent.getStringExtra(ActivityA.DESCRIPTION);

        tvTitle.setText(title);
        tvDescription.setText(description);
    }
    public void setDataByBundle(){
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra(ActivityA.BUNDLE);
        String title = bundle.getString(ActivityA.TITLE);
        String description = bundle.getString(ActivityA.DESCRIPTION);

        tvTitle.setText(title);
        tvDescription.setText(description);
    }
}
