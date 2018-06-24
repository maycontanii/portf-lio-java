package br.com.portifolio.controller;

import br.com.portifolio.dao.aboutDAOIMPL;
import br.com.portifolio.domain.About;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped
public class aboutBEAN implements Serializable {

    aboutDAOIMPL aboutimp = new aboutDAOIMPL();
    private About about = new About();
    private List<About> listabout;

    public About getAbout() {
        return about;
    }

    public List<About> getListabout() {
        listabout = aboutimp.find();
        return listabout;
    }

    public void saveInfo() {
        aboutimp.save(about);
    }

    public void loadInfo(About a) {
        about = a;
    }
}
