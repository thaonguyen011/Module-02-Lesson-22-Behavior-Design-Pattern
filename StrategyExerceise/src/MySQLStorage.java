public class MySQLStorage implements UserStorage{
    @Override
    public void store() {
        System.out.println("Store at MySQL Storage");
    }
}
