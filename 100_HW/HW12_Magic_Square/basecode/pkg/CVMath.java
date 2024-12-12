package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}

    public static void specialSquare(int n) {
        int count = 0;
        int num = 1;

        while (count < n) {
            if (isPerfectSquare(num) && isSumOfConsecutive(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    private static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    private static boolean isSumOfConsecutive(int num) {
        int sum = 0;
        for (int i = 1; sum < num; i++) {
            sum += i;
            if (sum == num) {
                return true;
            }
        }
        return false;
    }
}