package cheng.com.bai20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityA extends AppCompatActivity {

    private EditText edtTitle, edtDescription;
    private Button btnSendData;

    public static final String TITLE ="TITLE";
    public static final String DESCRIPTION ="DESCRIPTION";
    public static final String BUNDLE ="BUNDLE";


    public ActivityA() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        edtTitle = (EditText) findViewById(R.id.edt_title);
        edtDescription = (EditText) findViewById(R.id.edt_description);
        btnSendData = (Button) findViewById(R.id.btn_send_data);


        btnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = edtTitle.getText().toString();
                String description = edtDescription.getText().toString();
                //byExtras(title,description);
                byBundle(title,description);
            }
        });
    }
    public void byExtras(String title, String description){
        Intent intent = new Intent(ActivityA.this, ActivityB.class);
        intent.putExtra(TITLE,title);
        intent.putExtra(DESCRIPTION,description);
        startActivity(intent);
    }

    public void byBundle(String title, String description){
        Intent intent = new Intent(ActivityA.this, ActivityB.class);
        Bundle bundle = new Bundle();
        bundle.putString(TITLE,title);
        bundle.putString(DESCRIPTION,description);
        intent.putExtra(BUNDLE,bundle);
        startActivity(intent);
    }

}
