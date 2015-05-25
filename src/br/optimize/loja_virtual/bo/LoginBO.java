package br.optimize.loja_virtual.bo;

import android.content.Context;
import br.optimize.loja_virtual.R;
import br.optimize.loja_virtual.dominio.ValidacaoLogin;
import br.optimize.loja_virtual.sqlite.LoginOpenHelper;

public class LoginBO {
	
	private Context context;
	
	private LoginOpenHelper helper;
	
	public LoginBO(Context context) {
		this.context = context;
		 helper = new LoginOpenHelper(context);
	}
	
	public ValidacaoLogin validarLogin(String login, String senha){
		
		ValidacaoLogin retorno = new ValidacaoLogin();
		
		if (login == null || "".equals(login)) {
			retorno.setValido(false);
			retorno.setMensagem(context.getString(R.string.msg_login_obg));
		}else if (senha == null || "".equals(senha)) {
			retorno.setValido(false);
			retorno.setMensagem(context.getString(R.string.msg_senha_obg));
		}else if (helper.valilarLogin(login, senha)){
			retorno.setValido(true);
			retorno.setMensagem(context.getString(R.string.msg_login_sucesso));
		}else {
			retorno.setValido(false);
			retorno.setMensagem(context.getString(R.string.msg_login_fail));
		}
		return retorno;
	}
}
