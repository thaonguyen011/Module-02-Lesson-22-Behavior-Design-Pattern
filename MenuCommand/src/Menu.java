import java.util.List;

public abstract class Menu<E> {
    private final List<E> menu;

    public Menu(List<E> menu) {
        this.menu = menu;
    }

     abstract void display();

    public void add(E item){
        menu.add(item);
    }

    public void remove(E item){
        menu.remove(item);
    }

    public E get(int index) {
        return menu.get(index);
    }

    public abstract boolean find(String name);

}
