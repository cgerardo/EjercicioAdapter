package com.example.pcamacho.ejercicioadapter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnTurkey;
    Button btnDuck;
    Button btnTurkeyAdapter;
    MallardDuck duck;
    wildTurkey turkey;
    Duck turkeyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTurkey=(Button)findViewById(R.id.btn_turkey);
        btnDuck=(Button)findViewById(R.id.btn_duck);
        btnTurkeyAdapter=(Button)findViewById(R.id.btn_turkey_adapter);

        btnTurkey.setOnClickListener(this);
        btnDuck.setOnClickListener(this);
        btnTurkeyAdapter.setOnClickListener(this);

        duck=new MallardDuck();
        turkey=new wildTurkey();
        turkeyAdapter=new TurkeyAdapter(turkey);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_duck:
                Toast.makeText(getApplicationContext(), duck.quack()+"\n"+duck.fly(), Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_turkey:
                Toast.makeText(getApplicationContext(), turkey.gobble()+"\n"+turkey.fly(), Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_turkey_adapter:
                Toast.makeText(getApplicationContext(), turkeyAdapter.quack()+"\n"+turkeyAdapter.fly(), Toast.LENGTH_LONG).show();
        }

    }


}
