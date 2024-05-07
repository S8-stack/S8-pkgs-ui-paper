package com.s8.pkgs.ui.paper.structures;

import java.util.List;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.pkgs.ui.paper.PaperWebSources;


/**
 * 
 */
public class PaperLargeColumn extends S8WebObject {
	
	
	public PaperLargeColumn(S8WebFront front) {
		super(front, PaperWebSources.ROOT_WEBPATH + "/structures/PaperLargeColumn");
	}
	

	
	/**
	 * 
	 * @param options
	 */
	public void setElements(S8WebObject... elements) {
		vertex.outbound().setObjectListField("elements", elements);
	}
	
	

	/**
	 * 
	 * @param options
	 */
	public void setElements(List<S8WebObject> elements) {
		vertex.outbound().setObjectListField("elements", elements);
	}
	
	

	
}
