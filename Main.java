import java.util.Random;
import java.util.Map;
import java.util.Scanner;

void main() {
    Map<Integer, Integer> numPrice = new HashMap<>();

    // Tribal Faction

    numPrice.put(1, 70);
    numPrice.put(2, 80);
    numPrice.put(3, 120);
    numPrice.put(4, 160);
    numPrice.put(5, 300);
    numPrice.put(6, 400);
    numPrice.put(7, 2200);

    // Farmer Faction

    numPrice.put(8, 50);
    numPrice.put(9, 80);
    numPrice.put(10, 140);
    numPrice.put(11, 340);
    numPrice.put(12, 500);
    numPrice.put(13, 1000);
    numPrice.put(14, 1200);

    // Medieval Faction

    numPrice.put(15, 60);
    numPrice.put(16, 100);
    numPrice.put(17, 140);
    numPrice.put(18, 180);
    numPrice.put(19, 650);
    numPrice.put(20, 1000);
    numPrice.put(21, 1500);

    // Ancient Faction

    numPrice.put(22, 100);
    numPrice.put(23, 120);
    numPrice.put(24, 180);
    numPrice.put(25, 300);
    numPrice.put(26, 900);
    numPrice.put(27, 1600);
    numPrice.put(28, 2000);

    // Viking Faction

    numPrice.put(29, 90);
    numPrice.put(30, 160);
    numPrice.put(31, 220);
    numPrice.put(32, 250);
    numPrice.put(33, 500);
    numPrice.put(34, 1000);
    numPrice.put(35, 1500);

    // Dynasty Faction

    numPrice.put(36, 140);
    numPrice.put(37, 180);
    numPrice.put(38, 250);
    numPrice.put(39, 500);
    numPrice.put(40, 1000);
    numPrice.put(41, 1500);
    numPrice.put(42, 2000);

    // Renaissance Faction

    numPrice.put(43, 50);
    numPrice.put(44, 150);
    numPrice.put(45, 200);
    numPrice.put(46, 250);
    numPrice.put(47, 400);
    numPrice.put(48, 1000);
    numPrice.put(49, 4000);

    // Pirate Faction

    numPrice.put(50, 100);
    numPrice.put(51, 160);
    numPrice.put(52, 250);
    numPrice.put(53, 300);
    numPrice.put(54, 1000);
    numPrice.put(55, 1500);
    numPrice.put(56, 2500);

    // Spooky Faction

    numPrice.put(57, 80);
    numPrice.put(58, 180);
    numPrice.put(59, 200);
    numPrice.put(60, 200);
    numPrice.put(61, 1000);
    numPrice.put(62, 1000);
    numPrice.put(63, 2500);

    // Wild West Faction

    numPrice.put(64, 100);
    numPrice.put(65, 200);
    numPrice.put(66, 400);
    numPrice.put(67, 650);
    numPrice.put(68, 740);
    numPrice.put(69, 900);
    numPrice.put(70, 1200);

    Map<Integer, String> numName = new HashMap<>();

    // Tribal Faction

    numName.put(1, "Clubber");
    numName.put(2, "Protector");
    numName.put(3, "Spear Thrower");
    numName.put(4, "Stoner");
    numName.put(5, "Bone Mage");
    numName.put(6, "Chieftain");
    numName.put(7, "Mammoth");

    // Farmer Faction

    numName.put(8, "Hobbit");
    numName.put(9, "Farmer");
    numName.put(10, "Hay Baler");
    numName.put(11, "Potion Seller");
    numName.put(12, "Harvester");
    numName.put(13, "Wheelbarrow");
    numName.put(14, "Scarecrow");

    // Medieval Faction

    numName.put(15, "Bard");
    numName.put(16, "Squire");
    numName.put(17, "Archer");
    numName.put(18, "Healer");
    numName.put(19, "Knight");
    numName.put(20, "Catapult");
    numName.put(21, "King");

    // Ancient Faction

    numName.put(22, "Shield Bearer");
    numName.put(23, "Sarissa");
    numName.put(24, "Hoplite");
    numName.put(25, "Snake Archer");
    numName.put(26, "Ballista");
    numName.put(27, "Minotaur");
    numName.put(28, "Zeus");

    // Viking Faction

    numName.put(29, "Headbutter");
    numName.put(30, "Ice Archer");
    numName.put(31, "Brawler");
    numName.put(32, "Berserker");
    numName.put(33, "Valkyrie");
    numName.put(34, "Longship");
    numName.put(35, "Jarl");

    // Dynasty Faction

    numName.put(36, "Samurai");
    numName.put(37, "Firework Archer");
    numName.put(38, "Monk");
    numName.put(39, "Ninja");
    numName.put(40, "Dragon");
    numName.put(41, "Hwacha");
    numName.put(42, "Monkey King");

    // Renaissance Faction

    numName.put(43, "Painter");
    numName.put(44, "Fencer");
    numName.put(45, "Balloon Archer");
    numName.put(46, "Musketeer");
    numName.put(47, "Halberd");
    numName.put(48, "Jouster");
    numName.put(49, "Da Vinci Tank");

    // Pirate Faction

    numName.put(50, "Flintlock");
    numName.put(51, "Blunderbuss");
    numName.put(52, "Bomb Thrower");
    numName.put(53, "Harpooner");
    numName.put(54, "Cannon");
    numName.put(55, "Captain");
    numName.put(56, "Pirate Queen");

    // Spooky Faction

    numName.put(57, "Skeleton Warrior");
    numName.put(58, "Skeleton Archer");
    numName.put(59, "Candlehead");
    numName.put(60, "Vampire");
    numName.put(61, "Pumpkin Catapult");
    numName.put(62, "Swordcaster");
    numName.put(63, "Reaper");

    // Wild West Faction

    numName.put(64, "Dynamite Thrower");
    numName.put(65, "Miner");
    numName.put(66, "Cactus");
    numName.put(67, "Gunslinger");
    numName.put(68, "Lasso");
    numName.put(69, "Deadeye");
    numName.put(70, "Quick Draw");

    Map<Integer, String> team = new HashMap<>();
    Map<String, Integer> counts = new HashMap<>();

    int color;
    int cheapest = Collections.min(numPrice.values());

    IO.print("Max money: ");
    Scanner moneyScan = new Scanner(System.in);
    int moneyMax = moneyScan.nextInt();

    Random picker = new Random();
    int pickNum;
    int num = 0;

    for (int i = 0; i < moneyMax; ) {
        if ((i + cheapest) < moneyMax) {
            num = num + 1;
            pickNum = picker.nextInt(1, 50);
            int valAdd = numPrice.get(pickNum);
            i = i + valAdd;
            team.put(num, numName.get(pickNum));
            if (i > moneyMax) {
                i = i - valAdd;
                team.remove(num);
            }
        } else {
            for (int e = 1; e <= num; e++) {
                String name = team.get(e);
                if (name == null) continue;
                counts.put(name, counts.getOrDefault(name, 0) + 1);
            }
            for (String name : counts.keySet()) {
                color = picker.nextInt(1, 4);
                int count = counts.get(name);
                if (count == 1) {
                    if (color == 1) {
                        IO.println("\u001B[33m" + count + " " + name + "\u001B[0m");
                    } else if (color == 2) {
                        IO.println("\u001B[36m" + count + " " + name + "\u001B[0m");
                    } else {
                        IO.println("\u001B[35m" + count + " " + name + "\u001B[0m");
                    }
                } else {
                    String plural = name.endsWith("s") ? name : name + "s";
                    if (color == 1) {
                        IO.println("\u001B[33m" + count + " " + plural + "\u001B[0m");
                    } else if (color == 2) {
                        IO.println("\u001B[36m" + count + " " + plural + "\u001B[0m");
                    } else {
                        IO.println("\u001B[35m" + count + " " + plural + "\u001B[0m");
                    }
                }
            }
            System.exit(0);
        }
    }
}