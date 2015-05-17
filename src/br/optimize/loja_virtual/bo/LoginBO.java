package br.optimize.loja_virtual.bo;

import android.content.Context;
import br.optimize.loja_virtual.R;

public class LoginBO {
	
	private Context context;
	
	public LoginBO(Context context) {
		this.context = context;
	}
	
	public String validarLogin(String login, String senha){
		if (login == null || "".equals(login)) {
			return context.getString(R.string.msg_login_obg);
		}else if (senha == null || "".equals(senha)) {
			return context.getString(R.string.msg_senha_obg);
		}
		return null;
	}
}
