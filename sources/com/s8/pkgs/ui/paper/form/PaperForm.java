package com.s8.pkgs.ui.paper.form;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.pkgs.ui.paper.PaperWebSources;


/**
 * 
 */
public class PaperForm extends S8WebObject {
	
	
	public PaperForm(S8WebFront front) {
		super(front, PaperWebSources.ROOT_WEBPATH + "/form/PaperForm");
	}
	

	
	/**
	 * 
	 * @param options
	 */
	public void setFields(PaperFormField[] fields) {
		vertex.outbound().setObjectListField("fields", fields);
	}
	
	

	
}
