package service;

import menu.Command;

public class UserProfileCommand implements Command {
    @Override
    public void execute() {
        System.out.println("This is a user profile");
    }
}
