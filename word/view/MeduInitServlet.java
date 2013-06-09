/**
 * 
 */
package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        
        PrintWriter out = resp.getWriter();
        out.print("Hello world");
        out.close();
    }
    
    
}
