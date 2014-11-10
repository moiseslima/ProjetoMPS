package business;

public class UsuarioException extends Exception{
    private String msg;  
    public UsuarioException(String msg){  
      super(msg);  
      this.msg = msg;  
    }  
    public String getMessage(){  
      return msg;  
    }  
}    
