/**
 * 
 */
package ui.bean;

import java.io.Serializable;

/**
 * @author zhangchenhao
 *
 *
 * 2013-6-14
 * 下午3:44:00
 *
 * TODO:
 */
public class Page implements Serializable{
	
	private static final long serialVersionUID = -4085426329295939212L;

	String name;
	
	String content;
	

	/**
	 * @param name
	 * @param content
	 */
	public Page(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}

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
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
}
