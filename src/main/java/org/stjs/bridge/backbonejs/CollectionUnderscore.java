package org.stjs.bridge.backbonejs;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.functions.Callback3;
import org.stjs.javascript.functions.Function1;
import org.stjs.javascript.functions.Function4;

@SuppressWarnings("unused")
class CollectionUnderscore<T extends Model> extends Events {
	//from collections
	public void each(Callback3<T, Integer, Array<T>> iterator) {
		throw new UnsupportedOperationException();
	}

	public void each(Callback3<T, Integer, Array<T>> iterator, Object context) {
		throw new UnsupportedOperationException();
	}

	public Array<T> map(Callback3<T, Integer, Array<T>> iterator) {
		throw new UnsupportedOperationException();
	}

	public Array<T> map(Callback3<T, Integer, Array<T>> iterator, Object context) {
		throw new UnsupportedOperationException();
	}

	public <R> R reduce(Function4<R, T, Integer, Array<T>, R> iterator, R memo) {
		throw new UnsupportedOperationException();
	}

	public <R> R reduce(Function4<R, T, Integer, Array<T>, R> iterator, R memo, Object context) {
		throw new UnsupportedOperationException();
	}

	public <R> R reduceRight(Function4<R, T, Integer, Array<T>, R> iterator, R memo) {
		throw new UnsupportedOperationException();
	}

	public <R> R reduceRight(Function4<R, T, Integer, Array<T>, R> iterator, R memo, Object context) {
		throw new UnsupportedOperationException();
	}

	public T find(Function1<T, Boolean> iterator) {
		throw new UnsupportedOperationException();
	}

	public T find(Function1<T, Boolean> iterator, Object context) {
		throw new UnsupportedOperationException();
	}

	public Array<T> filter(Function1<T, Boolean> iterator) {
		throw new UnsupportedOperationException();
	}

	public Array<T> filter(Function1<T, Boolean> iterator, Object context) {
		throw new UnsupportedOperationException();
	}

	public Array<T> reject(Function1<T, Boolean> iterator) {
		throw new UnsupportedOperationException();
	}

	public Array<T> reject(Function1<T, Boolean> iterator, Object context) {
		throw new UnsupportedOperationException();
	}

	public boolean every() {
		throw new UnsupportedOperationException();
	}

	public boolean every(Function1<T, Boolean> iterator) {
		throw new UnsupportedOperationException();
	}

	public boolean every(Function1<T, Boolean> iterator, Object context) {
		throw new UnsupportedOperationException();
	}

	public boolean some() {
		throw new UnsupportedOperationException();
	}

	public boolean some(Function1<T, Boolean> iterator) {
		throw new UnsupportedOperationException();
	}

	public boolean some(Function1<T, Boolean> iterator, Object context) {
		throw new UnsupportedOperationException();
	}

	public boolean contains(T value) {
		throw new UnsupportedOperationException();
	}

	public Array<T> invoke(Object method, Object... arguments) {
		throw new UnsupportedOperationException();
	}

	public T max() {
		throw new UnsupportedOperationException();
	}

	public <M> M max(Function1<T, M> iterator) {
		throw new UnsupportedOperationException();
	}

	public <M> M max(Function1<T, M> iterator, Object context) {
		throw new UnsupportedOperationException();
	}

	public T min() {
		throw new UnsupportedOperationException();
	}

	public <M> M min(Function1<T, M> iterator) {
		throw new UnsupportedOperationException();
	}

	public <M> M min(Function1<T, M> iterator, Object context) {
		throw new UnsupportedOperationException();
	}

	public Array<T> sortBy(Function1<T, T> iterator) {
		throw new UnsupportedOperationException();
	}

	public Array<T> sortBy(Function1<T, T> iterator, Object context) {
		throw new UnsupportedOperationException();
	}

	public Array<T> sortBy(String property) {
		throw new UnsupportedOperationException();
	}

	public Array<T> sortBy(String property, Object context) {
		throw new UnsupportedOperationException();
	}

	public Map<String, Array<T>> groupBy(Function1<T, T> iterator) {
		throw new UnsupportedOperationException();
	}

	public Map<String, Array<T>> groupBy(Function1<T, T> iterator, Object context) {
		throw new UnsupportedOperationException();
	}

	public Map<String, Array<T>> groupBy(String property) {
		throw new UnsupportedOperationException();
	}

	public Map<String, Array<T>> groupBy(String property, Object context) {
		throw new UnsupportedOperationException();
	}

	public Array<T> shuffle() {
		throw new UnsupportedOperationException();
	}

	public Array<T> toArray() {
		throw new UnsupportedOperationException();
	}

	public int size() {
		throw new UnsupportedOperationException();
	}

	//from arrays

	public T first() {
		throw new UnsupportedOperationException();
	}

	public Array<T> first(int n) {
		throw new UnsupportedOperationException();
	}

	public Array<T> initial() {
		throw new UnsupportedOperationException();
	}

	public Array<T> initial(int n) {
		throw new UnsupportedOperationException();
	}

	public T last() {
		throw new UnsupportedOperationException();
	}

	public Array<T> last(int n) {
		throw new UnsupportedOperationException();
	}

	public Array<T> rest() {
		throw new UnsupportedOperationException();
	}

	public Array<T> rest(int n) {
		throw new UnsupportedOperationException();
	}

	public Array<T> without(T... values) {
		throw new UnsupportedOperationException();
	}

	public Array<T> without(Array<T> values) {
		throw new UnsupportedOperationException();
	}

	public int indexOf(T value) {
		throw new UnsupportedOperationException();
	}

	public int indexOf(T value, boolean isSorted) {
		throw new UnsupportedOperationException();
	}

	public int lastTndexOf(T value) {
		throw new UnsupportedOperationException();
	}

	public int lastTndexOf(T value, int fromIndex) {
		throw new UnsupportedOperationException();
	}

	public int sortedIndex(T value) {
		throw new UnsupportedOperationException();
	}

	public <V> int sortedIndex(V value, Function1<T, V> iterator) {
		throw new UnsupportedOperationException();
	}

	public <V> int sortedIndex(V value, Function1<T, V> iterator, Object context) {
		throw new UnsupportedOperationException();
	}

	public int sortedIndex(Object value, String property) {
		throw new UnsupportedOperationException();
	}

	public int sortedIndex(Object value, String property, Object context) {
		throw new UnsupportedOperationException();
	}

}
