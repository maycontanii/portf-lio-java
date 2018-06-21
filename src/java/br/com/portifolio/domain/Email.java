package br.com.portifolio.domain;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;

public class Email {

    private String remetente;
    private String mensagem;
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public boolean envioEmail() {
        SimpleEmail email = new SimpleEmail();
        email.setSSLOnConnect(true);
        email.setHostName("smtp.googlemail.com");
        email.setSslSmtpPort("587");
        email.setAuthenticator(new DefaultAuthenticator("------","----"));//autenticação
        try {
            email.setFrom(this.remetente, this.nome);//setando seu email e nome
            email.setStartTLSEnabled(true);
            email.setDebug(true);

            email.setSubject("[Contato via portifólio]");

            email.setMsg("Remetente: " + this.remetente + "\nMensagem:" + this.mensagem);
            email.addTo("");
            email.send();
            return true;
        } catch (EmailException e) {
            e.printStackTrace();
        }
        return false;
    }
}
