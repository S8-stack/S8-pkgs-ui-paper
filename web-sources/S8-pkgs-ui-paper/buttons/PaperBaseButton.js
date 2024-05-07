
import { PaperUtilities } from '/S8-pkgs-ui-paper/paper.js';
import { NeObject } from '/S8-core-bohr-neon/NeObject.js';


import { S8WebFront } from '/S8-pkgs-ui-carbide/S8WebFront.js';

S8WebFront.CSS_import("/S8-pkgs-ui-paper/buttons/Button.css")





/**
 * Flow base feature
 */
export class PaperBaseButton extends NeObject {

	constructor() {
		super();

		// root node
		this.node = document.createElement("button");
		this.node.innerHTML = "button";

		this.node.classList.add("paper-button");

		/* <size> */
		this.node.setAttribute("size", "normal");
		/* </size> */

		/* <nature> */
		this.node.setAttribute("nature", "default");
		/* </nature> */

		/* <theme> */
		this.node.setAttribute("theme", "light");
		/* </theme> */

		this.isEnabled = true;


		/* <listeners> */

		// input		
		let _this = this;
		this.node.addEventListener("click", this.clickListener = function (event) {
			_this.onClick();
			event.stopPropagation();
		}, false);
		/* </listeners> */
	}


    onClick(){
        this.S8_vertex.runVoid("on-click");
    }


	S8_set_label(text) {
		this.node.innerHTML = text;
	}


	/**
	 * 
	 * @param {number} code 
	 */
	S8_set_size(code) {
		this.node.setAttribute("size", PaperUtilities.getSizeByCode(code));
	}

	/**
	 * 
	 * @param {number} code
	 */
	S8_set_nature(code) {
		this.node.setAttribute("nature", PaperUtilities.getNatureByCode(code));
	}

	/**
	 *  
	 * @param {number} code 
	 */
	S8_set_theme(code) {
		this.node.setAttribute("theme", PaperUtilities.getThemeByCode(code));
	}


S8_set_iconByCode(code){
	if(!this.iconNode){
		this.iconNode = document.createElement("span");
		this.node.innerHTML = "button";
	}

	S8WebFront.SVG_insertByCode()
}

	/**
	 * 
	 * @param {state} state 
	 */
	S8_set_isEnabled(state) {
		if (state) {
			this.enable();
		}
		else {
			this.disable();
		}
	}



	S8_set_downloadFilename(value) {
		this.downloadFilename = value;
	}



	getEnvelope() {
		return this.node;
	}

	enable() {
		if (!this.isEnabled) {
			this.node.removeAttribute("disabled");
			this.isEnabled = true;
		}
	}

	disable() {
		if (this.isEnabled) {
			this.node.setAttribute("disabled", "");
			this.isEnabled = false;
		}
	}


	S8_render() {
		/* nothing to post-process */
	}


	S8_dispose() {
		this.node.removeEventListener("click", this.clickListener);
	}
}
