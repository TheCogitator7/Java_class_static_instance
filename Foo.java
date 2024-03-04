class Foo{
	public static String classVar="I class var";
	public String instanceVar="I instance var";

	public static void classMethod(){
		System.out.println(classVar);
//		System.out.println(instanceVar);//error
}
	public void instanceMethod(){
		System.out.println(classVar);
		System.out.println(instanceVar);
}	
}