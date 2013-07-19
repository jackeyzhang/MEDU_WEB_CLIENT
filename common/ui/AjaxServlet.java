/**
 * 
 */
package ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.alibaba.fastjson.JSON;

/**
 * @author weibinbin
 * 
 * 
 *         Jun 9, 2013 3:44:50 PM
 * 
 *         TODO:
 */

public class AjaxServlet extends HttpServlet {

	private static final long serialVersionUID = 3426799892232553531L;

	@Override
	protected void doPost(final HttpServletRequest req,
			final HttpServletResponse resp) throws ServletException,
			IOException {
		resp.setContentType("application/json");
		resp.setCharacterEncoding("utf-8");

		String classFullName = req.getParameter(Constant.ActionKey);
		String formClassName = req.getParameter(Constant.ActionForm);
		Action action = null;
		ActionForm form = null;
		try {
			Class actionClass = Class.forName(classFullName);
			action = (Action) actionClass.newInstance();

			if (formClassName != null && !"".equals(formClassName)) {
				Class formClass = Class.forName(formClassName);
				form = (ActionForm) formClass.newInstance();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// fill in parameter to form
		if (form != null) {
			FormFill.initForm(req, form);
		}
		// execute action
		Object obj = action.perform(req, form);

		if (obj != null) {
			PrintWriter out = resp.getWriter();
			out.println(JSON.toJSONString(obj));
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
}
