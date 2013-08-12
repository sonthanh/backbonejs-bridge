package org.stjs.bridge.backbonejs.example;

import static org.stjs.javascript.JSCollections.$map;

import org.stjs.bridge.backbonejs.Backbone.Model;
import org.stjs.javascript.Map;

public class TodoModel extends Model {
	public boolean done;

	//			Default attributes for the todo item.
	@Override
	public Map<String, Object> defaults() {
		return $map("title", "empty todo...", //
				"order", Todos.nextOrder(), //
				"done", false);
	}

	//			Toggle the done state of this todo item.
	public void toggle() {
		this.save($map("done", !(Boolean) this.get("done")));
	}
}
