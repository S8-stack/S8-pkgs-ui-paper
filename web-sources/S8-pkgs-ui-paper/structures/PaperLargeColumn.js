import { S8 } from "/S8-api/S8Context.js";
import { S8Object } from "/S8-api/S8Object.js";


import { S8WebFront } from "/S8-pkgs-ui-carbide/S8WebFront.js";


S8.page.CSS_import("/S8-pkgs-ui-paper/structures/PaperLargeColumn.css");


/**
 * 
 */
export class PaperLargeColumn extends S8Object {

    /**
     * @type{HTMLDivElement}
     */
    wrapperNode;

    constructor() {
        super();
        this.wrapperNode = document.createElement("div");
        this.wrapperNode.classList.add("paper-structs-large-column");
    }


    getEnvelope(){ return this.wrapperNode; }

    /**
     * 
     * @param {Object[]} elements 
     */
    S8_set_elements(elements) {
        S8WebFront.setS8Elements(this.wrapperNode, elements);
    }



    S8_render(){ /* nothing to do */ }
    S8_dispose(){ /* nothing to do */ }
}