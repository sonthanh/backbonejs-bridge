package org.stjs.bridge.backbonejs;

import org.stjs.javascript.Array;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.jquery.JQueryCore;

public class Backbone {
	public static Callback1<Object> ajax;
	public static boolean emulateHTTP;
	public static boolean emulateJSON;
	public static JQueryCore<JQueryCore<?>> $;

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
	}

	public static class View<T extends Model> extends org.stjs.bridge.backbonejs.View<T> {

		public View() {
			super();
		}

		public View(ViewOptions<T> options) {
			super(options);
		}
	}

	public static class Router extends org.stjs.bridge.backbonejs.Router {
	}

	public static <T> void sync(String method, Array<T> model, SyncOptions options) {
	}

	public static <T> void sync(String method, Array<T> model) {
	}

	public static Backbone noConflict() {
		throw new UnsupportedOperationException();
	}
}
