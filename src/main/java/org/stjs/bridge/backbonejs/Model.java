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

	public Map<String, ? extends Object> defaults() {
		throw new UnsupportedOperationException();
	}

	public static <V extends Model> Class<V> extend(V properties) {
		throw new UnsupportedOperationException();
	}

	public static <V extends Model> Class<V> extend(V properties, Map<String, Object> staticProperties) {
		throw new UnsupportedOperationException();
	}

	public <T> T get(String attribute) {
		throw new UnsupportedOperationException();
	}

	public void set(Map<String, Object> attributes) {
		throw new UnsupportedOperationException();
	}

	public void set(String attribute, Object value) {
		throw new UnsupportedOperationException();
	}

	public String escape(String attribute) {
		throw new UnsupportedOperationException();
	}

	public boolean has(String attribute) {
		throw new UnsupportedOperationException();
	}

	public void unset(String attribute) {
		throw new UnsupportedOperationException();
	}

	public void unset(String attribute, ChangeModelOptions options) {
		throw new UnsupportedOperationException();
	}

	public void clear() {
		throw new UnsupportedOperationException();
	}

	public void clear(ChangeModelOptions options) {
		throw new UnsupportedOperationException();
	}

	public String toJSON() {
		throw new UnsupportedOperationException();
	}

	public void sync(String method, Model model, SyncOptions options) {
	}

	public void fetch() {
	}

	public void fetch(SyncOptions options) {
	}

	public void save(Map<String, ? extends Object> properties) {
	}

	public void save(Map<String, Object> properties, SaveModelOptions options) {
	}

	public void destroy() {
	}

	public void destroy(SaveModelOptions options) {
	}

	public void validate(Map<String, Object> properties, ValidateModelOptions options) {
	}

	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	public String url() {
		throw new UnsupportedOperationException();
	}

	public Model parse(Object response, ParseModelOptions options) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Model clone() {
		throw new UnsupportedOperationException();
	}

	public boolean isNew() {
		throw new UnsupportedOperationException();
	}

	public boolean hasChanged() {
		throw new UnsupportedOperationException();
	}

	public boolean hasChanged(String attribute) {
		throw new UnsupportedOperationException();
	}

	public <T> T previous(String attribute) {
		throw new UnsupportedOperationException();
	}

	public Map<String, Object> previousAttributes() {
		throw new UnsupportedOperationException();
	}

	//from underscore js
	public Array<String> keys() {
		throw new UnsupportedOperationException();
	}

	public Array<? extends Object> values() {
		throw new UnsupportedOperationException();
	}

	public Array<Array<? extends Object>> pairs() {
		throw new UnsupportedOperationException();
	}

	public <T> T invert() {
		throw new UnsupportedOperationException();
	}

	public <T> T pick(String... keys) {
		throw new UnsupportedOperationException();
	}

	public <T> T omit(String... keys) {
		throw new UnsupportedOperationException();
	}
}
