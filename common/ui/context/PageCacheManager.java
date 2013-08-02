/**
 * 
 */
package ui.context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ui.Constant;
import ui.bean.TeacheInfoBean;

import com.sickle.dao.DaoServiceFactory;
import com.sickle.exception.CodeException;
import com.sickle.pojo.edu.Teacher;
import com.sickle.service.itf.ITeacherService;

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

	private static ITeacherService teacheService = null;

	static {
		try {
			teacheService = DaoServiceFactory.getService(ITeacherService.class);
		} catch (CodeException e) {
			e.printStackTrace();
		}
	}

	public static PageCacheManager getInstance() {
		return manger;
	}

	public Map<String, List<?>> getCacheMap() {
		Map<String, List<?>> cloneMap = new HashMap<String, List<?>>();
		cloneMap.putAll(cacheMap);
		return cloneMap;
	}

	// update pagecontent
	protected void updatePageContent(String key, List value) {
		cacheMap.remove(key);
		cacheMap.put(key, value);
	}

	public List getCacheValue(String key) {
		return cacheMap.get(key);
	}

	/**
	 * init cacheMap
	 * 
	 * @throws Exception
	 */
	void initPageCache() throws Exception {
		List<Teacher> ts = teacheService.getPopularTeacher();
		// 保持到cache中
		cacheMap.put(Constant.TEACHERCACHE, this.getTeacherInfo(ts));
	}

	private List<TeacheInfoBean> getTeacherInfo(List<Teacher> ts) {
		List<TeacheInfoBean> infos = new ArrayList<TeacheInfoBean>();
		if (ts == null) {
			return infos;
		}
		for (Teacher tea : ts) {
			TeacheInfoBean bean = new TeacheInfoBean();
			bean.setId(tea.getId());
			bean.setName(bean.getName());
			bean.setSex(tea.getSex());
			bean.setHobby(bean.getHobby());
			bean.setContact(tea.getContact());
			infos.add(bean);
		}
		return infos;

	}

}
