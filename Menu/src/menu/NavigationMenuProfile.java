package menu;

import service.ExitCommand;
import service.LoginCommand;
import service.UserProfileCommand;

import java.util.Scanner;

public class NavigationMenuProfile implements Navigator{
    private final Scanner SCANNER = new Scanner(System.in);
    private void navigationProfile() {
        Menu menuProfile = new MenuMain();
        menuProfile.addMenuItem(new MenuItem("Exit", new ExitCommand()));
        menuProfile.addMenuItem(new MenuItem("User profile", new UserProfileCommand()));
        int choice;
        do{
            menuProfile.display();
            choice = SCANNER.nextInt();
            menuProfile.runCommand(choice);
        } while (choice != 0);
    }


    @Override
    public void navigate() {
        navigationProfile();
    }
}
