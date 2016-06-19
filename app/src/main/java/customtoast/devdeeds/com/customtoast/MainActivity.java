package customtoast.devdeeds.com.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowToast = (Button) findViewById(R.id.show_toast);

        btnShowToast.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                showToast();
            }
        });
    }


    public void showToast() {

        View toastLayout = getLayoutInflater().inflate(R.layout.toast_layout, null);

        Toast toast = new Toast(getApplicationContext());
        toast.setView(toastLayout);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();

    }


}
