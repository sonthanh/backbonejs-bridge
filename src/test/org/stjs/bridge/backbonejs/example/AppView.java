package org.stjs.bridge.backbonejs.example;

import static org.stjs.javascript.JSCollections.$map;

import org.stjs.bridge.backbonejs.Backbone.View;
import org.stjs.javascript.JSObjectAdapter;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.dom.Input;
import org.stjs.javascript.functions.Function1;
import org.stjs.javascript.jquery.Event;
import org.stjs.javascript.jquery.JQueryCore;

public class AppView extends View<TodoModel> {
	private TodoList Todos;
	private JQueryCore<JQueryCore<?>> input;
	private JQueryCore<JQueryCore<?>> footer;
	private JQueryCore<JQueryCore<?>> main;
	private Input allCheckbox;
	private Function1<Object, String> statsTemplate;

	public AppView() {
		el = $("#todoapp").get(0);
	    statsTemplate= _.template($("#stats-template").html());
	    events=$map(
		      "keypress #new-todo" ,  "createOnEnter",//
		      "click #clear-completed", "clearCompleted",//
		      "click #toggle-all", "toggleAllComplete"//
		    );
	}


	    public void initialize() {
	      this.input = this.$("#new-todo");
	      this.allCheckbox = (Input)this.$("#toggle-all").get(0);

	      this.listenTo(Todos, "add", JSObjectAdapter.$get(this, "addOne"));
	      this.listenTo(Todos, "reset", JSObjectAdapter.$get(this, "addAll"));
	      this.listenTo(Todos, "all", JSObjectAdapter.$get(this, "render"));

	      this.footer = this.$("footer");
	      this.main = $("#main");

	      Todos.fetch();
	    }

	    @Override
		public AppView render() {
	      int done = Todos.done().$length();
	      int remaining = Todos.remaining().$length();

	      if (Todos.length > 0) {
	        this.main.show();
	        this.footer.show();
	        this.footer.html(statsTemplate.$invoke($map("done", done, "remaining", remaining)));
	      } else {
	        this.main.hide();
	        this.footer.hide();
	      }

	     this.allCheckbox.checked =  remaining == 0;
	      return this;
	    }


	    public void addOne(TodoModel todo) {
	    	TodoView view = new TodoView({model: todo});
	      this.$("#todo-list").append(view.render().el);
	    }


	    public void addAll() {
	      Todos.each(this.addOne, this);
	    }


	    public void createOnEnter(Event e) {
	      if (e.keyCode != 13) {
			return;
		}
	      if (this.input.val() != null) {
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
