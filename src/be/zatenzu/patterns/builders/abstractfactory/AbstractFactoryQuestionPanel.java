package be.zatenzu.patterns.builders.abstractfactory;

public abstract class AbstractFactoryQuestionPanel {

    public static AbstractFactoryQuestionPanel getFactory(Question question){
        //depend of question type
        return new AbstractFactorySignalQuestionPanel();
    }

    public abstract QuestionPanel createQuestionPanel();
}
