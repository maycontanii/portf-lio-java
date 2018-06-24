package br.com.portifolio.controller;

import br.com.portifolio.dao.projectsDAOIMPL;
import br.com.portifolio.domain.Projects;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped
public class projectsBEAN implements Serializable {

    projectsDAOIMPL projectimp = new projectsDAOIMPL();
    private Projects project = new Projects();
    private List<Projects> projectlist;

    public Projects getProject() {
        return project;
    }

    public List<Projects> getProjectlist() {
        projectlist = projectimp.find();
        return projectlist;
    }

    public void removeInfo(Projects p) {
        this.project = p;
        projectimp.delete(this.project);
        this.project.setTitle(null);
        this.project.setDescription(null);
        this.project.setLink(null);
    }

    public void saveInfo() {
        projectimp.save(project);
    }

    public void loadInf(Projects p) {
        project = p;
    }
}
