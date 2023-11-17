public class DogDriver {
    public static void main (String args[])
    {
        //Fang
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);

        //Piper
        Dog dog2 = new Dog("Piper", 3, "Australian Shepherd", 45);

        //My Dog
        Dog dog3 = new Dog("Max", 4, "Golden Retriever", 60);

        System.out.println(dog1.getBreed());
        System.out.println(dog1.getAge());

        System.out.println(dog2.getWeight());

        System.out.println(dog3.toString());
        System.out.println(Dog.getCount());
    }
}
