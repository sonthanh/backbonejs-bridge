package org.stjs.bridge.backbonejs.example;

import org.stjs.bridge.backbonejs.Backbone.Collection;
import org.stjs.javascript.Array;

public class TodoList extends Collection<TodoModel> {

	public TodoList() {
		super(models);
		model = TodoModel.class;
		comparator = "order";
		//localStorage = new Backbone.LocalStorage("todos-backbone");
	}

	public Array<TodoModel> done() {
		return this.where(new TodoModel() {
			{
				done = true;
			}
		});
	}

	public Array<TodoModel> remaining() {
		return this.without.apply(this, this.done());
	}

	public int nextOrder() {
		if (this.length == 0) {
			return 1;
		}
		return this.last().get("order") + 1;
	}

}
