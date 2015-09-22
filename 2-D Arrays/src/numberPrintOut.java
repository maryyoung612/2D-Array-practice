import java.util.Scanner;
public class numberPrintOut
	{
		static long littleNum;
		static int bigNum;
		public static void main(String[] args)
			{
			Scanner userInput= new Scanner(System.in);
			System.out.println("Please enter how may rows you would like in your array");
			int uRow = userInput.nextInt();
			System.out.println("Please enter how may colums you would like in your array");
			int uCol = userInput.nextInt();
			
			int myArray[][]= new int[uRow][uCol];
			littleNum=Integer.MAX_VALUE;
			bigNum= myArray[0][0];
			
			for(int row=0;row<myArray.length;row++)
				{
				for(int col=0;col<myArray[0].length;col++)
					{
					int random = (int)(Math.random()*90)+10;
					myArray[row][col]=random;
					if(littleNum>myArray[row][col])
						{
						littleNum=myArray[row][col];
						}
					if(bigNum<myArray[row][col])
						{
						bigNum=myArray[row][col];	
						}
					System.out.print(myArray[row][col]+" ");
					
					}
				System.out.println();
				}
			System.out.println("The bigest number is " +bigNum);
			System.out.println("The smallest number is "+littleNum);
			}
	}