/**
 * 
 */
package ui.form;

import ui.ActionForm;

/**
 * @author weibinbin
 *
 *
 * Jul 18, 2013
 * 3:28:23 PM
 *
 * TODO:
 */
public class PersonForm extends ActionForm{

	private String name;
	private String age;
	private String[] girlfriends;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	
	/**
	 * @return the girlfriends
	 */
	public String[] getGirlfriends() {
		return girlfriends;
	}
	/**
	 * @param girlfriends the girlfriends to set
	 */
	public void setGirlfriends(String[] girlfriends) {
		this.girlfriends = girlfriends;
	}
	/* (non-Javadoc)
	 * @see ui.ActionForm#vilateForm()
	 */
	@Override
	public void vilateForm() {
		if(this.name==null||this.age==null){
			throw new RuntimeException("name or age is null");
		}
	}
	
}
