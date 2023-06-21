package Chapter8.drills;

public enum Region {
    NN("Ikeja", "Oshogbo", "Yaba"),

    SS("Mary Land","VI","BI"),

    EE("Sungo","Bariga","Makoko"),WW("Ikrondu","Otta","Ekpe");
    private final String[] states;

    Region(String... states) {
    this.states =states;
        System.out.println("I was called");
    }

    public String[] getStates() {
        return states;
    }
}