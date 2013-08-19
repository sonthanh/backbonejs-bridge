package org.stjs.bridge.backbonejs;

import org.stjs.bridge.backbonejs.options.CollectionOptions;
import org.stjs.bridge.backbonejs.options.ModelOptions;
import org.stjs.bridge.backbonejs.options.SyncOptions;
import org.stjs.bridge.backbonejs.options.ViewOptions;
import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.functions.Callback1;

public class Backbone {
	public static Callback1<Object> ajax;
	public static boolean emulateHTTP;
	public static boolean emulateJSON;

	// public static JQueryCore<JQueryCore<?>> $;

	public static class Collection<T extends Model> extends org.stjs.bridge.backbonejs.Collection<T> {
		public Collection() {
			super();
		}

		public Collection(Array<T> models) {
			super(models);
		}

		public Collection(Array<T> models, CollectionOptions options) {
			super(models, options);
		}
	}

	public static class Model extends org.stjs.bridge.backbonejs.Model {
		public Model(Map<String, ? extends Object> attributes, ModelOptions options) {
			super(attributes, options);
		}
	}

	abstract public static class View<T extends Model> extends org.stjs.bridge.backbonejs.View<T> {

		public View() {
			super();
		}

		public View(ViewOptions<T> options) {
			super(options);
		}
	}

	public static class Router extends org.stjs.bridge.backbonejs.Router {
	}

	public static class LocalStorage extends org.stjs.bridge.backbonejs.LocalStorage {
		public LocalStorage(String name) {
			super(name);
		}
	}

	public static <T> void sync(String method, Array<T> model, SyncOptions options) {
	}

	public static <T> void sync(String method, Array<T> model) {
	}

	public static Backbone noConflict() {
		throw new UnsupportedOperationException();
	}
}
