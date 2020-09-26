public class Snakeladder{
	public static int position = 0;
	public static void main(String[] args) {
		System.out.println("Game starts at position 0");
		


		int position=Snakeladderuc4();
		
	}
	public static double Snakeladderuc2()
	{
		int num =(int)( Math.floor(Math.random() * 10) % 7);
		return num;
	}
		
	public static void Snakeladderuc3()
	{
		int outcome = Snakeladderuc2();
		int option =(int)( Math.floor(Math.random() * 10) % 3);
		
		/* OPTION  --  0 - not play  1 -ladder 2 - snake */
		
		if (option == 1)
			position = position + outcome;
		else if (option == 2)
			position = position - outcome;

                return position;
	}
       public static int Snakeladderuc4()
	{
		while (position != 100)
		{
			int pos = Snakeladderuc3();
			if (pos<0)
				position = 0;
				
		}
		return position;
>>>>>>> uc4
	}
}
