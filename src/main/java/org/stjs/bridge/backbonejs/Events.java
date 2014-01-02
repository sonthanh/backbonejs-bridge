package org.stjs.bridge.backbonejs;

import org.stjs.javascript.Map;

public class Events {
	public native void on(String event, Object callback);

	public native void on(String event, Object callback, Object context);

	public native void on(Map<String, ? extends Object> events);

	public native void off(String event, Object callback);

	public native void off(String event, Object callback, Object context);

	public native void off();

	public native void trigger(String events, Object... arguments);

	public native void once(String event, Object callback);

	public native void once(String event, Object callback, Object context);

	public native void listenTo(Events model, String event, Object callback);

	public native void listenToOnce(Events model, String event, Object callback);

	public native void stopListening(Events model, String event, Object callback);

	public native void stopListening(Events model, String event);

	public native void stopListening(Events model);

	public native void stopListening();
}
