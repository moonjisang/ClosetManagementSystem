package report;
import java.util.HashSet;

public class CountsSentence {

	public static void main(String[] args) {
		
		String a = "�����ٴ�";
		String b = "��";
		String c = "����";
		String d = "�ƹ��͵�";
		String e = "����";
		String f = "�ſ���";
		String g = "�׷���";
		String h = "���";
		String i = "�ִ�";
		String j = "������";
		String k = "��ġ��";
		String l = "������";
		String m = "From";
		String n = "Naver";		
		
		HashSet<String> values = new HashSet<String>();
		values.add("�����ٴ�");
		values.add("��");
		values.add("����");
		values.add("�ƹ��͵�");
		values.add("����");
		values.add("�ſ���");
		values.add("�׷���");
		values.add("���");
		values.add("�ִ�");
		values.add("������");
		values.add("��ġ��");
		values.add("������");
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
