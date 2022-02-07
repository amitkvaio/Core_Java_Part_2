package amitsimplyfiedtutorial.com.Blambda;

@FunctionalInterface
public interface G {
	public void parents();
}
@FunctionalInterface
interface H extends G{
	 public void parents();
}


/*
In the child interface we can define exactly same parent interface abstract method.
*/