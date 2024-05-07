package com.s8.pkgs.ui.paper.buttons;

import com.s8.api.web.S8WebFront;
import com.s8.pkgs.ui.carbide.HTML_S8WebNode;
import com.s8.pkgs.ui.paper.PaperNature;
import com.s8.pkgs.ui.paper.PaperSize;
import com.s8.pkgs.ui.paper.PaperTheme;


/**
 * 
 * @author pierreconvert
 *
 */
public class PaperBaseButton extends HTML_S8WebNode {
	
	
	
	/**
	 * 
	 * @param branch
	 */
	public PaperBaseButton(S8WebFront branch, String typename) {
		super(branch, typename);
	}
	
	
	/**
	 * 
	 * @param text
	 */
	public void setLabel(String text) {
		vertex.outbound().setStringUTF8Field("label", text);
	}
	
	
	
	
	

	/**
	 * 
	 * @param menus
	 */
	public void setSize(PaperSize size) {
		vertex.outbound().setUInt8Field("size", size.code);
	}
	

	
	/**
	 * 
	 * @param menus
	 */
	public void setNature(PaperNature nature) {
		vertex.outbound().setUInt8Field("nature", nature.code);
	}
	
	
	/**
	 * 
	 * @param menus
	 */
	public void setTheme(PaperTheme theme) {
		vertex.outbound().setUInt8Field("theme", theme.code);
	}
	
	
	/**
	 * 
	 * @param state
	 */
	public void setEnabled(boolean state) {
		vertex.outbound().setBool8Field("isEnabled", state);
	}
	

}

