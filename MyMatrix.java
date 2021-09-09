import java.util.Scanner;

public class MyMatrix {
    private int row, col;
    private double x[][];
    Scanner input = new Scanner(System.in);

    public MyMatrix(int _row, int _col) {
        row = _row;
        col = _col;
        x = new double[row][col];
    }

    public void setSize(int _row, int _col) {
        row = _row;
        col = _col;
        x = new double[row][col];
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public double element(int r, int c) {
        return x[r][c];
    }

    public void read() {

        int r, c;
        for (r = 0; r < row; r++) {
            for (c = 0; c < col; c++) {
                System.out.print("Baris:" + " " + r + " Kolom:" + " " + c + ": ");
                x[r][c] = input.nextDouble();
            }
        }
    }

    public void write() {
        int r, c;
        for (r = 0; r < row; r++) {
            for (c = 0; c < col; c++) {
                for (c = 0; c < col; c++)
                    System.out.print("" + x[r][c] + "");
                System.out.println("");
            }
        }
    }

    public void add(MyMatrix m1, MyMatrix m2) {
        int r, c;
        setSize(m1.getRow(), m1.getCol());
        System.out.println(m1);
        System.out.println(m2);


        // for (r = 0; r < row; r++) {
        //     for (c = 0; c < col; c++) {
        //         x[r][c] = m1.element(r, c) + m2.element(r, c);
        //         System.out.print(x[r][c] + "");
        //     }
        //     System.out.println();
        // }
    }

    public void perkalian(MyMatrix m1, MyMatrix m2) {
        int r, c;
        setSize(m1.getRow(), m1.getCol());

        for (r = 0; r < row; r++) {
            for (c = 0; c < col; c++) {
                x[r][c] = m1.element(r, c) * m2.element(r, c);
                System.out.print(x[r][c] + "");
            }
            System.out.println();
        }
    }

    public void pengurangan(MyMatrix m1, MyMatrix m2) {
        int r, c;
        setSize(m1.getRow(), m1.getCol());

        for (r = 0; r < row; r++) {
            for (c = 0; c < col; c++) {
                x[r][c] = m1.element(r, c) - m2.element(r, c);
                System.out.print(x[r][c] + "");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x, y;
        System.out.println("Tentukan Determinan Matrik: A");
        System.out.print("Matrik A: ");
        x = keyboard.nextInt();
        System.out.println("Tentukan Determinan Matrik: B");
        System.out.print("Matrik B: ");
        y = keyboard.nextInt();
        MyMatrix a = new MyMatrix(x,y);
        System.out.println("Input Matriks A");
        a.read();
        System.out.println("Matriks A");
        a.write();
        MyMatrix b = new MyMatrix(2, 2); // ini matriks ordo 2×2
        System.out.println("Input Matriks B");
        b.read();
        System.out.println("Matriks B");
        b.write();
        MyMatrix c = new MyMatrix(2, 2);
        System.out.println("Hasil Penjumlahan Matriks A dan B");
        c.add(a, b);
        MyMatrix d = new MyMatrix(2, 2);
        System.out.println("Hasil Perkalian Matriks A dan B");
        // d.perkalian(a, b);
        MyMatrix E = new MyMatrix(2, 2);
        System.out.println("Hasil Pengurangan2 Matriks A dan B");
        // E.pengurangan(a, b);
    }

}
// Wiman
// String list=[{"nama":"Asep"},2,3];
// for 
// list[0]