package be.zatenzu.patterns.behavioral.command;

public class QueryCommand implements Command{

    @Override
    public void execute() {
        System.out.println("Do query");
    }
}
