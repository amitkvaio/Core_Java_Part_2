package amitsimplyfiedtutorial.com.Ostream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Before Java 8
public class FilterTest1 {
	public static void main(String[] args) {
        String [] arrayString = {"spring", "Java", "GWT"};
        List<String> subList = Arrays.asList(arrayString);
        
        //Filtering out string
        List<String> result = getFilterOutput(subList, "spring");
        for (String temp : result) {
            System.out.println(temp);
        }
    }

    private static List<String> getFilterOutput(List<String> subList, String filter) {
        List<String> result = new ArrayList<>();
        for (String subject : subList) {
            if (!filter.equals(subject)) {
                result.add(subject);
            }
        }
        return result;
    }
}
