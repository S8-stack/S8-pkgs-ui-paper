package com.s8.pkgs.ui.paper;

import com.s8.build.js.JS_Enum;

/**
 * 
 * @author pierreconvert
 *
 */
public enum PaperNature implements JS_Enum {


	
	/**
	 * 
	 */
	DEFAULT(0x22, "default"),
	
	
	/**
	 * 
	 */
	PRIMARY(0x42, "primary"), 
	
	
	/**
	 * 
	 */
	OUTLINE(0x62, "outline"), 
	
	
	/**
	 * 
	 */
	WARNING(0x72, "warning"),
	
	
	/**
	 * 
	 */
	DANGER(0x84, "danger");
	
	
	
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
	private PaperNature(int code, String name) { 
		this.code = code; 
		this.name = name;
	}

	

	public @Override boolean isDefault() { return this == DEFAULT; }
	public @Override int getKey() { return code; }
	public @Override String getValue() { return name; }
	public @Override String getComment() { return "Button size : "+name; }

	
}
