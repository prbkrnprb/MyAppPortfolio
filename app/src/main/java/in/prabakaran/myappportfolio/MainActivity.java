package in.prabakaran.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements Button.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotifyStreamerBtn = (Button) this.findViewById(R.id.spotifyStreamerBtn);
        Button scoresBtn = (Button) this.findViewById(R.id.scoresBtn);
        Button libraryBtn = (Button) this.findViewById(R.id.libraryBtn);
        Button buildItBiggerBtn = (Button) this.findViewById(R.id.buildItBiggerBtn);
        Button xyzReaderBtn = (Button) this.findViewById(R.id.xyzReaderBtn);
        Button capstoneBtn = (Button) this.findViewById(R.id.capstoneBtn);

        spotifyStreamerBtn.setOnClickListener(this);
        scoresBtn.setOnClickListener(this);
        libraryBtn.setOnClickListener(this);
        buildItBiggerBtn.setOnClickListener(this);
        xyzReaderBtn.setOnClickListener(this);
        capstoneBtn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        String toastText = "";
        switch (v.getId()){
            case R.id.spotifyStreamerBtn:
                toastText = getString(R.string.spotify_streamer);
                break;
            case R.id.scoresBtn:
                toastText = getString(R.string.scores);
                break;
            case R.id.libraryBtn:
                toastText = getString(R.string.library);
                break;
            case R.id.buildItBiggerBtn:
                toastText = getString(R.string.build_it_bigger);
                break;
            case R.id.xyzReaderBtn:
                toastText = getString(R.string.xyz_reader);
                break;
            case R.id.capstoneBtn:
                toastText = getString(R.string.capstone);
        }
        toastText = getString(R.string.toast_prefix_text) + toastText;
        Toast.makeText(this,toastText,Toast.LENGTH_LONG).show();
    }
}
