package car.rental;

public class Customer {

    private String name;
    private String id;
    private String credit_card;
    private int seniority;
    private String[]request;
    private double discount;

    public Customer(String name, String id, String credit_card, int seniority) {
        this.name = name;
        this.id = id;
        this.credit_card = credit_card;
        this.seniority = seniority;
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
    public void discount(int seniority){

        if (seniority >=10){
            discount= 5/100;
        }
    }



    /**
     *  This method functionality lies in knowing whether the customer is vip or not.
                                                                                                                                                                                                                                                                                                                                                                                                                                                                         * @return boolean
     */
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", credit_card='" + credit_card + '\'' +
                ", seniority=" + seniority +
                '}';
    }
}
