package binarySearch;

//1. Tìm index của số đầu tiên nhỏ hơn số cần tìm
//2. Tìm index của số đầu tiên lớn hơn số cần tìm
public class binarySearch2{
    public static int binarySearchFirstSmaller(int[] a, int left, int right, int x) { //x is target number
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (x == a[mid]) {
                if (mid==0) return -1;
                if (a[mid - 1] == a[mid]) {
                    right = mid - 1;
                } else return mid-1;

            }
            else if (x < a[mid]) {
                right = mid - 1;
            }
            else if (x>a[mid]){
                left = mid + 1;
            }
        }

        return -1;
    }
    public static int binarySearchFirstBigger(int[] a, int left, int right, int x) { //x is target number
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (x == a[mid]) {
                if (mid==a.length-1) return -1;
                if (a[mid+1]==a[mid]) {
                    left = mid + 1;
                }
                else return mid+1;
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
        int[] a= {1,2,3,4,4,4,5,6};
        binarySearch2 b = new binarySearch2();
        int resFirstSmaller=b.binarySearchFirstSmaller(a,0, a.length-1, 6);
        System.out.println(resFirstSmaller);
        int resFirstBigger=b.binarySearchFirstBigger(a,0, a.length-1, 6);
        System.out.println(resFirstBigger);


    }
}

