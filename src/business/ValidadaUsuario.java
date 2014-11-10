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
public class ValidadaUsuario {
        
    boolean verificaNome(String nome){
        return (!(nome.length() > 300) || !(nome.length() < 5) || !(nome.matches(".*\\d.*")));
            
    }
    
    boolean verificaEmail(String email){
        return (!(email.contais("@"))|| (email.substring(0, 1).equals("@")) || (email.substring(email.length()-2, email.length()-1).equals("@")));
    }
    
    boolean verificaIdade(int idade){
        return (idade >= 0 && idade <= 150);
    }
    
    boolean(String login){
        return (login.length() > 0 && login.length() <= 20 && !(login.matches(".*\\d.*")));
    }

}
