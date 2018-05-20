package cm.ymsys.service;

import java.beans.IntrospectionException;
import java.sql.SQLException;

import com.wandoufilm.dao.imp.BaseDaoImpl;

public class BaseService {
	private static BaseService instance = new BaseService();

	public static BaseService getInstance() {
		return instance;
	}

	private BaseDaoImpl dao = new BaseDaoImpl();

	public void add(Object object) throws SQLException, IntrospectionException {
		dao.save(object);
	}

	public Object findById(Object object, int id) throws SQLException {
		return dao.findById(object, id);
	}

}
