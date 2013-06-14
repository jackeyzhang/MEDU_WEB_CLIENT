/**
 * 
 */
package ui;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangchenhao
 *
 *
 * 2013-6-13
 * 下午5:27:55
 *
 * TODO:
 */
public class MeduMainPageUIService implements UIService {
	
	private Map<String,Object> pages = new HashMap<String,Object>();
	
	private static UIService instance = null;
	
	public synchronized static UIService getInstance(){
		if(instance == null){
			instance = new MeduMainPageUIService();
		}
		return instance;
	}
	
	private MeduMainPageUIService(){
	}


	@Override
	public String getElement(String elementType, String fragment) {
		return null;
	}

	@Override
	public Object getElement(String... params) {
		if( pages.get(params) == null)
		{
			return pages.put(params[0], params[0] + "");
		}
		return pages.get(params);
	}


}
