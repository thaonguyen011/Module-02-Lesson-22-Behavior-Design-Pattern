package service;

import menu.Command;
import menu.NavigationMenuProfile;
import menu.Navigator;

public class LoginCommand implements Command {
    @Override
    public void execute() {
        // authenticator - logger - navigate menu
        System.out.println("Login");
        Navigator navigationMenuProfile = new NavigationMenuProfile();
        navigationMenuProfile.navigate();
    }
}
