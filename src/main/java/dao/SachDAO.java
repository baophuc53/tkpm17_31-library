package dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Docgia;
import pojo.Sach;
import util.HibernateUtil;

public class SachDAO {
	public static List<Sach> layDanhSachSach() {
		List<Sach> ds = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			String hql = "select sach from Sach as sach";
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
