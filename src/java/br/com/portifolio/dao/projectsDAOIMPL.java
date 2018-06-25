package br.com.portifolio.dao;

import br.com.portifolio.domain.Projects;
import br.com.portifolio.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class projectsDAOIMPL implements projectsDAO {

    private List<Projects> list;

    @Override
    public void save(Projects project) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.update(project);
        tx.commit();
        session.flush();
        session.close();
    }

    @Override
    public void delete(Projects project) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(project);
        tx.commit();
    }

    @Override
    public List<Projects> find() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Criteria cri = session.createCriteria(Projects.class);
        this.list = cri.list();
        session.close();
        return list;
    }

}
