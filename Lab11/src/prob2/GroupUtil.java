package prob2;
import java.util.*;

public class GroupUtil {
	//Fix this code
	public static Group<?> copy(Group<?> group) {

		return createAGroup(group);


	}

	static <T> Group<T> createAGroup(Group<T> group){
		List<T> elements = group.getElements();
		T specialElement = group.getSpecialElement();

		return new Group<>(specialElement,elements);
	}

	//Test using this main method
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4);
		Group<Integer> group = new Group<>(0, list);
		System.out.println(group);
		System.out.println(GroupUtil.copy(group));
	}
}
