package br.com.portifolio.controller;

import br.com.portifolio.domain.Email;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean
@SessionScoped
public class emailBEAN implements Serializable{
    private Email email;
 
    public emailBEAN(){
        email = new Email();
    }
    
    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
    
    public void enviarEmail(){
        if(email.envioEmail())
            System.out.println("Enviado!");
        else
            System.out.println("Erro!");
    }
}
