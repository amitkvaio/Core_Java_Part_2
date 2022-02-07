package amitsimplyfiedtutorial.com.CdefaultMethod;

interface A {
	default void test() {
		System.out.println("Interface A default test() method");
	}
}
/*

Default methods  
--	Until 1.7 version onwards inside interface we can take only public abstract methods and public 
		static final variables(every method present inside interface is always 
		public and abstract whether we are declaring or not). 

--	Every variable declared inside interface is always public static final whether we are declaring or not.
-- 	But from 1.8 version onwards in addition to these,   we can declare default concrete 
		methods also inside interface,which are also known as defender methods.  
--	We can declare default method with the keyword “default” as above
--	Interface default methods are by-default available to all implementation classes.
		Based on requirement implementation class can use these default methods directly or can override. 

*/