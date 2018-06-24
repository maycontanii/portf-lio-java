package br.com.portifolio.controller;

import br.com.portifolio.dao.HomeDAOImpl;
import br.com.portifolio.domain.Home;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped
public class homeBEAN implements Serializable {

    HomeDAOImpl homeimp = new HomeDAOImpl();
    private Home home = new Home();
    private List<Home> listhome;

    public Home getHome() {
        return home;
    }

    public List<Home> getListhome() {
        listhome = homeimp.find();
        return listhome;
    }

    public void saveInfo() {
        homeimp.save(home);
    }

    public void loadInf(Home h) {
        home = h;
    }
}
