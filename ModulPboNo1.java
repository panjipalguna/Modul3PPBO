package ModulPbo;
import java.util.Scanner;
public class ModulPboNo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inpt = new Scanner (System.in);
		int n, nilai[];
		float rata, jumlah = 0;
		
		System.out.println("Masukkan banyak data :");
		n=inpt.nextInt();
		
		nilai= new int[n];
		
		if(n<=10)
		{
			for(int i=0;i<=n-1;i++){
				System.out.print("Nilai " +  (i+1)  + ":");
				nilai[i]=inpt.nextInt();
				System.out.println();
			}
		}
			else
			{
				System.out.print("Banyak Data Maksimal 10");
			}
			for(int j=0; j<=n-1; j++){
				jumlah=jumlah+nilai[j];
			}
			rata=jumlah/n;
			System.out.println("Nilai rata-rata:"+rata);
		}
		
		

	}
