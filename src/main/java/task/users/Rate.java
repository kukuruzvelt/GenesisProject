package task.users;

import org.springframework.stereotype.Component;

@Component
public class Rate {
    private String ccy;
    private String base_ccy;
    private double buy;
    private double sale;

    public String getCcy() {
        return ccy;
    }

    public String getBase_ccy() {
        return base_ccy;
    }

    public double getSale() {
        return sale;
    }

    public double getBuy() {
        return buy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public void setBase_ccy(String base_ccy) {
        this.base_ccy = base_ccy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }


}
