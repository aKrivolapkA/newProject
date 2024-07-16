package src.main.java.lesson16.ExPhone;

public class Phone {
    private  String name;
    private  int price;

    private  String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Phone(String name,  String company,int price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public static int compare(Phone phone1, Phone phone2){
        if( phone1.getPrice()>phone2.getPrice()){
            return 1;
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                '}';
    }
}
