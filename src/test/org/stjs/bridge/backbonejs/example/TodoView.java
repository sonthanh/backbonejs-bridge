package org.stjs.bridge.backbonejs.example;

import org.stjs.bridge.backbonejs.Backbone.View;
import org.stjs.javascript.jquery.Event;

public class TodoView extends View<TodoModel> {

	public TodoView() {
		tagName = "li";
		template: _.template($("#item-template").html());
		//The DOM events specific to an item.
		events: $map("click .toggle", "toggleDone", //
				"dblclick .view", "edit",//
				"click a.destroy", "clear",//
				"keypress .edit", "updateOnEnter",//
				"blur .edit", "close");
	}

	public void initialize() {
		this.listenTo(this.model, "change", this.render);
		this.listenTo(this.model, "destroy", this.remove);
	}

	@Override
	public View render() {
		this.$el.html(this.template(this.model.toJSON()));
		this.$el.toggleClass("done", this.model.get("done"));
		this.input = this.$(".edit");
		return this;
	}

	public void toggleDone() {
		this.model.toggle();
	}

	public void edit() {
		this.$el.addClass("editing");
		this.input.focus();
	}

	public void close() {
boolean value = this.input.val();
if (!value) {
this.clear();
} else {
this.model.save({title: value});
this.$el.removeClass("editing");
}
}

	public void updateOnEnter(Event e) {
		if (e.keyCode == 13) {
			this.close();
		}
	}

	public void clear() {
		this.model.destroy();
	}

}
