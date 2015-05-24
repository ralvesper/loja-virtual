package br.optimize.loja_virtualsqlite;

import java.util.ResourceBundle;

import br.optimize.loja_virtual.comum.Constantes;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class LoginOpenHelper extends SQLiteOpenHelper {
	
	private static ResourceBundle config = ResourceBundle.getBundle(Constantes.DB_CONFIG_PROPS);

	public LoginOpenHelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
	}
	
	public LoginOpenHelper(Context context) {
		super(context, config.getString(Constantes.DB_CONFIG_NOME), null, Integer.parseInt(config.getString(Constantes.DB_CONFIG_VERSAO)));
		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
	

}
