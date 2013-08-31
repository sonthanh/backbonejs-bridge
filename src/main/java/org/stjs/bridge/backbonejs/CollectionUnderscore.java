package org.stjs.bridge.backbonejs;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.functions.Callback3;
import org.stjs.javascript.functions.Function1;
import org.stjs.javascript.functions.Function4;

@SuppressWarnings("unused")
class CollectionUnderscore<T extends Model> extends Events {
	//from collections
	public native void each (Callback3<T, Integer, Array<T>> iterator);

	public native void each (Callback3<T, Integer, Array<T>> iterator, Object context);

	public native Array<T> map (Callback3<T, Integer, Array<T>> iterator);

	public native Array<T> map (Callback3<T, Integer, Array<T>> iterator, Object context);

	public native <R> R reduce (Function4<R, T, Integer, Array<T>, R> iterator, R memo);

	public native <R> R reduce (Function4<R, T, Integer, Array<T>, R> iterator, R memo, Object context);

	public native <R> R reduceRight (Function4<R, T, Integer, Array<T>, R> iterator, R memo);

	public native <R> R reduceRight (Function4<R, T, Integer, Array<T>, R> iterator, R memo, Object context);

	public native T find (Function1<T, Boolean> iterator);

	public native T find (Function1<T, Boolean> iterator, Object context);

	public native Array<T> filter (Function1<T, Boolean> iterator);

	public native Array<T> filter (Function1<T, Boolean> iterator, Object context);

	public native Array<T> reject (Function1<T, Boolean> iterator);

	public native Array<T> reject (Function1<T, Boolean> iterator, Object context);

	public native boolean every ();

	public native boolean every (Function1<T, Boolean> iterator);

	public native boolean every (Function1<T, Boolean> iterator, Object context);

	public native boolean some ();

	public native boolean some (Function1<T, Boolean> iterator);

	public native boolean some (Function1<T, Boolean> iterator, Object context);

	public native boolean contains (T value);

	public native Array<T> invoke (Object method, Object... arguments);

	public native T max ();

	public native <M> M max (Function1<T, M> iterator);

	public native <M> M max (Function1<T, M> iterator, Object context);

	public native T min ();

	public native <M> M min (Function1<T, M> iterator);

	public native <M> M min (Function1<T, M> iterator, Object context);

	public native Array<T> sortBy (Function1<T, T> iterator);

	public native Array<T> sortBy (Function1<T, T> iterator, Object context);

	public native Array<T> sortBy (String property);

	public native Array<T> sortBy (String property, Object context);

	public native Map<String, Array<T>> groupBy (Function1<T, T> iterator);

	public native Map<String, Array<T>> groupBy (Function1<T, T> iterator, Object context);

	public native Map<String, Array<T>> groupBy (String property);

	public native Map<String, Array<T>> groupBy (String property, Object context);

	public native Array<T> shuffle ();

	public native Array<T> toArray ();

	public native int size ();

	//from arrays

	public native T first ();

	public native Array<T> first (int n);

	public native Array<T> initial ();

	public native Array<T> initial (int n);

	public native T last ();

	public native Array<T> last (int n);

	public native Array<T> rest ();

	public native Array<T> rest (int n);

	public native Array<T> without (T... values);

	public native Array<T> without (Array<T> values);

	public native int indexOf (T value);

	public native int indexOf (T value, boolean isSorted);

	public native int lastTndexOf (T value);

	public native int lastTndexOf (T value, int fromIndex);

	public native int sortedIndex (T value);

	public native <V> int sortedIndex (V value, Function1<T, V> iterator);

	public native <V> int sortedIndex (V value, Function1<T, V> iterator, Object context);

	public native int sortedIndex (Object value, String property);

	public native int sortedIndex (Object value, String property, Object context);

}
