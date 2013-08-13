package org.stjs.bridge.backbonejs;

import org.stjs.javascript.Map;

public class Events {
	public void on(String event, Object callback) {
	}

	public void on(String event, Object callback, Object context) {
	}

	public void on(Map<String, ? extends Object> events) {
	}

	public void off(String event, Object callback) {
	}

	public void off(String event, Object callback, Object context) {
	}

	public void off() {
	}

	public void trigger(String events, Object... arguments) {
	}

	public void once(String event, Object callback) {
	}

	public void once(String event, Object callback, Object context) {
	}

	public void listenTo(Events model, String event, Object callback) {
	}

	public void listenToOnce(Events model, String event, Object callback) {
	}

	public void stopListening(Events model, String event, Object callback) {
	}

	public void stopListening(Events model, String event) {
	}

	public void stopListening(Events model) {
	}

	public void stopListening() {
	}
}
