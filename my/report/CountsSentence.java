package report;
import java.util.HashSet;

public class CountsSentence {

	public static void main(String[] args) {
		
		String a = "끝났다는";
		String b = "건";
		String c = "정말";
		String d = "아무것도";
		String e = "없는";
		String f = "거예요";
		String g = "그렇게";
		String h = "울고";
		String i = "있는";
		String j = "감정이";
		String k = "사치일";
		String l = "정도로";
		String m = "From";
		String n = "Naver";		
		
		HashSet<String> values = new HashSet<String>();
		values.add("끝났다는");
		values.add("건");
		values.add("정말");
		values.add("아무것도");
		values.add("없는");
		values.add("거예요");
		values.add("그렇게");
		values.add("울고");
		values.add("있는");
		values.add("감정이");
		values.add("사치일");
		values.add("정도로");
		values.add("From");
		values.add("Naver");

		
		for (String val : values) {
			System.out.println(val);
		}
		for (String val2 : values) {
			System.out.println(val2.toLowerCase());
		}
		System.out.println(values.size());
		
		

	}

}
