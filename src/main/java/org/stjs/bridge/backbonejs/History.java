package org.stjs.bridge.backbonejs;

import org.stjs.bridge.backbonejs.options.HistoryOptions;

public class History {
	public native boolean start ();

	public native boolean start (HistoryOptions options);
}
