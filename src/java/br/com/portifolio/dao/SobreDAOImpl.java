package br.com.portifolio.dao;

import br.com.portifolio.util.HibernateUtil;
import br.com.portifolio.domain.Sobre;
//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SobreDAOImpl implements SobreDAO {

    @Override
    public void salvarAtualizar(Sobre sobre) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(sobre);
        tx.commit();
        session.flush();
        session.close();
    }

}
