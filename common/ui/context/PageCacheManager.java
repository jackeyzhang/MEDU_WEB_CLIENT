/**
 * 
 */
package ui.context;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ui.Constant;

import com.sickle.dao.DaoServiceFactory;
import com.sickle.exception.CodeException;
import com.sickle.pojo.edu.School;
import com.sickle.pojo.website.WebUi;
import com.sickle.service.itf.IWebUiService;

/**
 * @author weibinbin
 * 
 * 
 *         Jul 18, 2013 1:01:12 PM
 * 
 *         TODO:
 */
public class PageCacheManager {

	public static PageCacheManager manger = new PageCacheManager();
	
	private Map<String, List<?>> cacheMap = new HashMap<String, List<?>>();

	private static IWebUiService uiDaoService = null;

	public static PageCacheManager getInstance(){
		 try
		{
			 uiDaoService = DaoServiceFactory.getService( IWebUiService.class );
		}
		catch ( CodeException e )
		{
			e.printStackTrace();
		}
		return manger;
	}
	
	/**
	 * init cacheMap
	 */
	public void initPageCache() {
		
	}

	// get page content
	public synchronized WebUi getPageContent() {
		return null;
	}

	// update pagecontent
	public synchronized void updatePageContent() {
		//重新加载一遍
		
	}
}
