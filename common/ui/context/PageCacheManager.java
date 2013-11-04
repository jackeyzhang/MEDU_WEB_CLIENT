/**
 * 
 */
package ui.context;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;

import ui.Constant;
import ui.bean.TeacheInfoBean;

import com.sickle.dao.DaoServiceFactory;
import com.sickle.exception.CodeException;
import com.sickle.pojo.edu.Member;
import com.sickle.service.itf.IMemberService;

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

	private static IMemberService teacheService = null;

	static {
		try {
			teacheService = DaoServiceFactory.getService(IMemberService.class);
		} catch (CodeException e) {
			e.printStackTrace();
		}
	}

	public static PageCacheManager getInstance() {
		return manger;
	}

	/**
	 * init cacheMap
	 * 
	 * @throws Exception
	 */
	void initPageCache(ServletContext context) throws Exception {
		List<Member> ts = new ArrayList<Member>();//teacheService.getPopularTeacher();
		// 保持到cache中
		context.setAttribute(Constant.TEACHERCACHE, this.getTeacherInfo(ts));
	}

	private List<TeacheInfoBean> getTeacherInfo(List<Member> ts) {
		List<TeacheInfoBean> infos = new ArrayList<TeacheInfoBean>();
		if (ts == null) {
			return infos;
		}
		for (Member tea : ts) {
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
