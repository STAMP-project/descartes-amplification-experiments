package example;

import org.junit.Test;
import static org.junit.Assert.*;

public class VersionedSetTest {
	@Test
	public void testAdd() {
		VersionedSet list = new VersionedSet();
		list.add(1);
		assertEquals(1, list.size());
	}

	@Test
	public void testEquals() {
		VersionedSet one = new VersionedSet();
		VersionedSet two = new VersionedSet();
		assertTrue(one.equals(two)); 
	}

	@Test
	public void testIntersection() {
		VersionedSet one = new VersionedSet();
		one.add(1);
		VersionedSet two = new VersionedSet();
		two.add(2);
		VersionedSet result = one.intersect(two);
		assertFalse(result.contains(1));
		assertFalse(result.contains(2));
	}
}		