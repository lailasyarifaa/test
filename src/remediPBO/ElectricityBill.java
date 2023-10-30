package remediPBO;

public class ElectricityBill implements Payable{
    private int kwh;
    private String category;
    public ElectricityBill(int kwh, String category){
        this.kwh = kwh;
        this.category = category;
    }
    public int getBasePrice(){
        int bPrice = 0;
        switch (category){
            case "R-1":
                bPrice = 100;
                break;
            case "R-2":
                bPrice = 200;
                break;
        }
        return bPrice;
    }
    public String getBillInfo(){
        return "kWh: " + kwh + "\n" + "Category: " + category + "(" + getBasePrice() + "per Kwh";
    }
    public int getPaymentAmount(){
        return kwh * getBasePrice();
    }
}
