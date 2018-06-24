package br.com.portifolio.dao;

import br.com.portifolio.util.HibernateUtil;
import br.com.portifolio.domain.Home;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HomeDAOImpl implements HomeDAO {

    private ArrayList<Home> list;

    @Override
    public void save(Home home) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(home);
        tx.commit();
        session.flush();
        session.close();
    }

    @Override
    public ArrayList<Home> find() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Criteria cri = session.createCriteria(Home.class);
        this.list = (ArrayList<Home>) cri.list();
        session.close();
        return list;
    }
}
