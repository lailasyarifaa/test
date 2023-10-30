package modul4.Tugas4;

public class Pelanggan extends Person implements Membership{
    private boolean isMember;
    private String memberType;

    public Pelanggan(String name, boolean isMember, String memberType) {
        super(name);
        this.isMember = isMember;
        this.memberType = memberType;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean isMember) {
        this.isMember = isMember;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public double getMembershipDiscount() {
        switch (memberType) {
            case "Premium":
                return PREMIUM_DISC;
            case "Gold":
                return GOLD_DISC;
            case "Silver":
                return SILVER_DISC;
            default:
                return 0f;
        }
    }
}
