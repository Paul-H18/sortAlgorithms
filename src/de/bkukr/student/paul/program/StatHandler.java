package de.bkukr.student.paul.program;

import de.bkukr.student.paul.basic.algorithms.*;

public class StatHandler {
    SelectionSort selectionSort;
    InsertionSort insertionSort;
    BubbleSort bubbleSort;

    public StatHandler(SelectionSort selSort, InsertionSort insertSort, BubbleSort bSort) {
        selectionSort = selSort;
        insertionSort = insertSort;
        bubbleSort = bSort;
    }

    private long[] selSortTime = new long[10];
    private long[] insertSortTime = new long[10];
    private long[] bleSortTime = new long[10];

    private long[] selSortSwitches = new long[10];
    private long[] insertSortSwitches = new long[10];
    private long[] bleSortSwitches = new long[10];

    private long[] selSortComparisons = new long[10];
    private long[] insertSortComparisons = new long[10];
    private long[] bleSortComparisons = new long[10];


    public void refreshStats(int number) {
        selSortTime[number] = selectionSort.getNeededTime();
        insertSortTime[number] = insertionSort.getNeededTime();
        bleSortTime[number] = bubbleSort.getNeededTime();

        selSortSwitches[number] = selectionSort.getAmountSwitches();
        insertSortSwitches[number] = insertionSort.getAmountSwitches();
        bleSortSwitches[number] = bubbleSort.getAmountSwitches();

        selSortComparisons[number] = selectionSort.getAmountComparisons();
        insertSortComparisons[number] = insertionSort.getAmountComparisons();
        bleSortComparisons[number] = bubbleSort.getAmountComparisions();
    }

    public long getMeanSelectionSortTime() {
        return Calculations.mean(selSortTime);
    }

    public long getMeanInsertionSortTime() {
        return Calculations.mean(insertSortTime);
    }

    public long getMeanBubbleSortTime() {
        return Calculations.mean(bleSortTime);
    }

    public long getMeanSelectionSortSwitches() {
        return Calculations.mean(selSortSwitches);
    }

    public long getMeanInsertionSortSwitches() {
        return Calculations.mean(insertSortSwitches);
    }

    public long getMeanBubbleSortSwitches() {
        return Calculations.mean(bleSortSwitches);
    }

    public long getMeanSelectionSortSComparisons() {
        return Calculations.mean(bleSortSwitches);
    }

    public long getMeanInsertionSortSComparisons() {
        return Calculations.mean(bleSortSwitches);
    }

    public long getMeanBubbleSortComparisons() {
        return Calculations.mean(bleSortSwitches);
    }

}
