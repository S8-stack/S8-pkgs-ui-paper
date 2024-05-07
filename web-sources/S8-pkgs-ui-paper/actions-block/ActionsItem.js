

import { S8Object } from "/S8-api/S8Object.js";




export class ActionsItem extends S8Object {

    constructor(){
        super();

        this.wrapperNode = document.createElement("div");
        this.wrapperNode.classList.add("actions-item");

        this.headNode = document.createElement("div");
        this.headNode.classList.add("actions-item-head");
      
        this.titleNode = document.createElement("h1");
        this.headNode.appendChild(this.titleNode);

        this.infoNode = document.createElement("p");
        this.headNode.appendChild(this.infoNode);

        this.wrapperNode.appendChild(this.headNode);

        this.bodyNode = document.createElement("div");
        this.bodyNode.classList.add("actions-item-body");
        this.wrapperNode.appendChild(this.bodyNode);

    }

    getEnvelope(){
        return this.wrapperNode;
    }


    /**
     * 
     * @param {string} cards 
     */
    S8_set_title(name) {
        this.titleNode.innerHTML = name;
    }

    /**
    * 
    * @param {string} cards 
    */
    S8_set_info(name) {
        this.infoNode.innerHTML = name;
    }


    /**
     * 
     * @param {*} element 
     */
    S8_set_action(action) {
        this.bodyNode.appendChild(action.getEnvelope());
    }

    
    /**
     * 
     * @param {string} cards
     */
    S8_set_isSelected(isSelected) {
        if (isSelected) {
            this.containerNode.setAttribute("selected", '');
        }
        else {
            this.containerNode.removeAttribute("selected");
        }
    }

    S8_render() { /* continuous rendering approach... */ }

    S8_dispose() { /* continuous rendering approach... */ }
    
}