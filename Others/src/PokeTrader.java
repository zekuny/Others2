import java.util.Scanner;

public class PokeTrader
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String[] pokeParty = { "PIKACHU", "CHARMELEON", "GEODUDE", "GYARADOS", "BUTTERFREE", "MANKEY" };

		int a;
		int b;

		do
		{
			System.out.println("EXCHANGE POKEMON\n");
			for ( int i=0; i<pokeParty.length; i++ )
				System.out.println("    " + i + ". " + pokeParty[i]);

			System.out.print("\nChoose a Pokemon (or -1 to quit). => ");
			a = keyboard.nextInt();

			if ( a >= 0 )
			{
				System.out.print("Choose a Pokemon to exchange with " + pokeParty[a % pokeParty.length] + ". => ");
				b = keyboard.nextInt();

				System.out.println("\nExchanging " + pokeParty[a % pokeParty.length] + " with " + pokeParty[b % pokeParty.length] + ".\n");

				// add code here to swap the Pokemon in slot a with the Pokemon in slot b
				String tmp = pokeParty[a % pokeParty.length];
				pokeParty[a % pokeParty.length] = pokeParty[b % pokeParty.length];
				pokeParty[b % pokeParty.length] = tmp;
				
			}


		} while ( a >= 0 );

	}



}