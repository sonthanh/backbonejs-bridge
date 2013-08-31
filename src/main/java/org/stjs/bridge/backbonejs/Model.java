package org.stjs.bridge.backbonejs;

import org.stjs.bridge.backbonejs.options.ChangeModelOptions;
import org.stjs.bridge.backbonejs.options.ModelOptions;
import org.stjs.bridge.backbonejs.options.ParseModelOptions;
import org.stjs.bridge.backbonejs.options.SaveModelOptions;
import org.stjs.bridge.backbonejs.options.SyncOptions;
import org.stjs.bridge.backbonejs.options.ValidateModelOptions;
import org.stjs.javascript.Array;
import org.stjs.javascript.Map;

public class Model extends Events {
	public String id;
	public String idAttribute;
	public Object cid;
	public Map<String, Object> attributes;
	public Array<String> changed;
	public Object defaults;
	public Object validationError;
	public Object urlRoot;

	public Model(Map<String, ? extends Object> attributes, ModelOptions options) {
	}

	public native Map<String, ? extends Object> defaults();

	public native static <V extends Model> Class<V> extend(V properties);

	public native static <V extends Model> Class<V> extend(V properties, Map<String, Object> staticProperties);

	public native <T> T get(String attribute);

	public native void set(Map<String, Object> attributes);

	public native void set(String attribute, Object value);

	public native String escape(String attribute);

	public native boolean has(String attribute);

	public native void unset(String attribute);

	public native void unset(String attribute, ChangeModelOptions options);

	public native void clear();

	public native void clear(ChangeModelOptions options);

	public native String toJSON();

	public native void sync(String method, Model model, SyncOptions options);

	public native void fetch();

	public native void fetch(SyncOptions options);

	public native void save(Map<String, ? extends Object> properties);

	public native void save(Map<String, Object> properties, SaveModelOptions options);

	public native void destroy();

	public native void destroy(SaveModelOptions options);

	public native void validate(Map<String, Object> properties, ValidateModelOptions options);

	public native boolean isValid();

	public native String url();

	public native Model parse(Object response, ParseModelOptions options);

	@Override
	public native Model clone();

	public native boolean isNew();

	public native boolean hasChanged();

	public native boolean hasChanged(String attribute);

	public native <T> T previous(String attribute);

	public native Map<String, Object> previousAttributes();

	// from underscore js
	public native Array<String> keys();

	public native Array<? extends Object> values();

	public native Array<Array<? extends Object>> pairs();

	public native <T> T invert();

	public native <T> T pick(String... keys);

	public native <T> T omit(String... keys);
}
