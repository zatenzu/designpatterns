package be.zatenzu.patterns.builders.abstractfactory;

public class AbstractFactorySignalQuestionPanel extends AbstractFactoryQuestionPanel{

    @Override
    public QuestionPanel createQuestionPanel() {
        return new SignalQuestionPanel();
    }
}
