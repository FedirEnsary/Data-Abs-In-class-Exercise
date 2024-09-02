public class InClassAug29{
	public static void main (String[] args){
		int x;
		if(args.length > 0) x = Integer.parseInt(args[0]);
		else x = 20;
		int y = 0;
		for(int i = 0; i < x; i+=5) y+=i;
		for(int i = 0; i < x; i+=7){
			if(i % 5 != 0) y+=i;
		}
		System.out.println(y);
	}
}

