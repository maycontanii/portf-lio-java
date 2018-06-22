package br.com.portifolio.dao;

import br.com.portifolio.domain.Skills;
import br.com.portifolio.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class skillsDAOIMPL implements skillsDAO {

    private List<Skills> list;

    @Override
    public void save(Skills skill) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(skill);
        tx.commit();
        session.flush();
        session.close();
    }

    @Override
    public void delete(Skills skill) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(skill);
        tx.commit();
    }

    @Override
    public List<Skills> find() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Criteria cri = session.createCriteria(Skills.class);
        this.list = cri.list();
        session.close();
        return list;
    }
}
