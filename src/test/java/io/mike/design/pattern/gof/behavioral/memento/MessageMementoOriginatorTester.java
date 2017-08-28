package io.mike.design.pattern.gof.behavioral.memento;

import org.junit.Test;

import io.mike.design.pattern.gof.behavioral.memento.MessageMementoOriginator.Memento;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class MessageMementoOriginatorTester {

	@Test
	public void test() {
		MessageMementoOriginator messageMementoOriginator = new MessageMementoOriginator();
		Memento saveToMemento = messageMementoOriginator.set("hello memento").saveToMemento();
		
		messageMementoOriginator.set("hello new");
		assertThat(messageMementoOriginator.encode(), is("hello new"));
		
		messageMementoOriginator.restoreFromMemento(saveToMemento);
		
		assertThat(messageMementoOriginator.encode(), is("hello memento"));
	}
	
	
}
