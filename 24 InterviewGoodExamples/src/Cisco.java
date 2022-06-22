import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cisco {
	public static void main(String[] args) {
		String str = "<products><product><name>Apple</name><price>50000</price></product><product> "
				+ "<name>Samsung</name><price>40000</price></product></products>";
		removeXmlTags(str,"Apple");
	}

	public static void removeXmlTags(String contents,String productName) {
		Pattern tag = Pattern.compile("<.*?>");
		Matcher mtag = tag.matcher(contents);
		while (mtag.find()) {
			contents = mtag.replaceAll("");
		}
		System.out.println("Contents::\n"+contents);
		String[] requiredStr = contents.split(" ");
		for (String str : requiredStr) {
			if(str.contains(productName)) {
				String price = str.substring(productName.length());
				System.out.println(productName +" Price ::"+price);
			}
		}
	}

}
