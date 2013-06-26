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

import ui.context.MEDUUIContext;

import com.alibaba.fastjson.JSON;

/**
 * @author weibinbin
 *
 *
 * Jun 9, 2013
 * 3:44:50 PM
 *
 * TODO:
 */

public class MeduInitServlet extends HttpServlet {
	
	private static final long serialVersionUID = 3426799892232553531L;
	 
	MEDUUIContext context = null;

	@Override
	public void init() throws ServletException {
		super.init();
		context = new MEDUUIContext();
	}

	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        doPost(req,resp);
    }



    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();
        String op = req.getParameter(OpConst.OP);
    	out.print(JSON.toJSONString(context.getHandler(op).getElements()));
        out.close();
    }
    
    
}
