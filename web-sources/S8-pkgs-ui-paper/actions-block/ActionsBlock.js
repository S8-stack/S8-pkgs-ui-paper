


import { S8WebFront } from '/S8-pkgs-ui-carbide/S8WebFront.js';

import { ActionsItem } from './ActionsItem.js';
import { S8Object } from '/S8-api/S8Object.js';



/**
 * 
 */
S8WebFront.CSS_import('/S8-pkgs-ui-paper/actions-block/ActionsBlock.css');

export class ActionsBlock extends S8Object {


    constructor(){
        super();
        this.wrapperNode = document.createElement("div");
        this.wrapperNode.classList.add("actions-block");
    }


    S8_render(){ /* continuous rendering approach... */ }

    getEnvelope(){
        return this.wrapperNode;
    }
    

    /**
     * 
     * @param {ActionsItem[]} items 
     */
    S8_set_items(items){

        /* clear wrapper node content */
       while(this.wrapperNode.hasChildNodes()){ this.wrapperNode.removeChild(this.wrapperNode.lastChild); }
       
       /* append cards */
       items.forEach(item => this.wrapperNode.appendChild(item.getEnvelope()));
    }

    S8_dispose(){ /* continuous rendering approach... */ }
}