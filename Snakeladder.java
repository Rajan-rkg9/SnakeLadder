public class Snakeladder{
	public static int position = 0;
	public static void main(String[] args) {
		System.out.println("Game starts at position 0");
		
		
	}
	public static double Snakeladderuc2()
	{
		int num =(int)( Math.floor(Math.random() * 10) % 7);
		return num;
	}
		
	public static void Snakeladderuc3()
	{
		int outcome = Snakeladderuc2();
		int chance =(int)( Math.floor(Math.random() * 10) % 3);
		
		/* 0 - not play  1 -ladder 2 - snake */
		
		if (check == 1)
			position = position + chance;
		else if (check == 2)
			position = position - chance;
	}
	
}
