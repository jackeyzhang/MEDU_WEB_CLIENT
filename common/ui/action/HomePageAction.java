/**
 * 
 */
package ui.action;

import javax.servlet.http.HttpServletRequest;

import ui.Action;
import ui.ActionForm;
import ui.context.PageCacheManager;

/**
 * @author zhangchenhao
 *
 *
 * Jul 30, 2013
 * 11:05:34 AM
 *
 * TODO:
 */
public class HomePageAction extends Action {

	/* (non-Javadoc)
	 * @see ui.Action#execute(javax.servlet.http.HttpServletRequest, ui.ActionForm)
	 */
	@Override
	public Object execute(HttpServletRequest request, ActionForm form)
			throws Exception {
		return PageCacheManager.getInstance().getCacheMap();
	}

}
