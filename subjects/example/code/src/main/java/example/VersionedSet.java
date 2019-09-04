package example;

import java.util.ArrayList;

public class VersionedSet {

	private long version = 0;
	private ArrayList elements = new ArrayList();

	public void add(Object item) { 
		if (elements.contains(item)) {
			return;
		}
		elements.add(item);
		incrementVersion();
	}

	private void incrementVersion() { version++; }

	protected long getVersion() { return version; }

	public int size() { return elements.size(); }
	
	public boolean isEmpty() { return size() == 0; }

	public boolean contains(Object item) {
		return elements.contains(item); 
	}

	@Override
	public boolean equals(Object other) {
		if(!(other instanceof VersionedSet)) {
			return false;
		}
		VersionedSet otherSet = (VersionedSet)other;
		if(otherSet.size() != size()) {
			return false;
		}
		for (Object item : elements) {
			if(!otherSet.contains(item)) {
				return false;
			}
		}
		return true;
	}

	public VersionedSet intersect(VersionedSet other) {
		if (isEmpty() || other.isEmpty()) {
			return new VersionedSet();
		}
		VersionedSet result = new VersionedSet();
		for(Object item : elements) {
			if(other.contains(item)) {
				result.add(item);
			}
		}
		result.version = 0;
		return result;
	}
}