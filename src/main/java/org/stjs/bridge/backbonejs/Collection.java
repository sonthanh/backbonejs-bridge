package org.stjs.bridge.backbonejs;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;

class Collection<T extends Model> {
	public Class<T> model;
	public Array<T> models;
	public int length;
	//A comparator can be defined as a sortBy (pass a function that takes a single argument),
	//as a sort (pass a comparator function that expects two arguments),
	//or as a string indicating the attribute to sort by.
	public Object comparator;

	//Set the url property (or function) on a collection to reference its location on the server.
	//Models within the collection will use url to construct URLs of their own.
	public Object url;

	public Collection(Array<T> models) {
		throw new UnsupportedOperationException();
	}

	public Collection(Array<T> models, CollectionOptions options) {
		throw new UnsupportedOperationException();
	}

	public String toJson() {
		throw new UnsupportedOperationException();
	}

	public void sync() {
	}

	//underscore methods
	public void add(Array<T> modelsToAdd) {
	}

	public void add(Array<T> modelsToAdd, CollectionOptions options) {
	}

	public void remove(Array<T> modelsToRemove) {
	}

	public void remove(Array<T> modelsToRemove, CollectionOptions options) {
	}

	public void set(Array<T> modelsToSet) {
	}

	public void set(Array<T> modelsToSet, CollectionOptions options) {
	}

	public T get(Object id) {
		throw new UnsupportedOperationException();
	}

	public T at(int index) {
		throw new UnsupportedOperationException();
	}

	public void push(Array<T> modelsToPush) {
	}

	public void push(Array<T> modelsToPush, CollectionOptions options) {
	}

	public T pop() {
		throw new UnsupportedOperationException();
	}

	public T pop(CollectionOptions options) {
		throw new UnsupportedOperationException();
	}

	public void unshift(Array<T> modelsToUnshift) {
	}

	public void unshift(Array<T> modelsToUnshift, CollectionOptions options) {
	}

	public T shift() {
		throw new UnsupportedOperationException();
	}

	public T shift(CollectionOptions options) {
		throw new UnsupportedOperationException();
	}

	public Array<T> slice(int begin, int end) {
		throw new UnsupportedOperationException();
	}

	public void sort() {
	}

	public void sort(CollectionOptions options) {
	}

	public <V> Array<V> pluck(String attribute) {
		throw new UnsupportedOperationException();
	}

	public Array<T> where(T criteria) {
		throw new UnsupportedOperationException();
	}

	public T findWhere(T criteria) {
		throw new UnsupportedOperationException();
	}

	public Array<T> parse(Object response, CollectionOptions options) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Collection<T> clone() {
		throw new UnsupportedOperationException();
	}

	public void fetch() {
	}

	public void fetch(CollectionOptions options) {
	}

	public T create(Map<String, Object> attributes) {
		throw new UnsupportedOperationException();
	}

	public T create(Map<String, Object> attributes, CollectionOptions options) {
		throw new UnsupportedOperationException();
	}

	public static <V extends Backbone.Collection<?>> Class<V> extend(V properties) {
		throw new UnsupportedOperationException();
	}

	public static <V extends Backbone.Collection<?>> Class<V> extend(V properties, Map<String, Object> staticProperties) {
		throw new UnsupportedOperationException();
	}

}
