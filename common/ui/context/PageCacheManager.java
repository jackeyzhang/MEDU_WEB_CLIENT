/**
 * 
 */
package ui.context;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ui.Constant;

import com.sickle.dao.SchoolDaoService;
import com.sickle.pojo.edu.School;
import com.sickle.service.itf.ISchoolService;

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

	private ISchoolService schoolService = SchoolDaoService.getInstance();

	public static PageCacheManager getInstance(){
		return manger;
	}
	
	/**
	 * init cacheMap
	 */
	public void initPageCache() {
		List<School> sch = schoolService.getAllSchool();
		if (sch != null && sch.size() != 0) {
			cacheMap.put(Constant.PAGECONTENT, sch);
		}
	}

	// get page content
	public synchronized List<School> getPageContent() {
		return (List<School>) cacheMap.get(Constant.PAGECONTENT);
	}

	// update pagecontent
	public synchronized void updatePageContent() {
		//重新加载一遍
		
	}
}
