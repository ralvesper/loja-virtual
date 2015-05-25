package br.optimize.loja_virtual.sqlite;

import java.util.Locale;
import java.util.ResourceBundle;

import br.optimize.loja_virtual.comum.Constantes;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class LoginOpenHelper extends SQLiteOpenHelper {

	private static ResourceBundle config = 
			ResourceBundle.getBundle(Constantes.DB_CONFIG_PROPS, Locale.getDefault());

	public LoginOpenHelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	public LoginOpenHelper(Context context) {
		super(context, config.getString(Constantes.DB_CONFIG_NOME), null, Integer.parseInt(config.getString(Constantes.DB_CONFIG_VERSAO)));

	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		StringBuilder sql = new StringBuilder();
		sql.append("CREATE TABLE TB_USUARIO (");
		sql.append(" ID_USUARIO INTEGER PRIMARY KEY AUTOINCREMENT,");
		sql.append(" LOGIN TEXT NOT NULL,");
		sql.append(" SENHA TEXT NOT NULL)");

		db.execSQL(sql.toString());
		mockPopulaUsuarios(db);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}
	
	private void mockPopulaUsuarios(SQLiteDatabase db){
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO TB_USUARIO (LOGIN, SENHA) VALUES ('rodrigo',123)");
		db.execSQL(sql.toString());
		
		ContentValues values = new ContentValues();
		values.put("LOGIN", "admin");
		values.put("SENHA", "admin");
		
		db.insert("TB_USUARIO", null, values);
		
	}
	
	public boolean valilarLogin(String usuario, String senha){
		SQLiteDatabase db = getReadableDatabase();
		Cursor cursor = db.query("TB_USUARIO", null, "LOGIN = ? AND SENHA = ?", new String[]{usuario, senha}, null, null, null);
		
		if (cursor.moveToFirst()){
			return true;
		}
		
		return false;
	}
	

}
