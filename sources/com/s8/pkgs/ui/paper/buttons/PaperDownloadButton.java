package com.s8.pkgs.ui.paper.buttons;

import java.nio.charset.StandardCharsets;

import com.s8.api.flow.delivery.S8WebResource;
import com.s8.api.flow.delivery.S8WebResourceGenerator;
import com.s8.api.web.S8WebFront;
import com.s8.pkgs.ui.paper.PaperNature;
import com.s8.pkgs.ui.paper.PaperSize;
import com.s8.pkgs.ui.paper.PaperWebSources;


/**
 * 
 * @author pierreconvert
 *
 */
public class PaperDownloadButton extends PaperBaseButton {
	
	/**
	 * 
	 * @param branch
	 * @param label
	 * @param size
	 * @param style
	 * @return
	 */
	public static PaperDownloadButton create(S8WebFront branch, String label, PaperSize size, PaperNature nature) {
		PaperDownloadButton button = new PaperDownloadButton(branch);
		
		button.setLabel(label);
		button.setSize(size);
		button.setNature(nature);
		
		return button;
	}
	
	
	/**
	 * 
	 * @param branch
	 */
	public PaperDownloadButton(S8WebFront branch) {
		super(branch, PaperWebSources.ROOT_WEBPATH + "/buttons/PaperDownloadButton");
		
		/* to be overridden */
		vertex.providers().setRawProvider("get-file", () -> {
			String text = "hello world, this is a download";
			byte[] data = text.getBytes(StandardCharsets.UTF_8);
			return new S8WebResource("text", data);
		});
	}
	
	
	
	public void setDownloadFilename(String text) {
		vertex.outbound().setStringUTF8Field("downloadFilename", text);
	}
	
	
	
	/**
	 * 
	 * @param generator
	 */
	public void onFileRequested(S8WebResourceGenerator generator) {
		vertex.providers().setRawProvider("get-file", generator);
	}
	
}

