package org.stjs.bridge.backbonejs;

import org.stjs.javascript.Map;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.jquery.JQueryCore;

class View<T extends Model> extends Events {
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

	public void setElement(Element element) {
	}

	// public JQueryCore<JQueryCore<?>> $(Object selector) {
	// throw new UnsupportedOperationException();
	// }

	public View render() {
		throw new UnsupportedOperationException();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public void delegateEvents() {
	}

	public void delegateEvents(Map<String, Object> events) {
	}

	public void undelegateEvents() {
	}

	public static <V extends View> V extend(V properties) {
		throw new UnsupportedOperationException();
	}

	public static <V extends View> V extend(V properties, Map<String, Object> staticProperties) {
		throw new UnsupportedOperationException();
	}

}
