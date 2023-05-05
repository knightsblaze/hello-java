import static System.out.printf;

class HelloWorld {
	
	public static void main(int argc, String argv[])
	{
		String greeting = "world";
		
		if (argc == 2)
			greeting = argv[1];
		
		printf("hello %s!\n", greeting);
	}
	
}
