package design.patterns.template;

public class MasterSystemDesignStrategy2 extends MasterSystemDesignStrategyTemplate {
    @Override
    protected void chooseProgrammingLanguage() {
        System.out.println("Learn GoLang");
    }

    @Override
    protected void learnObjectOrientedDesign() {
        System.out.println("Tryout interview bit");
    }

    @Override
    protected void chooseBook() {
        System.out.println("Opt for Gangs of four");
    }

    @Override
    protected void practiceProblem() {
        System.out.println("Tryout interview ready");
    }

}
