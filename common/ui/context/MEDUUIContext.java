/**
 * 
 */
package ui.context;

import java.util.ArrayList;
import java.util.List;

import ui.handler.GetContentPageHandler;
import ui.handler.UiHandler;

/**
 * @author zhangchenhao
 *
 *
 * 2013-6-14
 * 下午4:25:05
 *
 * TODO:
 */
public class MEDUUIContext implements UIContext {
	
	private List<UiHandler> handlers = new ArrayList<UiHandler>();
	
	private static boolean isInit = false;
	
	public MEDUUIContext(){
		initContext();
	}
	
	@Override
	public boolean initContext() {
		handlers.add(GetContentPageHandler.getInstance());
		isInit = true;
		return isInit;
	}

	@Override
	public boolean isInit() {
		return isInit;
	}

	@Override
	public void clearContext() {
		handlers.clear();
	}

	@Override
	public UiHandler getHandler(String op) {
		for(UiHandler handler : handlers){
			if(op.equals(handler.getName())){
				return handler;
			}
		}
		return null;
	}

}
