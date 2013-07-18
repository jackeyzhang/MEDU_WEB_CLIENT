/**
 * 
 */
package ui;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;

import com.sickle.dao.support.SessionManager;

/**
 * @author weibinbin
 * 
 * 
 *         Jul 17, 2013 5:16:34 PM
 * 
 *         TODO:
 */
public abstract class Action {

	public Object perform(HttpServletRequest request) {
		//Session session = SessionManager.getInstance().getSession();
		Object obj = null;
		try {
			//session.beginTransaction();
			validate(request);
			obj = execute(request);
			//session.getTransaction().commit();
		} catch (Exception e) {
			request.setAttribute(Constant.REQUEST_ERROR, e.getMessage());
			//session.getTransaction().rollback();
		} finally {
			//session.close();
		}
		return obj;
	}

	public abstract Object execute(HttpServletRequest request) throws Exception;

	public abstract void validate(HttpServletRequest request) throws Exception;

}
