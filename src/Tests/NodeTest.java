package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Basic.Node;
import Basic.Value;

class NodeTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}
	
	@Test
	void testEmptyNode() {
		Node emptyNode = new Node();
		assertNotNull(emptyNode);
		assertNull(emptyNode.getValue());
		assertNull(emptyNode.getNext());
		assertNull(emptyNode.getPrev());
	}

	@Test
	void testOnlyValueNode() {
		Value<String> value1 = new Value<>();
		value1.set("TEST");
		Node valueNode = new Node(value1);
		assertNotNull(valueNode);
		assertNotNull(valueNode.getValue());
		assertNull(valueNode.getNext());
		assertNull(valueNode.getPrev());
	}
	
	@Test
	void testFullNode() {
		Value<String> value1 = new Value<>();
		value1.set("TEST");
		Node prevNode = new Node();
		Node nextNode = new Node();
		Node fullNode = new Node(value1, nextNode, prevNode);
		assertNotNull(fullNode);
		assertNotNull(fullNode.getValue());
		assertNotNull(fullNode.getNext());
		assertNotNull(fullNode.getPrev());
	}
	
}
