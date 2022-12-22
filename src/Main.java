public class Main {
    public static void main(String[] args) {
        System.out.println(solution(13));
    }

    @SuppressWarnings("SameParameterValue")
    static int solution(int n) {
        return (((n & 0xAAAAAAAA) >> 1) | ((n & 0x55555555) << 1));
    }
}
