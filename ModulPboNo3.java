package ModulPbo;
import java.util.Scanner;
public class ModulPboNo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int tahun=0;
		System.out.println("Input Tahun : ");
		tahun= input.nextInt();
		
		if(tahun >=1900 && tahun <=2020 )
		{
			if(tahun%4==0)
			{
				System.out.println("Tahun "+tahun+" adalah Tahun Kabisat");
			}
			else
			{
				System.out.println("Tahun "+tahun+" Bukan Tahun Kabisat");
			}
		}
		else if( tahun < 1900)
		{
			System.out.println("Input tahun di bawah 1900");
		}
		else
		{
			System.out.println("Input tahun melebihi 2020");			
		}
	}
}