class HelloWorld {
	
	public static void main(String argv[])
	{
		String greeting = "world";
		
		if (argv.length == 1)
			greeting = argv[0];
		
		System.out.printf("hello %s!\n", greeting);
	}
	
}
