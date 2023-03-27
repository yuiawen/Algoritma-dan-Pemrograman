import java.util.Scanner;

public class charNilai

{
	public static void main(String args[])
{
Scanner in=new Scanner(System.in);
char nilai;
System.out.print("Masukkan nilaimu (A,B,C,D,E) : ");
nilai = in.next().charAt(0);
switch(nilai)
{
case 'A':
case 'a':
System.out.println("Lulus, Hebat sekali");
break;
case 'B':
System.out.println("Lulus, Hebat ");
break;
case 'C':
System.out.println("Lulus, Belajar lebih rajin");
break;
case 'D':
System.out.println("Lulus, Nilaimu kurang");
break;
case 'E':
System.out.println("Tidak lulus");
break;
default:
System.out.println("Salah masukkan nilai");
break;
		}
	}
}
