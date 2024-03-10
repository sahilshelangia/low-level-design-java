package design.patterns.template;

public class MasterSystemDesignStrategy1 extends MasterSystemDesignStrategyTemplate {
    @Override
    protected void chooseProgrammingLanguage() {
        System.out.println("Choose Java");
    }

    @Override
    protected void learnObjectOrientedDesign() {
        System.out.println("Learn from GFG");
    }

    @Override
    protected void chooseBook() {
        System.out.println("Opt for Head first design pattern");
    }

    @Override
    protected void practiceProblem() {
        System.out.println("Practice problems on GFG");
    }
}
