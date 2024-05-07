package com.s8.pkgs.ui.paper.actions;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.api.web.lambdas.primitives.UInt8Lambda;
import com.s8.pkgs.ui.paper.PaperWebSources;


/**
 * 
 */
public class ActionsItem extends S8WebObject {
	
	public static ActionsItem create(S8WebFront front, String title, String info, S8WebObject element) {
		ActionsItem item = new ActionsItem(front);
		item.setTitle(title);
		item.setDescription(info);
		item.setAction(element);
		return item;
	}
	
	
	
	/**
	 * 
	 * @param front
	 */
	public ActionsItem(S8WebFront front) {
		super(front, PaperWebSources.ROOT_WEBPATH + "/actions-block/ActionsItem");
	}
	

	/**
	 * 
	 * @param text
	 */
	public void setTitle(String text) {
		vertex.outbound().setStringUTF8Field("title", text);
	}
	
	
	/**
	 * 
	 * @param text
	 */
	public void setDescription(String text) {
		vertex.outbound().setStringUTF8Field("info", text);
	}
	
	
	/**
	 * 
	 * @param options
	 */
	public void setAction(S8WebObject element) {
		vertex.outbound().setObjectField("action", element);
	}
	
	
	/**
	 * 
	 * @param text
	 */
	public void setSelectedIndex(int index) {
		vertex.outbound().setUInt8Field("selectedIndex", index);
	}
	


	/**
	 * 
	 * @param text
	 */
	public void onSelected(UInt8Lambda lambda) {
		vertex.inbound().setUInt8MethodLambda("on-selected", lambda);
	}
	
	

}
