public class Main {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        VictorianChair victorianChair = chairFactory.createVictorianChair();
        MagicChair magicChair = chairFactory.createMagicChair();
        FunctionalChair functionalChair = chairFactory.createFunctionalChair();
        System.out.println("VictorianChair: " + victorianChair);
        System.out.println("MagicChair: " + magicChair);
        System.out.println("FunctionalChair: " + functionalChair);
        magicChair.doMagic();

        Client client = new Client();

        client.setChair(victorianChair);
        client.sit();

        client.setChair(magicChair);
        client.sit();

        client.setChair(functionalChair);
        client.sit();
    }
}