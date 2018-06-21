package br.com.portifolio.dao;

import br.com.portifolio.domain.Home;
import java.util.List;

public interface HomeDAO {

    void salvarAtualizar(Home home);
    
    void excluir(Home home);

    List<Home> buscarInfo();
}
