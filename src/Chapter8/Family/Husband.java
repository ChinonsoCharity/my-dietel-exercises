package Chapter8.Family;

public class Husband {
    public Wife getIyawo() {
        return iyawo;
    }

    public void setIyawo(Wife iyawo) {
        this.iyawo = iyawo;
    }

    private Wife iyawo;
    public Husband(Wife wife){
        iyawo = wife;
    }
    public void askWifeToCook(String cookWhat){
        System.out.println("Begging my wife to cook");
        iyawo.cook();
            switch(cookWhat){
                case "indomie":
                System.out.println("get lost");
                break;
                default:iyawo.cook();
            }
    }

}
