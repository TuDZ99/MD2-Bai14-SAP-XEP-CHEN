public class InsertionSort {
    void sort(int[] list){
        for (int i = 1; i < list.length; i++) {
            int aoi = list[i];
            int j;
            for (j = i -1;j >= 0 && list[j] > aoi; j--){
                list[j+1] = list[j];
            }
            list[j+1] = aoi;
        }
    }
    static void printList(int []list){
        int n = list.length;;
        for (int i = 0; i < n; i++) {
            System.out.println(list[i] + " ");

            System.out.println();

        }
    }

    public static void main(String[] args) {
        int list[] = {9,4,7,2,6,3};
        System.out.println("mang ban dau: ");
        printList(list);
        InsertionSort is = new InsertionSort();
        is.sort(list);
        System.out.println("mang sau khi chen: ");
        printList(list);
    }
}
