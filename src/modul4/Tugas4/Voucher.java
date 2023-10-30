package modul4.Tugas4;
import java.util.Date;
public class Voucher {
    private String code;
    private Date validityPeriod;
    private float discount;
    public String getCode(){
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Date getValidityPeriod() {
        return validityPeriod;
    }
    public void setValidityPeriod(Date validityPeriod) {
        this.validityPeriod = validityPeriod;
    }
    public float getDiscount() {
        return discount;
    }
    public void setDiscount(float discount) {
        this.discount = discount;
    }

}
