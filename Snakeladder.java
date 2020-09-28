public class Snakeladder{
	public static int position = 0;
        public static int  position_a=0;
        public static int position_b=0;
	public static void main(String[] args) {
		System.out.println("Game starts at position 0");
	


		twoPlayer();
		
	}
	public static double Snakeladderuc2()
	{
		int num =(int)( Math.floor(Math.random() * 10) % 7);
		return num;
	}
		
	public static int Snakeladderuc3()
	{
		int outcome = Snakeladderuc2();
		int option =(int)( Math.floor(Math.random() * 10) % 3);
		
		/* OPTION  --  0 - not play  1 -ladder 2 - snake */
		
		if (option == 1)
			position = position + outcome;
		else if (option == 2)
			position = position - outcome;

                return  position;

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

	}
	public static void twoPlayer() {
		int term = 2; int check = 0;
		System.out.println("Snake and Ladder game played with two players starting at position 0");
		while(position_a < 100 && position_b < 100) {
			int turn = term % 2;
			if (turn == 0) {
				term++;
				do {
					System.out.println("Player A at " + position_a);
					position = position_a;
					check = Snakeladderuc3();
					position_a = position;
				}while(check == 1 && position_a != 100);
			}
			
			else {
				term++;
				do {
					System.out.println("Player B at " + position_b);
					position = position_b;
					check = Snakeladderuc3();
					position_b = position;
				}while(check == 1 && position_b != 100);
			}
		}
		if (position_a == 100)
			System.out.println("Player A won !!!");
		else
			System.out.println("Player B won !!!");
	}
}
