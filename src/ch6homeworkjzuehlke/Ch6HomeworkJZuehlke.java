package ch6homeworkjzuehlke;
import java.util.Scanner;

//@author Jake Zuehlke

public class Ch6HomeworkJZuehlke 
{
    public static void main(String[] args) 
    {   
        //set up scanner and validation variable
        Scanner kb = new Scanner(System.in);
        String validStr;
        
        //instantiate AudreyII and Player with their blank constructor
        AudreyII a2 = new AudreyII();
        Seymour p1 = new Seymour();
 
        //nourishment and action choice
        Nourishment nChoice;
        Action plantDmg;
        Action playerDmg;

        //sentinel variable
        int feeds = 0;
        
        //output title and intro
        System.out.println("Little Shop of Horrors");
        System.out.println("----------------------");
        System.out.println("\nYou discovered an exotic plant during the solar" +
            " eclipse. It appears to be some kind of flytrap, but it has yet" +
            " to open. It looks kinda weak...");
        
        //loop for pod AudreyII
        while(feeds < 5 && a2.getPodHealth() > 0)
        {
            //prompt nourishment
            System.out.println("\nHow would you like to nourish the plant?: " +
                "\nA)Put it in the sunlight" +
                "\nB)Put it in the shade" +
                "\nC)Change the soil to sand" +
                "\nD)Change the soil to dirt" +
                "\nE)Give it water" +
                "\nF)Give it blood" +
                "\nG)Neglect it");
            
            //validate user input
            validStr = kb.nextLine().toUpperCase();
            while(!(validStr.equals("A") || 
                validStr.equals("B") ||
                validStr.equals("C") || 
                validStr.equals("D") ||
                validStr.equals("E") || 
                validStr.equals("F") ||
                validStr.equals("G")))
            {
                System.out.print("\nPlease enter a letter A - G: ");
                validStr = kb.nextLine().toUpperCase();
            }

            //set the user's choice to an enum value
            switch(validStr)
            {
                case "A": nChoice = Nourishment.SUNLIGHT;
                    System.out.println("The plant's pod turns away from" +
                        " the sunlight...");
                    break;
                case "B": nChoice = Nourishment.SHADE;
                    System.out.println("The plant seems to be okay" +
                        " in the shade...");
                    break;
                case "C": nChoice = Nourishment.SAND;
                    System.out.println("The plant stifles a small cough...");
                    break;
                case "D": nChoice = Nourishment.DIRT;
                    System.out.println("The plant doesn't seem to mind" +
                        " being in dirt...");
                    break;
                case "E": nChoice = Nourishment.WATER;
                    System.out.println("The plant almost looks like it" + 
                        " would vomit if it could...");
                    break;
                case "F": nChoice = Nourishment.BLOOD;
                    System.out.println("The plant opens its pod and greedily" +
                        " absorbs the blood...");
                    break;
                default: nChoice = Nourishment.NEGLECT;
                    System.out.println("The plant wilts away and its pod" +
                        " almost looks like its frowning...");
                    break;
            }
            
            //alter and display AudreyII's health
            a2.setPodHealth(nChoice);
            System.out.println("Plant's health: " + a2.getPodHealth());
            
            //Victory...?
            if(a2.getPodHealth() <= 0)
            {
                System.out.println("\nThe plant wilted away and died. " +
                    "\nYou feel strangely okay with this.");
                p1.setHitPoints(0);
            }

            //increase feed count
            feeds++;
        }
        
        //AudreyII reached adulthood...
        if(a2.getPodHealth() > 0)
        {
            System.out.println("\nThe Plant has grown quite well, and is now" +
            " bigger than you are! You are shocked to find it can now talk" +
            " and it has demanded fresh meat!");
        }
        //loop for adult AudreyII
        while(feeds < 10 && a2.getPodHealth() > 0)
        {
            //prompt nourishment
            System.out.println("\nHow would you like to nourish the plant?: " +
                "\nA)Try to water it" +
                "\nB)Offer some more of your blood" +
                "\nC)Give it ground meat" +
                "\nD)Commit murder and feed the body to the plant" +
                "\nE)Neglect it");
            
            //validate user input
            validStr = kb.nextLine().toUpperCase();
            while(!(validStr.equals("A") || 
                validStr.equals("B") ||
                validStr.equals("C") || 
                validStr.equals("D") ||
                validStr.equals("E")))
            {
                System.out.print("\nPlease enter a letter A - E: ");
                validStr = kb.nextLine().toUpperCase();
            }

            //set the user's choice to an enum value
            switch(validStr)
            {
                case "A": nChoice = Nourishment.WATER;
                    System.out.println("The plant smacks the watering can" +
                        " from your hands using its vines. It laughs at you" +
                        " and orders you to go get it some meat.");
                    break;
                case "B": nChoice = Nourishment.BLOOD;
                    System.out.println("If the plant had eyes, you can tell" +
                        " it would be rolling them at you. It says your" +
                        " blood just isn't enough.");
                    break;
                case "C": nChoice = Nourishment.MEAT;
                    System.out.println("The plant says it needs fresh meat," +
                        " otherwise don't do it any favors.");
                    break;
                case "D": nChoice = Nourishment.LIMBS;
                    System.out.println("The plant chomps down the limbs and" +
                        " praises you for not being a chump. The plant tells" +
                        " you the world is yours if you keep feeding it...");
                    break;
                default: nChoice = Nourishment.NEGLECT;
                    System.out.println("The plant grabs your shoulder," +
                        " spinning you around to come face-to-face with it." +
                        " FEED ME NOW!");
                    break;
            }
            
            //alter and display AudreyII's health
            a2.setPodHealth(nChoice);
            System.out.println("Plant's health: " + a2.getPodHealth());
            
            //Defeat 1
            if(a2.getPodHealth() == 0)
            {
                System.out.println("\nThe plant knows you are set on killing" +
                    " it.\nBefore you can react, the plant seizes your arms" +
                    " and legs with its vines then shovels you into its mouth" +
                    " while laughing at you.\nA few painful chomps and you're" +
                    " plant food.");
                p1.setHitPoints(0);
            }

            //increase feed count
            feeds++;
        }
        
        //The showdown...
        if(p1.getHitPoints() > 0)
        {
            System.out.println("\nYou're through with appeasing this monster!" +
                "\nYou don't know how you're going to win, but it's time to" +
                " uproot this plant!\nThe plant laughs and tells you you have" +
                " no idea what you're messing with.\nThe fight is on!");
        }
            
        //sets AudreyII's HP, depending how well you fed it
        a2.setInitialHitPoints();
        System.out.println("Plant's HP: " + a2.getHitPoints());
        System.out.println("Your HP: " + p1.getHitPoints());

        while(feeds < 15 && a2.getHitPoints() > 0 && p1.getHitPoints() > 0)
        {
            //prompt offense
            System.out.println("\nChoose your action!: " +
                "\nA)Try to water it" +
                "\nB)Swing your trusty murder axe" +
                "\nC)Shoot at it with your .38 special" +
                "\nD)Attempt to electrocute it with a nearby live wire" +
                "\nE)Try and run away");

            //validate user input
            validStr = kb.nextLine().toUpperCase();
            while(!(validStr.equals("A") || 
                validStr.equals("B") ||
                validStr.equals("C") || 
                validStr.equals("D") ||
                validStr.equals("E")))
            {
                System.out.print("\nPlease enter a letter A - E: ");
                validStr = kb.nextLine().toUpperCase();
            }

            //set the user's choice to an enum value
            switch(validStr)
            {
                case "A": plantDmg = Action.NEUTRAL;
                    playerDmg = Action.WATER;
                    System.out.println("For some reason, you try and" +
                        " water the angry plant at a time like this." +
                        "\nThe plant is just as confused as you are at" +
                        " first, but then retaliates by crushing" +
                        " one of your arms with its vines, then laughs.");
                    break;
                case "B": plantDmg = Action.AXE;
                    playerDmg = Action.NEUTRAL;
                    System.out.println("You take your axe to the plant!" +
                        "\nYou severed a few vines in the process!");
                    break;
                case "C": plantDmg = Action.GUN;
                    playerDmg = Action.NEUTRAL;
                    System.out.println("You fire wildly at the plant," +
                        " but your aim is terrible and you have no idea" +
                        " where to be aiming at it anyway.");
                    break;
                case "D": plantDmg = Action.ELECTROCUTE;
                    playerDmg = Action.NEUTRAL;
                    System.out.println("With reckless abandon, you grab" +
                        " a nearby live wire and stab the plant with" +
                        " the freyed end.\nThe plant is visibly hurt by" +
                        " the shock, and writhes its vines wildly around.");
                    break;
                default: plantDmg = Action.NEUTRAL;
                    playerDmg = Action.FLEE;
                    System.out.println("Panic sets in and you try to" +
                        " flee!\nThe futile attempt allows the plant" +
                        " to seize the advantage, grasping your arms" +
                        " and legs with its vines.\nIt laughs as you" +
                        " are helplessly brought toward it...");
                    break;
            }

            //alter and display player's and AudreyII's HP
            a2.alterHitPoints(plantDmg);
            p1.alterHitPoints(playerDmg);
            System.out.println("Plant's HP: " + a2.getHitPoints());
            System.out.println("Your HP: " + p1.getHitPoints());

            //victory!
            if(a2.getHitPoints() <= 0)
            {
                System.out.println("\nThe plant pauses for a bit, cusses," +
                    " then suddenly explodes.\nThe day is won, and you" +
                    " skip town to never speak of this again.");
            }

            //defeat 2
            if(p1.getHitPoints() <= 0)
            {
                System.out.println("\nWith no way out, and no energy left" +
                    " to fight, you succumb to being plant food.");
            }

            //use feeds to increase rounds
            feeds++;
        }
            
        //defeat 3
        if(a2.getHitPoints() > 0 && p1.getHitPoints() > 0)
        {
            System.out.println("\nYou've tried everything, but the plant is" +
                " just too strong. You sucessfully get away and skip town." +
                "\nThe plant is able to grow unchecked, and ends up" +
                " reproducing, filling the world with its spawn." +
                "\nEventually, mankind is wiped out. It's a green Earth now.");
            
        }
    }
}