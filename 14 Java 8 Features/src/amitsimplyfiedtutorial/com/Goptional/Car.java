package amitsimplyfiedtutorial.com.Goptional;

public class Car
{

    private String price;

    public Car( String price )
    {
       this.price=price;
    }

    public String getPrice()
    {
        return this.price;
    }

    @Override
    public String toString()
    {
        return "this car costs " + getPrice();
    }

}
