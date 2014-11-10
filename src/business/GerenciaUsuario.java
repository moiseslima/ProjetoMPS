/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

/**
 *
 * @author aluno
 */
public class GerenciaUsuario{
    
    Usuario CriaUsuario(String nome, String email, int idade, String login, String senha) throws UsuarioException{
       if(!verificaNome(nome)){
           throw new UsuarioException("Nome inválido");
       }
       if(!verificaEmail(email)){
           throw new UsuarioException("Email inválido");
       }
       
       return new Usuario(nome, email, idade, login, senha);
    }
    
    boolean ExcluiUsuario(Usuario user){
        
    }
    
    boolean EditaUsuario(Usuario user){
        
    }
    
    Usuario BuscaUsuario(Usuario user){
        
    }

    
}
