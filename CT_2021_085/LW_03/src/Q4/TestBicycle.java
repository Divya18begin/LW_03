package Q4;

class TestBicycle {
    public static void main(String[] args) {

        Bicycle bike1=new Bicycle();//unknown owner
        Bicycle bike2=new Bicycle("John","123-456-789");

        //Using Owner object directly
        Owner owner1=new Owner("Anne","987-654-321");
        Bicycle bike3=new Bicycle(owner1);

        Owner owner2=new Owner();
        Bicycle bike4=new Bicycle(owner2);

        System.out.println("Details of bike1:\n");
        System.out.println(bike1.getOwnerName());
        System.out.println(bike1.getPhoneNo());

        System.out.println("\nDetails of bike2:\n");
        System.out.println(bike2.getOwnerName());
        System.out.println(bike2.getPhoneNo());

        System.out.println("\nDetails of bike3:\n");
        System.out.println(bike3.getOwnerName());
        System.out.println(bike3.getPhoneNo());

        System.out.println("\nDetails of bike4:\n");
        System.out.println(bike4.getOwnerName());
        System.out.println(bike4.getPhoneNo());

        // Modifying information
        bike1.setOwnerName("New Owner");
        bike1.setPhoneNo("555-555-5555");
        System.out.println("New owner details of bike1:\n");
        System.out.println(bike1.getOwnerName());
        System.out.println(bike1.getPhoneNo());// "New Owner"
    }
}
