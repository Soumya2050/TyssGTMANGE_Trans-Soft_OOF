package stringMethods;

public class ConCat_Method {
	
	public static void main(String[] args) {
		
		String s="Soumyaranjan";
		String s1="Jena";
		System.out.println(s.concat(s1));
		
		String str = String.join(s1, s,"kj");
		System.out.println(str);
	}

}
