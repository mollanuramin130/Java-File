public class New {
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("i am Nur");
		sb.append("Hello");
		sb.append(" ");
		sb.append("world");
        sb.delete(1, 4);
		String message = sb.toString();
		System.out.println(message);
		String str="hh";
		if(str.charAt(0)==str.charAt(1)){
			System.out.println(str.charAt(0));
			System.out.println(str.length());
		}
	}
}
