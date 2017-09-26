package be.zatenzu.patterns.builders.abstractfactory;

public class Client {

    public static void main(String[] args) {
        AbstractFactoryQuestionPanel factory = AbstractFactoryQuestionPanel.getFactory(new Question());
        QuestionPanel questionPanel = factory.createQuestionPanel();
    }

}
