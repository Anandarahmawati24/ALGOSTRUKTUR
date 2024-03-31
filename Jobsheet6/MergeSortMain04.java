public class MergeSortMain04 {
public static void main(String[] args) {
    int data [] = {10,40,30,50,70,20,100,90};
    System.out.println("sorting dengan merge sort");
    MergeSorting04 mSort = new MergeSorting04();
    System.out.println("data awal");
    mSort.printArray(data);
    mSort.MergeSort(data);
    System.out.println("setelah diurutkan");
    mSort.printArray(data);
}
}