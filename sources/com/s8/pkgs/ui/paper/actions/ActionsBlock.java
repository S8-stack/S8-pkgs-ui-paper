package com.s8.pkgs.ui.paper.actions;

import java.util.List;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.pkgs.ui.paper.PaperWebSources;

public class ActionsBlock extends S8WebObject {
	
	
	
	public ActionsBlock(S8WebFront front) {
		super(front, PaperWebSources.ROOT_WEBPATH + "/actions-block/ActionsBlock");
	}
	

	
	/**
	 * 
	 * @param options
	 */
	public void setItems(ActionsItem... items) {
		vertex.outbound().setObjectListField("items", items);
	}
	
	
	/**
	 * 
	 * @param options
	 */
	public void setItems(List<ActionsItem> items) {
		vertex.outbound().setObjectListField("items", items);
	}
	
	
}
