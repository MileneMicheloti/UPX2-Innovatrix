package com.mycompany.doaki;

import com.mycompany.doaki.modelo.dao.UsuarioDao;
import com.mycompany.doaki.modelo.dominio.Perfil;
import com.mycompany.doaki.modelo.dominio.Usuario;

public class UsuarioTeste {

    public static void main(String[] args) {
        Usuario usuario = new Usuario(0L, "Brenda Miranda", "Teste@123", "bre", Perfil.ADMIN);

        UsuarioDao usuarioDao = new UsuarioDao();
        String mensagem = usuarioDao.salvar(usuario);
        System.out.println(mensagem);
    }

}
