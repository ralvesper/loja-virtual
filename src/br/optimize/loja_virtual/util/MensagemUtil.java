package br.optimize.loja_virtual.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import br.optimize.loja_virtual.R;

public class MensagemUtil {

	/**
	 * Método para exibição de mensagens rápidas.
	 * 
	 * @param activity
	 * @param mensagem
	 */
	public static void addMsg(Activity activity, String mensagem) {
		Toast.makeText(activity, mensagem, Toast.LENGTH_SHORT).show();
	}

	/**
	 * Método para exibição de mensagem com botão Ok para fechar a janela
	 * 
	 * @param activity
	 * @param titulo
	 * @param msg
	 * @param icone
	 */
	public static void addMsgOk(Activity activity, String titulo, String msg,
			int icone) {
		AlertDialog.Builder builderDialog = new AlertDialog.Builder(activity);
		builderDialog.setTitle(titulo);
		builderDialog.setIcon(R.drawable.about);
		builderDialog.setMessage(msg);
		builderDialog.setNeutralButton("Ok", null);
		builderDialog.show();
	}

	/**
	 * Método para apresentção de mensagem de confirmação.
	 * 
	 * @param activity
	 * @param titulo
	 * @param msg
	 * @param icone
	 * @param listener
	 */
	public static void addMsgConfirm(Activity activity, String titulo,
			String msg, int icone, OnClickListener listener) {
		AlertDialog.Builder builderDialog = new AlertDialog.Builder(activity);
		builderDialog.setTitle(titulo);
		builderDialog.setIcon(R.drawable.about);
		builderDialog.setMessage(msg);
		builderDialog.setPositiveButton("Sim", listener);
		builderDialog.setNegativeButton("Não", null);
		builderDialog.show();
	}

}
