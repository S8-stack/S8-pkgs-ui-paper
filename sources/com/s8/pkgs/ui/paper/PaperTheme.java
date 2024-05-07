package com.s8.pkgs.ui.paper;

import com.s8.build.js.JS_Enum;

/**
 * 
 * @author pierreconvert
 *
 */
public enum PaperTheme implements JS_Enum {


	

	/**
	 * Default style for light theme
	 */
	LIGHT(0x32, "light"),
	
	
	/**
	 * Default style for light theme
	 */
	DARK(0x36, "dark");
	
	
	/**
	 * code
	 */
	public final int code;
	
	
	/**
	 * name
	 */
	public final String name;
	
	
	/**
	 * 
	 * @param code
	 */
	private PaperTheme(int code, String name) { 
		this.code = code; 
		this.name = name;
	}

	

	public @Override boolean isDefault() { return this == LIGHT; }
	public @Override int getKey() { return code; }
	public @Override String getValue() { return name; }
	public @Override String getComment() { return "Button size : "+name; }

	
}
