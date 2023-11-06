import java.util.List;

public class MainMenu extends Menu{
    List<MenuItem> menu;

    public MainMenu(List<MenuItem> menu) {
        super(menu);
    }

    @Override
    void display() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i+1) + ". " + menu.get(i).getName());
        }
    }

    @Override
    public boolean find(String name) {
        for (MenuItem item : menu) {
            if (item.getName().equals(name)) return true;
        }
        return false;
    }

    public void runCommand(int index) {
        if (index >= 0 && index < menu.size()) {
            menu.get(index).getCommand().execute();
        } else {
            throw new IndexOutOfBoundsException("index " + index + " out of menu");
        }
    }
}
