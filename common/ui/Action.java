/**
 * 
 */
package ui;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;


/**
 * @author weibinbin
 * 
 * 
 *         Jul 17, 2013 5:16:34 PM
 * 
 *         TODO:
 */
public abstract class Action {

	public Object perform(HttpServletRequest request, ActionForm form) {
		// Session session = SessionManager.getInstance().getSession();
		Object obj = null;
		try {
			// session.beginTransaction();
			if(form!=null){
				form.vilateForm(request);
			}
			obj = execute(request, form);
			// session.getTransaction().commit();
		} catch (Throwable e) {
			e.printStackTrace();
			request.setAttribute(Constant.REQUEST_ERROR, e.getMessage());
			// session.getTransaction().rollback();
		} finally {
			// session.close();
		}
		return obj;
	}

	public abstract Object execute(HttpServletRequest request, ActionForm form)
			throws Exception;

}
