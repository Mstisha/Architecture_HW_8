package Model;

public class ITablesModel {
    public interface ITablesModel {
        boolean bookTable(int hallNumber, int tableNumber);
        boolean releaseTable(int hallNumber, int tableNumber);
        String[][] getTablesStatus();
    }
}
