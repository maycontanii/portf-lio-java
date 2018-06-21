package br.com.portifolio.controller;

import br.com.portifolio.dao.SobreDAOImpl;
import br.com.portifolio.domain.Sobre;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped
public class SobreBEAN implements Serializable {

    SobreDAOImpl sobreimp = new SobreDAOImpl();
    private Sobre sobre = new Sobre();

    public Sobre getSobre() {
        return sobre;
    }

    public void setSobre(Sobre Sobre) {
        this.sobre = Sobre;
    }

    public SobreDAOImpl getSobreimp() {
        return sobreimp;
    }

    public void setSobreimp(SobreDAOImpl Sobreimp) {
        this.sobreimp = sobreimp;
    }

    public void salvarInf() {
        sobreimp.salvarAtualizar(sobre);
    }
}
