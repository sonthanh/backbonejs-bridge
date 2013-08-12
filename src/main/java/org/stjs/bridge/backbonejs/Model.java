package org.stjs.bridge.backbonejs;

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

	public Map<String, Object> defaults() {
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

	public void unset(String attribute, ModelOptions options) {
		throw new UnsupportedOperationException();
	}

	public void clear() {
		throw new UnsupportedOperationException();
	}

	public void clear(ModelOptions options) {
		throw new UnsupportedOperationException();
	}

	public String toJSON() {
		throw new UnsupportedOperationException();
	}

	public void sync(String method, Model model, SyncOptions options) {
	}

	public void fetch() {
	}

	public void fetch(ModelOptions options) {
	}

	public void save(Map<String, ? extends Object> properties) {
	}

	public void save(Map<String, Object> properties, ModelOptions options) {
	}

	public void destroy() {
	}

	public void destroy(ModelOptions options) {
	}

	public void validate(Map<String, Object> properties, ModelOptions options) {
	}

	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	public String url() {
		throw new UnsupportedOperationException();
	}

	public Model parse(Object response, CollectionOptions options) {
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
}
