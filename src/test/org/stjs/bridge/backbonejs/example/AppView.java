package org.stjs.bridge.backbonejs.example;

import static org.stjs.javascript.JSCollections.$map;

import org.stjs.bridge.backbonejs.Backbone.View;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.jquery.Event;
import org.stjs.javascript.jquery.JQueryCore;

public class AppView extends View<TodoModel> {
	private TodoList Todos;
	private JQueryCore<JQueryCore<?>> input;
	private JQueryCore<JQueryCore<?>> footer;
	private JQueryCore<JQueryCore<?>> main;
	private Element allCheckbox;

	public AppView() {
		el = $("#todoapp").get(0);
	    statsTemplate: _.template($("#stats-template").html());
	    events=$map(
		      "keypress #new-todo" ,  "createOnEnter",//
		      "click #clear-completed", "clearCompleted",//
		      "click #toggle-all", "toggleAllComplete"//
		    );
	}


	    public void initialize() {
	      this.input = this.$("#new-todo");
	      this.allCheckbox = this.$("#toggle-all").get(0);

	      this.listenTo(Todos, "add", this.addOne);
	      this.listenTo(Todos, "reset", this.addAll);
	      this.listenTo(Todos, "all", this.render);

	      this.footer = this.$("footer");
	      this.main = $("#main");

	      Todos.fetch();
	    }

	    @Override
		public void render() {
	      int done = Todos.done().$length();
	      int remaining = Todos.remaining().$length();

	      if (Todos.length > 0) {
	        this.main.show();
	        this.footer.show();
	        this.footer.html(this.statsTemplate({done: done, remaining: remaining}));
	      } else {
	        this.main.hide();
	        this.footer.hide();
	      }

	      this.allCheckbox.checked = remaining == 0;
	    }


	    public void addOne(TodoModel todo) {
	    	TodoView view = new TodoView({model: todo});
	      this.$("#todo-list").append(view.render().el);
	    }


	    public addAll() {
	      Todos.each(this.addOne, this);
	    }


	    public void createOnEnter(Event e) {
	      if (e.keyCode != 13) {
			return;
		}
	      if (!this.input.val()) {
			return;
		}

	      Todos.create({title: this.input.val()});
	      this.input.val("");
	    }


	    public boolean clearCompleted() {
	      _.invoke(Todos.done(), "destroy");
	      return false;
	    },

	    public void toggleAllComplete() {
	      boolean done = this.allCheckbox.checked;
	      Todos.each(function (todo) { todo.save({"done": done}); });
	    }
}
