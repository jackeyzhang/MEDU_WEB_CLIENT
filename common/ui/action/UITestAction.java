/**
 * This class is just exmple. 
 */
package ui.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.sickle.pojo.edu.Classes;

import ui.Action;
import ui.bean.Person;

/**
 * @author weibinbin
 *
 *
 * Jul 18, 2013
 * 10:55:21 AM
 *
 * TODO:
 */
public class UITestAction extends Action {

	/* (non-Javadoc)
	 * @see ui.Action#execute(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public Object execute(HttpServletRequest request) throws Exception {
		List<Person> ps = new ArrayList<Person>();
		Person c1 = new Person();
		c1.setName("华尔街");
		Person c2 = new Person();
		c2.setName("英孚");
		Person c3 = new Person();
		c3.setName("新东方");
		ps.add(c1);
		ps.add(c2);
		ps.add(c3);
		return ps;
	}

	/* (non-Javadoc)
	 * @see ui.Action#validate(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public void validate(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub

	}

}
