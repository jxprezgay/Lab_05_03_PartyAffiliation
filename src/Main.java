public class Main
{
    public static void main(String[] args)
    {
        String party = "o";

        System.out.println("What is your party affiliation[(D)emocrat,(R)epublican,(I)ndependent,(O)ther]: ");

        if (party.equalsIgnoreCase("D")){
            System.out.println("You get a Democratic Donkey.");
        } else if (party.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (party.equalsIgnoreCase("I")) {
            System.out.println("You get a Independent Person.");
        } else {
            System.out.println("You chose a different party.");
        }
    }
}