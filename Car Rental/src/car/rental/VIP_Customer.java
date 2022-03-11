package car.rental;

public class VIP_Customer {

    private String name;
    private String id;
    private String credit_card;
    private int seniority;
    private int vip_id;
    private boolean vip;
    private double discount;

    public VIP_Customer(String name, String id, String credit_card, int seniority, int vip_id, boolean vip) {

        this.name = name;
        this.id = id;
        this.credit_card = credit_card;
        this.seniority = seniority;
        this.vip_id = vip_id;
        this.vip = vip;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(String credit_card) {
        this.credit_card = credit_card;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public int getVip_id() {
        return vip_id;
    }

    public void setVip_id(int vip_id) {
        this.vip_id = vip_id;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    public void discount(int seniority){

        if (seniority >=10){
            discount= 25/100;
        }
        else discount=20/100;

    }
    @Override
    public String toString() {
        return "VIP_Customer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", credit_card='" + credit_card + '\'' +
                ", seniority=" + seniority +
                ", vip_id=" + vip_id +
                ", vip=" + vip +
                '}';
    }

}