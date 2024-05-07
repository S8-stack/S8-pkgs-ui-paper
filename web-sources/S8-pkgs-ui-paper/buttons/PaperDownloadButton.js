

import { PaperBaseButton } from './PaperBaseButton.js';

/**
 * Flow base feature
 */
export class PaperDownloadButton extends PaperBaseButton {

	/**
	 * @type {string}
	 */
	downloadFilename = "download.txt";

	constructor() {
		super();
	}

	onClick(){
		this.S8_vertex.downloadRaw("get-file", this.downloadFilename);
	}

	S8_set_downloadFilename(value) {
		this.downloadFilename = value;
	}

}
