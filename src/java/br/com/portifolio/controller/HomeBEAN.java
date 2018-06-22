package br.com.portifolio.controller;

import br.com.portifolio.dao.HomeDAOImpl;
import br.com.portifolio.domain.Home;
import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped
public class homeBEAN implements Serializable {

    HomeDAOImpl homeimp = new HomeDAOImpl();
    private Home home = new Home();
    private ArrayList<Home> listahome;

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public HomeDAOImpl getHomeimp() {
        return homeimp;
    }

    public void setHomeimp(HomeDAOImpl homeimp) {
        this.homeimp = homeimp;
    }

    public void salvarInf() {
        homeimp.salvarAtualizar(home);
    }

    public ArrayList<Home> getListahome() {
        listahome = homeimp.buscarInfo();
        return listahome;
    }

    public String removerInf(Home h) {
        this.home = h;
        homeimp.excluir(this.home);
        this.home.setTituloHome(null);
        this.home.setSubtituloHome(null);
        return "home";
    }
    
    public String carregar(Home h){
        home = h;
        return "home";
    }
}
