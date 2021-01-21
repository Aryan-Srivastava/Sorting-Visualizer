package sortvisualiser.algorithms;

import sortvisualiser.SortArray;

public interface ISortAlgorithm {
    public String getName();

    public long getDelay();

    public void setDelay(long delay);

    public void runSort(SortArray array);
}
