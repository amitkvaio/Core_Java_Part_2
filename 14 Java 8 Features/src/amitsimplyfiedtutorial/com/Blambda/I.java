package amitsimplyfiedtutorial.com.Blambda;
@FunctionalInterface
public interface I {
	public void test1();
}
@FunctionalInterface
interface J extends I {
	//public void test2();
}

/*
--	In the child interface we can’t define any new abstract methods otherwise child interface won’t be 
--	FunctionalInterface and if we are trying to use @FunctionalInterface annotation then compiler gives
--	an error message. 


*/