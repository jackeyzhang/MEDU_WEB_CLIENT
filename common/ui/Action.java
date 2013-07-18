/**
 * 
 */
package ui;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;

import com.sickle.dao.SessionManager;

/**
 * @author weibinbin
 * 
 * 
 *         Jul 17, 2013 5:16:34 PM
 * 
 *         TODO:
 */
public abstract class Action {

	public void perform(HttpServletRequest request) {
		Session session = SessionManager.getInstance().getSession();
		try {
			session.beginTransaction();
			validate(request);
			execute(request);
			session.getTransaction().commit();
		} catch (Exception e) {
			request.setAttribute(Constant.REQUEST_ERROR, e.getMessage());
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
	}

	public abstract void execute(HttpServletRequest request) throws Exception;

	public abstract void validate(HttpServletRequest request) throws Exception;

}
