package br.com.portifolio.controller;

import br.com.portifolio.dao.skillsDAOIMPL;
import br.com.portifolio.domain.Skills;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped
public class skillsBEAN implements Serializable {

    skillsDAOIMPL skillimp = new skillsDAOIMPL();
    private Skills skill = new Skills();
    private List<Skills> listskill;

    public Skills getSkill() {
        return skill;
    }

    public List<Skills> getListskill() {
        listskill = skillimp.find();
        return listskill;
    }

    public void Remove(Skills s) {
        this.skill = s;
        skillimp.delete(this.skill);
        this.skill.setTechnology(null);
        this.skill.setLeveltech(null);
    }

    public void Load(Skills s) {
        skill = s;
    }

    public void saveInfo() {
        skillimp.save(skill);
    }

}
