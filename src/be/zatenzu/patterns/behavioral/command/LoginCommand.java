package be.zatenzu.patterns.behavioral.command;

public class LoginCommand implements Command{

    @Override
    public void execute() {
        System.out.println("Do login");
    }
}
