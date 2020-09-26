public class Snakeladder{
	public static void main(String[] args) {
		System.out.println("Game starts at position 0");
		int num=Snakeladderuc2();
		
	}
	public static double Snakeladderuc2()
	{
		int num =(int)( Math.floor(Math.random() * 10) % 7);
		return num;
	}
	
}
