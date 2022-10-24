
public class Person {
    String name;
    String address;
    //constructor with the name and address
    public Person(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    //return name
    public String getname()
    {
        return name;
    }
    //return address
    public String getaddress()
    {
        return address;
    }
    //set address
    public void setaddress(String address)
    {
        this.address=address;
    }
    @Override
    public String toString() {
      return name + "(" + address + ")";
   }
}

