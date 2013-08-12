package org.stjs.bridge.backbonejs.example;

public class Todo {
	public static void main(String[] args) {

		//			The collection of todos is backed by localStorage instead of a remote server.
		TodoList Todos = new TodoList();

		//Finally, we kick things off by creating the App.
		AppView App = new AppView();
	}
}
