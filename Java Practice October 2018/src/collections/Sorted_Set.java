package collections;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
public class Sorted_Set {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();
		SortedSet<Integer> s2 = new TreeSet<Integer>();
		SortedSet<Integer> s3 = new TreeSet<Integer>();
		
		s1.add(1);
		s1.add(5);
		s1.add(3);
		
		
		s2.addAll(s1);
		s3.addAll(s2.tailSet(1));
	}
}
