public class StaticApp{
	public static void main(String[] args){
		System.out.println(Foo.classVar);//I class var
//		System.out.println(Foo.instanceVar);//error

		Foo.classMethod();//I class var
//		Foo.instanceMethod();//error

		Foo f1 = new Foo();
		Foo f2 = new Foo();

		System.out.println(f1.classVar);//I class var
//		System.out.println(f1.instanceVar);//error

		f1.classVar="changed by f1";
		System.out.println(Foo.classVar);//changed by f1
		System.out.println(f2.classVar);//changed by f1

		f1.instanceVar="changed by f1";
		System.out.println(f1.instanceVar);//changed by f1
		System.out.println(f2.instanceVar);//I instance var
}
}