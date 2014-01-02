package org.stjs.bridge.backbonejs;

import org.stjs.bridge.backbonejs.options.CollectionOptions;
import org.stjs.javascript.Array;
import org.stjs.javascript.Map;

@SuppressWarnings("unused")
class Collection<T extends Model> extends CollectionUnderscore<T> {
	public Class<T> model;
	public Array<T> models;
	public int length;
	// A comparator can be defined as a sortBy (pass a function that takes a single argument),
	// as a sort (pass a comparator function that expects two arguments),
	// or as a string indicating the attribute to sort by.
	public Object comparator;

	// Set the url property (or function) on a collection to reference its location on the server.
	// Models within the collection will use url to construct URLs of their own.
	public Object url;

	public Collection() {
		//
	}

	public Collection(Array<T> models) {
		//
	}

	public Collection(Array<T> models, CollectionOptions options) {
		//
	}

	public native String toJson();

	public native void sync();

	// -- end underscore

	public native void add(Array<T> modelsToAdd);

	public native void add(Array<T> modelsToAdd, CollectionOptions options);

	public native void remove(Array<T> modelsToRemove);

	public native void remove(Array<T> modelsToRemove, CollectionOptions options);

	public native void set(Array<T> modelsToSet);

	public native void set(Array<T> modelsToSet, CollectionOptions options);

	public native T get(Object id);

	public native T at(int index);

	public native void push(Array<T> modelsToPush);

	public native void push(Array<T> modelsToPush, CollectionOptions options);

	public native T pop();

	public native T pop(CollectionOptions options);

	public native void unshift(Array<T> modelsToUnshift);

	public native void unshift(Array<T> modelsToUnshift, CollectionOptions options);

	public native T shift();

	public native T shift(CollectionOptions options);

	public native Array<T> slice(int begin, int end);

	public native void sort();

	public native void sort(CollectionOptions options);

	public native <V> Array<V> pluck(String attribute);

	public native Array<T> where(T criteria);

	public native T findWhere(T criteria);

	public native Array<T> parse(Object response, CollectionOptions options);

	@Override
	public native Collection<T> clone();

	public native void fetch();

	public native void fetch(CollectionOptions options);

	public native T create(Map<String, Object> attributes);

	public native T create(Map<String, Object> attributes, CollectionOptions options);

	public native static <V extends Backbone.Collection<?>> Class<V> extend(V properties);

	public native static <V extends Backbone.Collection<?>> Class<V> extend(V properties, Map<String, Object> staticProperties);

}
