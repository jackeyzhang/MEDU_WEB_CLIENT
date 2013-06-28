/**
 * 
 */
package com.sickle.medu.bg.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;


/**
 * medu 后台入口类
 * 
 * @author zhangchenhao
 *
 *
 * 2013-6-21
 * 下午4:42:51
 *
 * TODO:
 */
public class BgClient implements EntryPoint
{

	@Override
	public void onModuleLoad( )
	{
		RootPanel.get( ).add( new Label("this is the world") );
	}

}
