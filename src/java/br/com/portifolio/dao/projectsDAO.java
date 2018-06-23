package br.com.portifolio.dao;

import br.com.portifolio.domain.Projects;
import java.util.List;

public interface projectsDAO {
    
    void save(Projects project);

    void delete(Projects project);

    List<Projects> find();
}
