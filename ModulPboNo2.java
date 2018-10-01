package ModulPbo;
import java.util.Scanner;
public class ModulPboNo2{
	public static void main(String[]args){
		Scanner input = new Scanner (System.in);
		int bil=0, pangkat=0;
		float hasil=1;
		System.out.println("Masukkan Bilangan : ");
		bil=input.nextInt();
		System.out.println("Masukkan Pangkat : ");
		pangkat = input.nextInt();
		
		if(pangkat>0)
		{
			for(int i=0;i<pangkat;i++)
			{
				hasil=hasil*bil;
			}
			System.out.println("Hasil dari "+bil +"pangkat "+pangkat +":"+hasil);
		}
		else if(pangkat<0)
		{
			for(int i=pangkat; i<0;i++)
			{
				hasil=hasil*bil;
			}
			float hasill=(1/hasil);
			System.out.println("Hasil dari "+bil +"pangkat "+pangkat +":"+hasill);
		}
		else
		{
			System.out.println("Hasil dari "+bil +"pangkat "+pangkat +":"+hasil);
		}
		
	}
}

