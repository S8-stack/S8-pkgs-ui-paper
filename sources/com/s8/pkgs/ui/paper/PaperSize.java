package com.s8.pkgs.ui.paper;

import com.s8.build.js.JS_Enum;

/**
 * 
 * @author pierreconvert
 *
 */
public enum PaperSize implements JS_Enum {


	INLINED(0x02, "inlined"), 
	
	
	SMALL(0x04, "small"), 
	
	
	NORMAL(0x06, "normal"), 
	
	
	LARGE(0x08, "large");
	
	
	/**
	 * 
	 */
	public final int code;
	
	
	/**
	 * 
	 */
	public final String name;
	
	
	
	
	private PaperSize(int code, String name) { 
		this.code = code; 
		this.name = name;
	}



	public @Override boolean isDefault() { return this == NORMAL; }
	public @Override int getKey() { return code; }
	public @Override String getValue() { return name; }
	public @Override String getComment() { return "Button size : "+name; }


}
