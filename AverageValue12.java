import java.util.Scanner;
public class AverageValue12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        
        int j = 1, i = 1;
        float nilai, totalNilai, rataNilai, nilaiMhs;
        

            i = 1;
            while (i <= 5) {
                totalNilai = 0;
                System.out.println("Input Nilai Mahasiswa ke-" + i);
                for (j=1; j <= 5; j++) {
                    System.out.print("Nilai ke-" +j + " = ");
                    nilaiMhs = input12.nextInt();
                    totalNilai += nilaiMhs;
                } 

    
                rataNilai = totalNilai/5;
                System.out.println("Rata-rata Nilai Mahasiswa ke-" + i + " adalah " + rataNilai);
           
            i++;
            } 
        }
    }
    

