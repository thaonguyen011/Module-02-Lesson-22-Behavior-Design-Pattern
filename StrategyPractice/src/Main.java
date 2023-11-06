import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        StrategySort strategySort1 = new SelectionSort();
        StrategySort strategySort2 = new MergeSort();
        StrategySort strategySort3 = new QuickSort();

        SortedList sortedList = new SortedList(list, strategySort1);
        sortedList.sort();

        sortedList.setStrategySort(strategySort2);
        sortedList.sort();

        sortedList.setStrategySort(strategySort3);
        sortedList.sort();




    }
}