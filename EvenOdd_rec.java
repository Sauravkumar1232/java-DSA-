public class EvenOdd_rec {

    static int[] evenodd(int num, int count) {
        if (num == 0) {
            System.out.println("count is " + count);
            return new int[2];

        }
        int arr[] = evenodd(num / 10, count + 1);
        if (count % 2 == 0) {
            arr[0] = arr[0] + num % 10;
        } else {
            arr[1] = arr[1] + num % 10;
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = evenodd(87564, 0);
        System.out.println("odd sum " + arr[0]);
        System.out.println("even sum " + arr[1]);
    }
}
