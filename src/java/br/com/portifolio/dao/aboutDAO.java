package br.com.portifolio.dao;

import br.com.portifolio.domain.About;
import java.util.List;

public interface aboutDAO {

    void save(About sobre);

    List<About> find();
}
