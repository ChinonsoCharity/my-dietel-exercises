package Chapter8;

import Chapter8.Family.Husband;
import Chapter8.Family.Wife;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HusbandTest {
    @Test
    public void iyawoSnatchingTest(){
        Wife peterWife = new Wife();
       Husband peter = new Husband(peterWife);
       assertEquals(peterWife, peter.getIyawo());

       Wife folaWife = new Wife();
       Husband fola = new Husband(folaWife);

      peter.setIyawo(fola.getIyawo());
      assertEquals(folaWife,peter.getIyawo());
//      peter.getIyawo().cook();

        Wife personWife = peter.getIyawo();
        personWife.cook();
    }
    @Test
    public void dammyWifeCooking(){
        Wife dammyWife = new Wife();
        dammyWife = new Wife();
        Husband dammy = new Husband(dammyWife);
        dammyWife.cook();
        dammyWife.sing();
dammy.askWifeToCook("indomie");
dammy.askWifeToCook("pound yam and Egusi");

    }
}
