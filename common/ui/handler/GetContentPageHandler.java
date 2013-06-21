/**
 * 
 */
package ui.handler;

import java.util.HashMap;
import java.util.Map;

import ui.OpConst;
import ui.bean.Element;
import ui.service.MeduMainPageUIService;
import ui.service.UIService;

/**
 * @author zhangchenhao
 *
 *
 * 2013-5-14
 * 下午3:20:50
 *
 * TODO:
 */
public class GetContentPageHandler extends  AbstractHandler {
	
	UIService uiService = MeduMainPageUIService.getInstance();
	
	private static UiHandler instance = null;
	
	private Map<String,Element> contents = new HashMap<String,Element>();
	
	
	private GetContentPageHandler(){
		contents.put("tab1", new Element("内容介绍","超强的汉字学习网站，欢迎您的使用"));
		contents.put("tab2", new Element("课程设置","4到19岁全方位学习，每周课时90分钟"));
		contents.put("tab3", new Element("报名咨询","填写你的个人信息"));
		contents.put("tab4", new Element("联系我们","电话:74110<br>公司地址:浦东南路1256号"));
	}

	@Override
	public Map<String, Element> getElements() {
		return contents;
	}


	public static UiHandler getInstance() {
		if(instance == null){
			instance = new GetContentPageHandler();
		}
		return instance;
	}

	@Override
	public String getName() {
		return OpConst.OP_GETCONTETNPAGE;
	}
}
