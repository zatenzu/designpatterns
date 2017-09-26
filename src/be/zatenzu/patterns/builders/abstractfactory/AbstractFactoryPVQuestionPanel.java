package be.zatenzu.patterns.builders.abstractfactory;

public class AbstractFactoryPVQuestionPanel extends AbstractFactoryQuestionPanel{

    @Override
    public QuestionPanel createQuestionPanel() {
        return new PVQuestionPanel();
    }
}
