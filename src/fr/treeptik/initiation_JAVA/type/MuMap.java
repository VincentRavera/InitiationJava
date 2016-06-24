package fr.treeptik.initiation_JAVA.type;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MuMap<K, V> extends AbstractMap<K, V>{
	
	private Map<K, List<V> > data = new HashMap<K, List<V>>();
	
	

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		throw new UnsupportedOperationException("Use entrySetMuMap");
	}
	public Set<java.util.Map.Entry<K, List<V>>> entrySetMuMap() {
		return data.entrySet();
	}



	@Override
	public V put(K key, V value) {
		List<V> list = data.get(key);
		if (list == null) {
			list = new ArrayList<>();
			list.add(value);
		}
		else if (!list.contains(value)) {
			list.add(value);
			
		} 
		data.put(key, list);
		
		return value;
	}


}
