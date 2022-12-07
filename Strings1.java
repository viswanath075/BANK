class Strings1{
	public static void main(String[] args){
		String a = "ideyaLabs";
		String b = "eyalabsid";
		String re="";
		int n=2;
		for(int i=n;i < a.length();i++){
			char ch =a.charAt(i);
			re += ch;
		}
		//System.out.println(re);
		for(int i=0;i < n;i++){
			char ch =a.charAt(i);
			re += ch;
		}
		//System.out.println(re);
		if(b.equalsIgnoreCase(re))
			System.out.println("True");
		else
			System.out.println("false");
	}
}