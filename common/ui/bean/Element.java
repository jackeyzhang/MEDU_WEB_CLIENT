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
public class Element implements Serializable{
	
	private static final long serialVersionUID = -4085426329295939212L;

	String id;
	
	String content;
	
	ElementType type = ElementType.Html;
	
	/**
	 * @param name
	 * @param content
	 */
	public Element(String id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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

	/**
	 * @return the type
	 */
	public ElementType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(ElementType type) {
		this.type = type;
	}
	
}
