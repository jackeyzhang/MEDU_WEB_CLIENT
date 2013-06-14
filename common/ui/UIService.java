/**
 * 
 */
package ui;

/**
 * 供客户端使用的服务
 * 
 * @author zhangchenhao
 *
 *
 * 2013-6-9
 * 下午3:30:58
 *
 * TODO:
 */
public interface UIService {

	public static final String UI_IMAGE_LOGO = "ui_logo";
	
	public static final String UI_IMAGE_ADVERT = "ui_advert";
	
	public static final String UI_CONTENT = "ui_content";
	
	public static final String UI_FOOTER = "ui_footer";
	
	String getElement(String elementType,String fragment);
	
	Object getElement(String... params);
}
