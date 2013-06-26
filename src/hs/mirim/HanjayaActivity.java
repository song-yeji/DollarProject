package hs.mirim;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class HanjayaActivity extends Activity {
    /** Called when the activity is first created. */
	int level = 1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final String gameLevel[] = new String[]{"1단계", "2단계", "3단계", "4단계", "5단계", "6단계", "7단계", "8단계", "9단계", "10단계"};
        
        ImageButton btnGo = (ImageButton)findViewById(R.id.btnGo);
        
        btnGo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				View startView = getLayoutInflater().inflate(R.layout.list, null);
				AlertDialog.Builder alert = new AlertDialog.Builder(HanjayaActivity.this);
				alert.setTitle("단계선택");
				alert.setView(startView);
				alert.setSingleChoiceItems(gameLevel, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						level = which;
						Log.e("Test", which+" ] 를 눌렀다");
						
						//단계별로 게임화면 뜨게하기!!!
						
						
					}
				});
				alert.setPositiveButton("선택", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						switch(level){
						case 1: 
						case 2:
						
						}
					}
				});
				alert.show();
			}
		});
    }
}