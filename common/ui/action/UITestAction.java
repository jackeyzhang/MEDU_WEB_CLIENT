/**
 * This class is just exmple. 
 */
package ui.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import ui.Action;
import ui.ActionForm;
import ui.bean.Person;
import ui.form.PersonForm;

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
	public Object execute(HttpServletRequest request,ActionForm form) throws Exception {
		PersonForm personForm = (PersonForm)form;
		List<Person> ps = new ArrayList<Person>();
		Person c1 = new Person();
		c1.setName(personForm.getName());
		c1.setAge(personForm.getAge());
		c1.setGirlfriends(personForm.getGirlfriends());
		Person c2 = new Person();
		c2.setName("英孚");
		c2.setAge(personForm.getAge());
		c2.setGirlfriends(personForm.getGirlfriends());
		Person c3 = new Person();
		c3.setName("新东方");
		c3.setAge(personForm.getAge());
		c3.setGirlfriends(personForm.getGirlfriends());
		ps.add(c1);
		ps.add(c2);
		ps.add(c3);
		return ps;
	}
}
