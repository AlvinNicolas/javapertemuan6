import java.util.Scanner;

public class Main {

    public static int devide (int num1, int num2)
    {
        if (num2 == 0)
        {
            throw new ArithmeticException("Tidak dapat melakukan pembagian");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        try {
            // Potensial untuk menghasilkan eksepsi
            int hasilPembagian = devide(10, 2);
            System.out.println("Hasil pembagian: " + hasilPembagian);
        } catch (ArithmeticException e) {
            // Menangani eksepsi jika terjadi ArithmeticException (pembagian oleh nol)
            System.out.println("Terjadi kesalahan aritmatika: " + e.getMessage());
        } finally {
            // Blok finally akan selalu dieksekusi, baik eksepsi terjadi atau tidak
            System.out.println("Selesai.");
        }

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan gaji bulanan: ");
            double gaji = input.nextDouble();

            if (gaji < 0) {
                throw new IllegalArgumentException("Gaji tidak boleh negatif.");
            }

            double gajiTahunan = gaji * 12;
            System.out.println("Gaji tahunan: " + gajiTahunan);
        } catch (java.util.InputMismatchException e)

        {
            System.out.println("Input yang Anda masukkan tidak valid.");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
        finally {
            input.close();
            System.out.println("Program selesai.");
        }

        //Notes yee :
        /*
        * Wajib ada TRY CATCH
        *Throw buat lempar massage kalo error
        * Checked Exception: IOException, FileNotFoundException, SQLException, ParseException, ClassNotFoundException, dll.
          Unchecked Exception: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, IllegalArgumentException, RuntimeException, dll.
        *
        * */

    }

}