package br.com.portifolio.dao;

import br.com.portifolio.domain.Home;
import java.util.List;

public interface HomeDAO {

    void save(Home home);

    List<Home> find();
}
