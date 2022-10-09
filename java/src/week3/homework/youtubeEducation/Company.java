package week3.homework.youtubeEducation;

public class Company extends Customer{
    private String companyName;
    private int taxNum;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getTaxNum() {
        return taxNum;
    }

    public void setTaxNum(int taxNum) {
        this.taxNum = taxNum;
    }
}
