/**
 * 
 */
package ui.handler;


/**
 * @author zhangchenhao
 *
 *
 * 2013-6-14
 * 下午4:16:44
 *
 * TODO:
 */
public abstract class AbstractHandler implements UiHandler {

	@Override
	public UiHandler nextHandler() {
		return null;
	}

}
