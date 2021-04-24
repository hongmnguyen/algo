package binarySearch;

public class binarySearchTemplate {
        public static int binarySearch(int[] a, int left, int right, int x) { //x is target number
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (x == a[mid]) {
                return mid;

            }
            if (x < a[mid]) {
                right = mid - 1;
            }
            if (x>a[mid]){
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a= {4,5,6};
        binarySearchTemplate b = new binarySearchTemplate();
        int res=b.binarySearch(a,0, a.length-1, 4);
        System.out.println(res);


    }
}


