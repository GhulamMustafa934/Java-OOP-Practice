import java.util.Scanner;

abstract class Player {

    String name;

    abstract void setName(String str);

    String getName() {
        return name;
    }
}

class FootballPlayer extends Player {

    @Override
    void setName(String str) {
        name = str;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        FootballPlayer player = new FootballPlayer();

        System.out.print("Enter football player name: ");
        String name = input.nextLine();

        player.setName(name);

        System.out.println("Football player name is: " + player.getName());

        input.close();
    }
}