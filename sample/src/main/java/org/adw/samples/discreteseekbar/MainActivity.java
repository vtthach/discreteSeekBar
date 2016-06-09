package org.adw.samples.discreteseekbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import org.adw.library.widgets.discreteseekbar.DiscreteSeekBar;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final DiscreteSeekBar discreteSeekBar1 = (DiscreteSeekBar) findViewById(R.id.discrete1);
        discreteSeekBar1.setNumericTransformer(new DiscreteSeekBar.NumericTransformer() {
            @Override
            public int transform(int value) {
                return value * 100;
            }
        });

        final DiscreteSeekBar discreteSeekBar2 = (DiscreteSeekBar) findViewById(R.id.discrete2);

        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                discreteSeekBar2.setVisibility(discreteSeekBar2.getVisibility() != View.VISIBLE ? View.VISIBLE : View.GONE);
            }
        });
    }

}
