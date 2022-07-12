//function input is calling grade function
package myio;
import java.io.*;
public class percentage{
	static int stud_id=0;
	static int phy=0;
	static int chem=0;
	static int math=0;
	static int comp=0;
	 static int per;
	public static int input()

	{
		try {
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("********************************\nplease enter student id\n*******************************");
		String s1=br.readLine();
	    stud_id=Integer.parseInt(s1);
		System.out.println("Please enter the mark scored in physics");
		String s2=br.readLine();
		phy=Integer.parseInt(s2);
		System.out.println("Please enter the mark scored in chemistry");
		String s3=br.readLine();
		chem=Integer.parseInt(s3);
		System.out.println("Please enter the mark scored in mathematics");
		String s4=br.readLine();
		math=Integer.parseInt(s4);
		System.out.println("Please enter the mark scored in computer");
		String s5=br.readLine();
		comp=Integer.parseInt(s5);
		if(phy<100 && chem<100 && math<100 && comp<100) {
		int per=(phy+chem+math+comp)/4;
		System.out.println("the percentage of id no "+stud_id+" is : "+per+"% and scores ");
		findpercentage(per);
		}
		}catch(Exception e) {
			System.out.println("please enter only values not names");
		}
		return per;
	}
	public static void findpercentage(int per) {
	if(per>90 && per<=100) {
		System.out.println("*****Grade A*****");
	}else if(per>80 && per<=90)
	{
		System.out.println("*****Grade B*****");
	}else if(per>70 && per<=80)
	{
		System.out.println("*****Grade C*****");
	}else if(per>60 && per<=70)
	{
		System.out.println("*****Grade D*****");
	}else {
		System.out.println("*****Grade E*****");
	}
	}

	public static void main(String[] args) {
		input();
		/*try {
			BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
			System.out.println("********************************\nplease enter student id\n*******************************");
			String s1=br.readLine();
		    int stud_id=Integer.parseInt(s1);
			System.out.println("Please enter the mark scored in physics");
			String s2=br.readLine();
			int phy=Integer.parseInt(s2);
			System.out.println("Please enter the mark scored in chemistry");
			String s3=br.readLine();
			int chem=Integer.parseInt(s3);
			System.out.println("Please enter the mark scored in mathematics");
			String s4=br.readLine();
			int math=Integer.parseInt(s4);
			System.out.println("Please enter the mark scored in computer");
			String s5=br.readLine();
			int comp=Integer.parseInt(s5);
			if(phy<100 && chem<100 && math<100 && comp<100) {
			int per=(phy+chem+math+comp)/4;
			System.out.println("the percentage of id no "+stud_id+" is : "+per+"% and scores ");
			*/
			//findpercentage(per);
			
			/*if(per>90 && per<=100) {
				System.out.println("*****Grade A*****");
			}else if(per>80 && per<=90)
			{
				System.out.println("*****Grade B*****");
			}else if(per>70 && per<=80)
			{
				System.out.println("*****Grade C*****");
			}else if(per>60 && per<=70)
			{
				System.out.println("*****Grade D*****");
			}else {
				System.out.println("*****Grade E*****");
			}
			System.out.println("*************************************");
			}
			else {
				System.out.println("Please enter marks less than 100");
			}
			
		}
		catch(Exception e) {
			System.out.println("please enter only values not names");
		}
		
		*/
	}

	
}
