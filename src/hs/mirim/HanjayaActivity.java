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
        
        final String gameLevel[] = new String[]{"1�ܰ�", "2�ܰ�", "3�ܰ�", "4�ܰ�", "5�ܰ�", "6�ܰ�", "7�ܰ�", "8�ܰ�", "9�ܰ�", "10�ܰ�"};
        
        ImageButton btnGo = (ImageButton)findViewById(R.id.btnGo);
        
        btnGo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				View startView = getLayoutInflater().inflate(R.layout.list, null);
				AlertDialog.Builder alert = new AlertDialog.Builder(HanjayaActivity.this);
				alert.setTitle("�ܰ輱��");
				alert.setView(startView);
				alert.setSingleChoiceItems(gameLevel, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						level = which;
						Log.e("Test", which+" ] �� ������");
						
						//�ܰ躰�� ����ȭ�� �߰��ϱ�!!!
						
						
					}
				});
				alert.setPositiveButton("����", new DialogInterface.OnClickListener() {
					
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