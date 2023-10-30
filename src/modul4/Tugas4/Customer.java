package modul4.Tugas4;

public class Customer extends Person implements Membership{
    private String memberType;
    private boolean isMember;
    public Customer(String name, String memberType, Boolean isMember){
        super(name);
        this.memberType = memberType;
        this.isMember = isMember;
    }
    public String getMemberType() {
        return memberType;
    }
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
    public boolean isMember() {
        return isMember;
    }
    public void setMember(boolean member) {
        isMember = member;
    }

    //implementasi method dari interface Membership
    @Override
    public double getMembershipDiscount(){
        if (isMember){
            switch (memberType){
                case "Premium":
                    return PREMIUM_DISC;
                case "Gold":
                    return GOLD_DISC;
                case "Silver":
                    return SILVER_DISC;
                default:
                    return 0.0;
            }
        }else {
            return 0.0;
        }
    }
}
