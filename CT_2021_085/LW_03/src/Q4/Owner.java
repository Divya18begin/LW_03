package Q4;

class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner(){
        ownerName="Unknown";
        phoneNo="Not set";
    }

    public Owner(String name,String num){
        ownerName=name;
        phoneNo=num;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }


}
