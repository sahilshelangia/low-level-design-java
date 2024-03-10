package design.patterns.template;

public class Main {
    public static void main(String[] args) {

        MasterSystemDesignStrategyTemplate masterSystemDesignStrategyTemplate = new MasterSystemDesignStrategy1();
        masterSystemDesignStrategyTemplate.masterSystemDesign();

        MasterSystemDesignStrategyTemplate masterSystemDesignStrategyTemplate2 = new MasterSystemDesignStrategy2();
        masterSystemDesignStrategyTemplate2.masterSystemDesign();
    }
}
