package org.stjs.bridge.backbonejs;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge(sources = { "backbone.js", "backbone.localStorage.js" })
class LocalStorage {
	public LocalStorage(String name) {
	}
}
