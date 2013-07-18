/**
 * 
 */
package ui.context;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ui.Constant;

/**
 * @author weibinbin
 * 
 * 
 *         Jul 18, 2013 12:44:33 PM
 * 
 *         TODO:
 */
public class PageCache {

	private Map<String, List<?>> cacheMap = new HashMap<String, List<?>>();

	private static PageCache pageCache = new PageCache();

	public static PageCache getInstance() {
		return pageCache;
	}

	//get page content
	public List getPageContent() {
		return cacheMap.get(Constant.PAGECONTENT);
	}

}
