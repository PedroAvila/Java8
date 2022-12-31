package org.paumard;

import java.util.function.Function;

@FunctionalInterface
public interface IComparator<T> {
	
	int compare(T t1, T t2);
	
	default IComparator<T> thenComparing(IComparator<T> cmp){
		return (p1, p2) -> compare(p1, p2) == 0 ? cmp.compare(p1, p2) : compare(p1, p2);
	}
	
	default IComparator<T> thenComparing(Function<T, Comparable> f){
		return thenComparing(comparing(f));
	}
	
	static <U> IComparator<U> comparing(Function<U, Comparable> f){
		return (p1, p2) -> f.apply(p1).compareTo(f.apply(p2)) ;
	}
	
}
