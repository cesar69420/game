import java.util.*;
public class game{
	public static Scanner input = new Scanner(System.in);
	public static String[] backpack = new String[5];
	public static int lifeYears = 100;
	public static String move;
	public static void main(String[] args) {
		System.out.println("You ready start your adventure and you are gonna start with 100 hearts");
		System.out.println("");
		if(lifeYears==0) {
			System.out.println("GAME OVER");
		}
		String response = input.nextLine();
		if(response.equals("yes")) {
			System.out.println("Then let's get our things ready");
			input.nextLine();
		}else {
			System.out.println("I'm just waiting on you");
		}

		System.out.println("");
		for (int i = 0; i <5 ;i++) {
			clear();
			System.out.println("What are you gonna put in your backpack? ");
			System.out.println(" - tent ");
			System.out.println(" - knife ");
			System.out.println(" - axe ");
			System.out.println(" - lighter ");
			System.out.println(" - food ");
			System.out.println(" - cantine ");
			backpack[i] = input.nextLine();
		}
		System.out.println("Alright you have your backpack filled how are you gonna leave the house?");
		System.out.println(" 1 - you can leave without telling your parents");
		System.out.println(" 2 - Or you can chose to tell your parents");
		int nextstep = input.nextInt();
		switch(nextstep) {
		case 1: System.out.println("I like the way you think");
		break;
		case 2: System.out.println("You should have gone without saying anything");
		break;
		}
		System.out.println("Are you sure you want to go on this adventure because once you leave there aint going back until you finish? ");
		String response2 = input.next();
		if(response2.equals("yes")) {
			System.out.println("Bet say less let's gooooo");
		}else {
			System.out.println("Dang I though you where a real one ");
		}
		System.out.println("Alright we have successfully left the house yay ");
		System.out.println("");
		System.out.println("it looks like we ran into our frist problem the left lane is leads to somewhere where you have been before but the right one is a mystery which one do you want to take ?");
		String response3 = input.next();
		if(response3.equals("left")) {
			System.out.println("Come on I though we are going on an adventure ");
		}else {
			System.out.println("Yeah you know what a adventure is about");
		}
		System.out.println("");
		System.out.println("Something is off we see tracks on the ground do we follow it or just ignor it? ");
		String response4 = input.next();
		if(response4.equals("yes")) {
			System.out.println("It looks like we found ourselves a bear what do we do?");
			System.out.println("1: we can try to scare the bear, 2: We can try to run away");
		}
		int nextstep2 = input.nextInt();
		switch(nextstep2) {
		case 1:int lifeYears = 0;
		break;
		case 2:
		break;
		}
	}



	/*for (int i = 0; i <5 ;i++) {
if(backpack[i].equals(object)) {
backpack[i] = null;
}
}*/
	public static void clear() {
		for(int i = 0; i <5; i++) {
			System.out.println();
		}
	}
}