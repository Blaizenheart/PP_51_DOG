public class Dog {
   private String name;
   private int age;
   private String breed;
   private double weight;
   private static int dogCount = 0;

   //default constructor
    public Dog()
    {
       name = "";
       age = 0;
       breed = "";
       weight = 0.0;
       dogCount++;
    }
    //full constructor
   public Dog(String name, int age, String breed, double weight)
   {
       this.name = name;
       this.age = age;
       this.breed = breed;
       this.weight = weight;
       dogCount++;
   }

   //getters
    public String getName()
    {
        return "\n" + name + "'s name: " + name;
    }
    public String getAge()
    {
        return "\n" + name + "'s age: " + age;
    }
    public String getBreed()
    {
        return "\n" + name + "'s breed: " +  breed;
    }
    public String getWeight()
    {
        return "\n" + name + "'s weight (lbs): " +  weight;
    }
    public static String getCount()
    {
        return "\nYou have " + dogCount + " dogs.";
    }

    //setters
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    //brainMethod
    public String weightKG()
    {
        //converts weight in LBs to KG
        return name + "'s weight in Kg:" + weight * 0.453592;
    }

    //toString
    public String toString()
    {
        String result = "\n--------------------";
        result += "\nName: " + name;
        result += "\nAge: " + age;
        result += "\nBreed: " + breed;
        result += "\nWeight: " + weight;
        result += "\n--------------------";
        return result;
    }
}
