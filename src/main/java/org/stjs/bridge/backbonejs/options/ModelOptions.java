package org.stjs.bridge.backbonejs.options;

import org.stjs.bridge.backbonejs.Backbone;
import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public class ModelOptions {

	public Backbone.Collection<?> collection;

	public String url;

	public String urlRoot;

	public boolean parse;

}
