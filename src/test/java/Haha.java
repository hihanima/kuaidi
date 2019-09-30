
public class Haha {
    public static void main(String[] args){
        int[] arr = {2,1,4,5,8,3,7,6};
        sort(arr,0,arr.length-1);
        for (int a:arr
             ) {
            System.out.println(a);
        }
    }
    public static void sort(int[] arr, int L, int R) {
        if(L == R) {
            return;
        }
        int mid = L + ((R - L) >> 1);
        sort(arr, L, mid);
        sort(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }
    public static void merge(int[] arr, int L, int mid, int R) {
        int[] temp = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        while(p1 <= mid && p2 <= R) {
            temp[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while(p1 <= mid) {
            temp[i++] = arr[p1++];
        }
        while(p2 <= R) {
            temp[i++] = arr[p2++];
        }
        for(i = 0; i < temp.length; i++) {
            arr[L + i] = temp[i];
        }
    }
}
