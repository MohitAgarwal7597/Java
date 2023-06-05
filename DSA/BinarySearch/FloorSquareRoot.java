//find square root if perfect square doesn't exists than return floor value.
package DSA.BinarySearch;

public class FloorSquareRoot {
    public static void main(String[] args) {
        int ans = floorSquareRoot(100);
        System.out.println(ans);
    }

    public static int floorSquareRoot(int num) {
        int start = 0;
        int end = num;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            double square = mid * mid;
            if(square == num){
                return mid;
            }
            else if (square > num) {
                end = mid - 1;
            }else{
                result = mid;
                start = mid + 1;
            }
        }
        return result;
    }

}
