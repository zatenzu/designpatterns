package be.zatenzu.patterns.behavioral.command;

public class LogoutCommand implements Command{

    @Override
    public void execute() {
        System.out.println("Do logout");
    }
}
