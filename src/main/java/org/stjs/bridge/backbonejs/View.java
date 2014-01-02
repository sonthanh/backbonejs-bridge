package org.stjs.bridge.backbonejs;

import org.stjs.bridge.backbonejs.options.ViewOptions;
import org.stjs.javascript.Map;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.jquery.JQueryCore;

abstract class View<T extends Model> extends Events {
	public Element el;
	public JQueryCore<JQueryCore<?>> $el;
	public Map<String, ? extends Object> attributes;
	public Map<String, ? extends Object> events;
	public String tagName;
	public String id;
	public T model;
	public Collection<T> collection;

	public View() {

	}

	public View(ViewOptions<T> options) {

	}

	protected native void initialize();

	public native void setElement(Element element);

	public native JQueryCore<JQueryCore<?>> $(Object selector);

	public native View<T> render();

	public native void remove();

	protected native void _ensureElement();

	public native void delegateEvents(Map<String, Object> events);

	public native void undelegateEvents();

	public native static <V extends View<? extends Model>> V extend(V properties);

	public native static <V extends View<? extends Model>> V extend(V properties, Map<String, Object> staticProperties);

}
