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

import ui.handler.GetContentPageHandler;

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

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();
        String op = req.getParameter(OpConst.OP);
        if(op.equals(GetContentPageHandler.getInstance().getName()) ){
        	out.print(JSON.toJSONString(GetContentPageHandler.getInstance().getElements()));
        }
        out.close();
    }
    
    
}
