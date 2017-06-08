package com.jsu.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.jsu.Idao.IConfigDao;
import com.jsu.Idao.IUserDao;
import com.jsu.po.Users;

public class ICoinfigDaoImpl implements IConfigDao {
	
	private HibernateTemplate hibernateTemplate;  
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {  
		this.sessionFactory = sessionFactory;
      //  this.hibernateTemplate = new HibernateTemplate(sessionFactory);  
    }  
	
	public HibernateTemplate getHibernateTemplate(){
		
		if( hibernateTemplate==null)
			
			hibernateTemplate = new HibernateTemplate(sessionFactory);
	
		return hibernateTemplate;
	}
	

    public List queryBySql(String sql) {    
        List<Object[]> list = getHibernateTemplate().getSessionFactory().openSession().createSQLQuery(sql).list();    
        return list;    
    }    
        
    public int excuteBySql(String sql)    
    {    
        int result ;    
        SQLQuery query = getHibernateTemplate().getSessionFactory().openSession().createSQLQuery(sql);    
        result = query.executeUpdate();    
        return result;    
    }    
	

}
