/**
 * 
 */
package ui.context;

import ui.handler.UiHandler;

/**
 * @author zhangchenhao
 *
 *
 * 2013-6-14
 * 下午4:15:00
 *
 * TODO:
 */
public interface UIContext {
	
	boolean initContext();
	
	boolean isInit();
	
	void clearContext();
	
	UiHandler getHandler(String op);
	
}
