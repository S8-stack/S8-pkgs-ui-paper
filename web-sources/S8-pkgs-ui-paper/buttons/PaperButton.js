

import { PaperBaseButton } from './PaperBaseButton.js';

/**
 * Flow base feature
 */
export class PaperButton extends PaperBaseButton {

	constructor() {
		super();
	}


	onClick(){
		this.S8_vertex.runVoid("on-click");
	}

}
