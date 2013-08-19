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

	protected void initialize() {

	}

	public void setElement(Element element) {
	}

	public JQueryCore<JQueryCore<?>> $(Object selector) {
		throw new UnsupportedOperationException();
	}

	public View<T> render() {
		throw new UnsupportedOperationException();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	protected void _ensureElement() {

	}

	protected void delegateEvents() {

	}

	public void delegateEvents(Map<String, Object> events) {
	}

	public void undelegateEvents() {
	}

	public static <V extends View<? extends Model>> V extend(V properties) {
		throw new UnsupportedOperationException();
	}

	public static <V extends View<? extends Model>> V extend(V properties, Map<String, Object> staticProperties) {
		throw new UnsupportedOperationException();
	}

}
