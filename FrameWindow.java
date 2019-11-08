package Quora;

public class FrameWindow {
    public static void frameWindow(int n) {
        int m = n;
        for (int row = 0; row<n; row++) {
            if (row==0 || row==n-1) {
                for (int i=0; i<m; i++) {
                    System.out.print('*');
                }
                System.out.println();
                continue;
            }
            for (int col=0; col<n; col++) {
                if (col==0 || col == n-1)
                    System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        frameWindow(10);
    }
}
