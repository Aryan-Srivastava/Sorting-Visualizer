package sortvisualiser.algorithms;

import sortvisualiser.SortArray;

public class InsertionSort implements ISortAlgorithm {

    private long stepDelay = 1;
    
    @Override
    public void runSort(SortArray array) {
        for (int i = 0; i < array.arraySize(); i++) {
            int key = array.getValue(i);
            int j = i - 1;
            while (j >= 0 && array.getValue(j) > key) {
                array.updateSingle(j + 1, array.getValue(j), 5, true);
                j--;
            }
            array.updateSingle(j + 1, key, getDelay(), true);
        }
    }

    @Override
    public String getName() {
        return "Insertion Sort";
    }

    @Override
    public long getDelay() {
        return stepDelay;
    }

    @Override
    public void setDelay(long delay) {
        this.stepDelay = delay;
    }
}
