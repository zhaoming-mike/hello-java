package io.mike.design.pattern.gof.behavioral.memento;

import io.mike.design.pattern.gof.Message;

public class MessageMementoOriginator implements Message {

	private String state;
	
	public MessageMementoOriginator set(String state) {
		this.state = state;
		return this;
	}
	
	public Memento saveToMemento() {
		return new Memento(state);
	}
	
	public void restoreFromMemento(Memento memento) {
		state = memento.getSavedState();
	}
	
	@Override
	public String encode() {
		return state;
	}

	public static class Memento {
		private final String state;
		public Memento(String stateToSave) {
			state = stateToSave;
		}
		public String getSavedState() {
			return state;
		}
		
	}
	
}
