package org.stjs.bridge.backbonejs;

import org.stjs.bridge.backbonejs.options.RouterOptions;
import org.stjs.javascript.Map;
import org.stjs.javascript.RegExp;

class Router {
	public Map<String, Object> routes;

	public Router() {
		// TODO Auto-generated constructor stub
	}

	public Router(RouterOptions options) {
		// TODO Auto-generated constructor stub
	}

	public native void route(String route, String name);

	public native void route(String route, String name, Object callback);

	public native void route(RegExp route, String name);

	public native void route(RegExp route, String name, Object callback);

	public native void navigate(String fragment);

	public native void navigate(String fragment, RouterOptions options);

}
