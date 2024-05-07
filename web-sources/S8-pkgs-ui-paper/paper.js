

/**
 * 
 */
export class PaperUtilities {

	/** Paper sizes */
	static getSizeByCode = function (code) {
		switch (code) {
			case 0x2: return "inlined"; /* Button size : inlined */
			case 0x4: return "small"; /* Button size : small */
			default:
			case 0x6: return "normal"; /* Button size : normal */
			case 0x8: return "large"; /* Button size : large */
		}
	};

	/** Paper nature */
	static getNatureByCode = function (code) {
		switch (code) {
			default:
			case 0x22: return "default"; /* Button size : default */
			case 0x42: return "primary"; /* Button size : primary */
			case 0x62: return "outline"; /* Button size : outline */
			case 0x72: return "warning"; /* Button size : warning */
			case 0x84: return "danger"; /* Button size : danger */
		}
	};

	/** Paper themes */
	static getThemeByCode = function (code) {
		switch (code) {
			default:
			case 0x32: return "light"; /* Button size : light */
			case 0x36: return "dark"; /* Button size : dark */
		}
	};

}

