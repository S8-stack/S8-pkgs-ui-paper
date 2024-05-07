package com.s8.pkgs.ui.paper.devops;

import com.s8.build.js.JS_CodeGenerator;
import com.s8.pkgs.ui.paper.PaperNature;
import com.s8.pkgs.ui.paper.PaperSize;
import com.s8.pkgs.ui.paper.PaperTheme;

public class GenerateEnumFuncs {

	public static void main(String[] args) {

		JS_CodeGenerator codeGen = new JS_CodeGenerator();
		codeGen.appendEnumByCodeFunc("Paper sizes", "getSizeByCode", PaperSize.values());
		codeGen.skipLine();
		codeGen.appendEnumByCodeFunc("Paper nature", "getNatureByCode", PaperNature.values());
		codeGen.skipLine();
		codeGen.appendEnumByCodeFunc("Paper themes", "getThemeByCode", PaperTheme.values());
		System.out.println(codeGen.getCode());
	}
	
}
