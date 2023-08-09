import java.util.Scanner;

public class suhu {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Celcius");
        double x = input.nextDouble();

        System.out.println("Pilih opsi: ");
        System.out.println("1. Farenheit ");
        System.out.println("2. Kelvin ");
        System.out.println("3. Reamur ");

        int opsi = input.nextInt();
        

        if(opsi == 1){
            double F = (x * 9/5) + 32;
            System.out.println(x + " Adalah " + F);
        }

        else if(opsi == 2){
            double K = (x + 273);
            System.out.println(x + " Adalah " + K);

        } 

        else if (opsi == 3){
            double R = (x * 4/5);
            System.out.println(x + " Adalah " + R);
        }

        else{
            System.out.println("Opsi tidak valid");

        }
    }
    
}
