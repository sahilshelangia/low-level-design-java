package design.patterns.template;

public abstract class MasterSystemDesignStrategyTemplate {
    protected abstract void chooseProgrammingLanguage();
    protected abstract void learnObjectOrientedDesign();
    protected abstract void chooseBook();
    protected abstract void practiceProblem();

    public final void masterSystemDesign(){
        this.chooseProgrammingLanguage();
        this.learnObjectOrientedDesign();
        this.chooseBook();
        this.practiceProblem();
    }
}
