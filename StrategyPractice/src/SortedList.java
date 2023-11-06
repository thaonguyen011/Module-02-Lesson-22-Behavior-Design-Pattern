import java.util.ArrayList;
import java.util.List;

public class SortedList {
    private List<String> items = new ArrayList<>();
    private StrategySort strategySort;

    public SortedList(List<String> items, StrategySort strategySort) {
        this.items = items;
        this.strategySort = strategySort;
    }

    public StrategySort getStrategySort() {
        return strategySort;
    }

    public void setStrategySort(StrategySort strategySort) {
        this.strategySort = strategySort;
    }
    public void sort() {
        strategySort.sort(items);
    }

    public void add(String item) {
        items.add(item);
    }
}
