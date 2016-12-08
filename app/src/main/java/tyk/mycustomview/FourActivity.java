package tyk.mycustomview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FourActivity extends AppCompatActivity {
    private MyBesselView besselView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        initview();
    }

    private void initview() {

        besselView = (MyBesselView) findViewById(R.id.my_besselview);

    }
}
