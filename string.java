class string
{
	public static void main(String[]args)
	{
		String s1="apple";
		String s2="rose";
		String s3="red";
		String s4="blue";
		String s5=new String("sngce");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.length());
		System.out.println(s1+" "+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.substring(0,1));
		System.out.println(s1.equals(s2));
		System.out.println(s1.replace('a','o'));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.indexOf('l'));
		System.out.println(s2.replace('r','l'));
		System.out.println(s2+" "+s4);
		System.out.println(s3.toUpperCase());
		System.out.println(s3.compareTo(s1));
		System.out.println(s3.substring(0,2));
		System.out.println(s4.replace('b','r'));
		
	}
	}