package br.optimize.loja_virtual;

import br.optimize.loja_virtual.util.MensagemUtil;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class DashBoardActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dashboard);
		String msg = getIntent().getExtras().getString("msg");
		MensagemUtil.addMsg(DashBoardActivity.this, msg);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0,1,1,"Lista");
		return true;
	}
	
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		int id = item.getItemId();
		
		switch (id) {
		case 1:
			Intent intent = new Intent(this,DashBoardListActivity.class);
			startActivity(intent);
			finish();
			break;

		default:
			break;
		}
		return true;
	}
}
