package dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Docgia;
import util.HibernateUtil;

public class DocgiaDAO {
	public static List<Docgia> layDanhSachDocgia() {
		List<Docgia> ds = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			String hql = "select docgia from Docgia as docgia";
			ds = session.createQuery(hql).getResultList();
		} catch (HibernateException ex) {
//Log the exception
			System.err.println(ex);
		} finally {
			session.close();
		}
		return ds;
	}
}
