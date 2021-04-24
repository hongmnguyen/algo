package binarySearch;

    //problem:
//array la 1,2,3,4,4,4,5,6 va viet method de tim
//        1. index cua so 4 dau tien
//        2. index cua so 4 cuoi cung
    public class binarySearch1 {
        public static int binarySearchFirstIndex(int[] a, int left, int right, int x) { //x is target number
            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (x == a[mid]) {
                    if (mid==0) return mid;
                    if (a[mid - 1] == a[mid]) {
                        right = mid - 1;
                    } else return mid;

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
        public static int binarySearchLastIndex(int[] a, int left, int right, int x) { //x is target number
            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (x == a[mid]) {
                    if (mid==a.length-1) return mid;
                    if (a[mid+1]==a[mid]) {
                        left = mid + 1;
                    }
                    else return mid;
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
            binarySearch1 b= new binarySearch1();
            int resFirst=b.binarySearchFirstIndex(a,0, a.length-1, 4);
            System.out.println(resFirst);
            int resLast=b.binarySearchLastIndex(a,0, a.length-1, 4);
            System.out.println(resLast);


        }
    }


