package br.com.portifolio.dao;

import br.com.portifolio.domain.About;
import br.com.portifolio.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class aboutDAOIMPL implements aboutDAO {

    private List<About> list;

    @Override
    public void save(About about) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(about);
        tx.commit();
        session.flush();
        session.close();
    }

    @Override
    public void delete(About about) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(about);
        tx.commit();
    }

    @Override
    public List<About> find() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Criteria cri = session.createCriteria(About.class);
        this.list = cri.list();
        session.close();
        return list;
    }
}
