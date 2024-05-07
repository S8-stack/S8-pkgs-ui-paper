package com.s8.pkgs.ui.paper.buttons;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.functions.none.VoidNeFunction;
import com.s8.api.web.lambdas.none.VoidLambda;
import com.s8.pkgs.ui.paper.PaperNature;
import com.s8.pkgs.ui.paper.PaperSize;
import com.s8.pkgs.ui.paper.PaperWebSources;


/**
 * 
 * @author pierreconvert
 *
 */
public class PaperButton extends PaperBaseButton {
	
	/**
	 * 
	 * @param branch
	 * @param label
	 * @param size
	 * @param style
	 * @return
	 */
	public static PaperButton create(S8WebFront branch, String label, PaperSize size, PaperNature nature) {
		PaperButton button = new PaperButton(branch);
		
		button.setLabel(label);
		button.setSize(size);
		button.setNature(nature);
		
		return button;
	}
	
	
	/**
	 * 
	 * @param branch
	 */
	public PaperButton(S8WebFront branch) {
		super(branch, PaperWebSources.ROOT_WEBPATH + "/buttons/PaperButton");
		
		/* to be overridden */
		vertex.inbound().setVoidMethodLambda("on-click", () -> {
			System.out.println("I've been clicked");
		});
	}
	
	
	
	public void onClick(VoidLambda lambda) {
		vertex.inbound().setVoidMethodLambda("on-click", lambda);
	}
	
	
	public void onClick(VoidNeFunction function) {
		vertex.inbound().setVoidMethod("on-click", function);
	}
	
}

