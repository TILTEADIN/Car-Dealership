package car.rental;

public class Request {

    private String name;
    private String id;
    private String credit_card;
    private String registration;
    private int hiring_time;
    private int seniority;
    private boolean vip;

    public Request(String name, String id, String credit_card, String registration, int hiring_time, int seniority, boolean vip) {
        this.name = name;
        this.id = id;
        this.credit_card = credit_card;
        this.registration = registration;
        this.hiring_time = hiring_time;
        this.seniority = seniority;
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

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getHiring_time() {
        return hiring_time;
    }

    public void setHiring_time(int hiring_time) {
        this.hiring_time = hiring_time;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", credit_card='" + credit_card + '\'' +
                ", registration='" + registration + '\'' +
                ", hiring_time=" + hiring_time +
                ", seniority=" + seniority +
                ", vip=" + vip +
                '}';
    }
}

