package binarySearch;

//1. Tìm index của số đầu tiên nhỏ hơn số cần tìm. neu so can tim ko nam trong array, van tra ve so dau tien nho hon
//2. Tìm index của số đầu tiên lớn hơn số cần tìm. neu so can tim ko nam trong array, van tra ve so dau tien lon hon
public class binarySearch2{
    public static int binarySearchFirstSmaller(int[] a, int left, int right, int x) { //x is target number
        int mid=0;
        while (left <= right) {
            mid = left + (right - left) / 2;

            if (x == a[mid]) {
                if (mid==0) return mid;

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

        return (mid==a.length-1?mid-1:mid);
    }
    public static int binarySearchFirstBigger(int[] a, int left, int right, int x) { //x is target number
        int mid=0;
        while (left <= right) {
            mid = left + (right - left) / 2;

            if (x == a[mid]) {
                if (mid==a.length-1) return mid;

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
        return (mid==0? mid+1: mid);
    }

    public static void main(String[] args) {
        int[] a= {1,3,3,4,4,4,6,8};
        binarySearch2 b = new binarySearch2();
        int resFirstSmaller=b.binarySearchFirstSmaller(a,0, a.length-1, 4);
        System.out.println(resFirstSmaller);
        int resFirstBigger=b.binarySearchFirstBigger(a,0, a.length-1, 4);
        System.out.println(resFirstBigger);


    }
}

