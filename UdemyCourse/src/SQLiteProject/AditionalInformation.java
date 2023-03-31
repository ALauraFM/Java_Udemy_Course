package SQLiteProject;

public class AditionalInformation {

    private int residencialPhone;
    private int comercialPhone;
    private int personalCellPhone;
    private int comercialCellPhone;
    private String personalEmail;
    private String comercialEmail;
    private String site;
    private boolean haveComercialWhatsapp;

    public int getResidencialPhone() {
        return residencialPhone;
    }

    public void setResidencialPhone(int residencialPhone) {
        this.residencialPhone = residencialPhone;
    }

    public int getComercialPhone() {
        return comercialPhone;
    }

    public void setComercialPhone(int comercialPhone) {
        this.comercialPhone = comercialPhone;
    }

    public int getPersonalCellPhone() {
        return personalCellPhone;
    }

    public void setPersonalCellPhone(int personalCellPhone) {
        this.personalCellPhone = personalCellPhone;
    }

    public int getComercialCellPhone() {
        return comercialCellPhone;
    }

    public void setComercialCellPhone(int comercialCellPhone) {
        this.comercialCellPhone = comercialCellPhone;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getComercialEmail() {
        return comercialEmail;
    }

    public void setComercialEmail(String comercialEmail) {
        this.comercialEmail = comercialEmail;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public boolean isHaveComercialWhatsapp() {
        return haveComercialWhatsapp;
    }

    public void setHaveComercialWhatsapp(boolean haveComercialWhatsapp) {
        this.haveComercialWhatsapp = haveComercialWhatsapp;
    }
}
