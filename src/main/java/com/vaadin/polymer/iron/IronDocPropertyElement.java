/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-doc-viewer project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Renders documentation describing a specific property of an element.</p>
 * <p>Give it a hydrolysis <code>PropertyDescriptor</code> (via <code>descriptor</code>), and watch it go!</p>
 */
@JsType(isNative=true)
public interface IronDocPropertyElement extends HTMLElement {

    @JsOverlay public static final String TAG = "iron-doc-property";
    @JsOverlay public static final String SRC = "iron-doc-viewer/iron-doc-viewer.html";


    /**
     * <p>Whether the property should show a one-liner, or full summary.</p>
     * <p>Note that this property <em>is</em> reflected as an attribute, but we perform<br>the reflection manually. In order to support the CSS transitions, we<br>must calculate the element height before setting the attribute.</p>
     *
     * JavaScript Info:
     * @property collapsed
     * @type Boolean
     * 
     */
    @JsProperty boolean getCollapsed();
    /**
     * <p>Whether the property should show a one-liner, or full summary.</p>
     * <p>Note that this property <em>is</em> reflected as an attribute, but we perform<br>the reflection manually. In order to support the CSS transitions, we<br>must calculate the element height before setting the attribute.</p>
     *
     * JavaScript Info:
     * @property collapsed
     * @type Boolean
     * 
     */
    @JsProperty void setCollapsed(boolean value);

    /**
     * <p>The <a href="https://github.com/PolymerLabs/hydrolysis">Hydrolysis</a>-generated<br>element descriptor to display details for.</p>
     * <p>Alternatively, the element descriptor can be provided as JSON via the text content<br>of this element.</p>
     *
     * JavaScript Info:
     * @property descriptor
     * @type hydrolysis.PropertyDescriptor
     * 
     */
    @JsProperty JavaScriptObject getDescriptor();
    /**
     * <p>The <a href="https://github.com/PolymerLabs/hydrolysis">Hydrolysis</a>-generated<br>element descriptor to display details for.</p>
     * <p>Alternatively, the element descriptor can be provided as JSON via the text content<br>of this element.</p>
     *
     * JavaScript Info:
     * @property descriptor
     * @type hydrolysis.PropertyDescriptor
     * 
     */
    @JsProperty void setDescriptor(JavaScriptObject value);

    /**
     * <p>Unique anchor ID for deep-linking.</p>
     *
     * JavaScript Info:
     * @property anchorId
     * @type String
     * 
     */
    @JsProperty String getAnchorId();
    /**
     * <p>Unique anchor ID for deep-linking.</p>
     *
     * JavaScript Info:
     * @property anchorId
     * @type String
     * 
     */
    @JsProperty void setAnchorId(String value);


}