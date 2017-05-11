package one.rdj.com.smartnetworkdictionary;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class FeedbackActivity extends AppCompatActivity {

    public TextView name, konten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        name = (TextView) findViewById(R.id.name);
        konten = (TextView) findViewById(R.id.feedback);
        //Toast.makeText(FeedbackActivity.this, "Your message has been send", Toast.LENGTH_SHORT);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.send_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_send:
                Intent sendEmail = new Intent(Intent.ACTION_SEND);
                sendEmail.putExtra(Intent.EXTRA_EMAIL, new String[]{ "rohmaddj@gmail.com"});
                sendEmail.putExtra(Intent.EXTRA_SUBJECT, name.getText().toString());
                sendEmail.putExtra(Intent.EXTRA_TEXT, konten.getText().toString());
                sendEmail.setType("message/rfc822");
                startActivity(sendEmail);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}