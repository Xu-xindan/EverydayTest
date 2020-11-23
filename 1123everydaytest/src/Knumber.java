public class Knumber {
    public int findKth(int[] a, int n, int K) {
        return findKthInternal(a,0,n-1,K);
    }

    public int findKthInternal(int[] a, int left, int right,int K){
        int midindex=partitiondig(a,left,right);//倒序分割
        if (midindex == K-1) {
            return a[midindex];
        } else if (midindex < K-1) {
            return findKthInternal(a,midindex+1,right,K);
        }
        return findKthInternal(a, 0, midindex-1,K);
    }

    private int partitionhover(int[] a,int index1,int index2){
        int leftindex=index1;
        int rightindex=index2;
        int key=a[index1];
        while(leftindex<rightindex) {
            while (rightindex > leftindex && a[rightindex] >= key) {
                rightindex--;
            }
            while (leftindex < rightindex && a[leftindex] < key) {
                leftindex++;
            }
            int t = a[rightindex];
            a[rightindex] = a[leftindex];
            a[leftindex] = t;
        }
        int t=a[leftindex];
        a[leftindex]=a[index1];
        a[index1]=a[leftindex];
        return leftindex;
    }

    private static int partitiondig(int[] num, int low, int high) {
        int tmp = num[low];
        while(low < high){
            while((low < high) && tmp >= num[high])//（1）
                high--;
            num[low] = num[high];
            while((low < high) && tmp <= num[low])//（2）
                low++;
            num[high] = num[low];
        }
        num[low] = tmp;
        return low;
    }
}
