package Q4;

class Bicycle {
    private Owner owner;

    //constructor
    public Bicycle(){
        owner=new Owner();
    }

    public Bicycle(String name,String num){
        owner=new Owner(name,num);
    }

    public Bicycle(Owner owner){
        this.owner=owner;
    }

    //Returns the name of this bicycle's owner
    public String getOwnerName() {
        return owner.getOwnerName();
    }

    // Assigns the name of this bicycle's owner
    public void setOwnerName(String name){
         owner.setOwnerName(name);
    }

    public String getPhoneNo(){
        return owner.getPhoneNo();
    }

    // Assigns the phone number of this bicycle's owner
    public void setPhoneNo(String num){
        this.owner.setPhoneNo(num);
    }

    // New methods to work with Owner object directly
    public Owner getOwner(){
        return owner;
    }

    public void setOwner(){
        this.owner=owner;
    }
}
