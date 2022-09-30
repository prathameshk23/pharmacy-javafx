package Models;

public class DrugList {

    private static Drug painEeze = new Drug("Pain-eeze", 2022, 300,"Eeze relieves pain and reduces inflammation.",2);

    private static Drug amoxy = new Drug("Amoxicillin", 2025, 600,"Amoxicillin is an antibiotic.",8);

    private static Drug nuroFen = new Drug("Nurofen", 2030, 700,"Nurofen provides effective pain relief.",30);

    public static Drug getPainEeze(){ return painEeze;}
    public static Drug getAmoxy(){ return amoxy;}
    public static Drug getNuroFen(){ return nuroFen;}
}