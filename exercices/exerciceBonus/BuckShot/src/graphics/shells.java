package graphics;

public class shells {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void showShell(int blank,int live) throws InterruptedException {
        int emptySpace = 8 - blank - live;
        System.out.println("+-------------------------------------------------------------------------+");
        Thread.sleep(100);
        switch (live) {
            case 1:
            System.out.print("| " + ANSI_RED + "+======+" + ANSI_RESET);
            break;
            case 2:
            System.out.print("| " + ANSI_RED + "+======+ +======+" + ANSI_RESET);
            break;
            case 3:
            System.out.print("| " + ANSI_RED + "+======+ +======+ +======+" + ANSI_RESET);
            break;
            case 4:
            System.out.print("| " + ANSI_RED + "+======+ +======+ +======+ +======+" + ANSI_RESET);
            break;
        }
        Thread.sleep(100);
        switch (blank) {
            case 1:
            System.out.print(ANSI_BLUE + " +======+" + ANSI_RESET);
            break;
            case 2:
            System.out.print(ANSI_BLUE + " +======+ +======+" + ANSI_RESET);
            break;
            case 3:
            System.out.print(ANSI_BLUE + " +======+ +======+ +======+" + ANSI_RESET);
            break;
            case 4:
            System.out.print(ANSI_BLUE + " +======+ +======+ +======+ +======+" + ANSI_RESET);
            break;
        }
        Thread.sleep(100);
        switch (emptySpace) {
            case 0:
            System.out.println(" |");
            break;
            case 1:
            System.out.println(" +======+ |");
            break;
            case 2:
            System.out.println(" +======+ +======+ |");
            break;
            case 3:
            System.out.println(" +======+ +======+ +======+ |");
            break;
            case 4:
            System.out.println(" +======+ +======+ +======+ +======+ |");
            break;
            case 5:
            System.out.println(" +======+ +======+ +======+ +======+ +======+ |");
            break;
            case 6:
            System.out.println(" +======+ +======+ +======+ +======+ +======+ +=====+ |");
            break;
        }
        Thread.sleep(100);
        for (int i = 0; i < 7; i++) {
            
        
        switch (live) {
            case 1:
            System.out.print("| " + ANSI_RED + "|      |" + ANSI_RESET);
            break;
            case 2:
            System.out.print("| " + ANSI_RED + "|      | |      |" + ANSI_RESET);
            break;
            case 3:
            System.out.print("| " + ANSI_RED + "|      | |      | |      |" + ANSI_RESET);
            break;
            case 4:
            System.out.print("| " + ANSI_RED + "|      | |      | |      | |      |" + ANSI_RESET);
            break;
        }
        Thread.sleep(100);
        switch (blank) {
            case 1:
            System.out.print(ANSI_BLUE + " |      |" + ANSI_RESET);
            break;
            case 2:
            System.out.print(ANSI_BLUE + " |      | |      |" + ANSI_RESET);
            break;
            case 3:
            System.out.print(ANSI_BLUE + " |      | |      | |      |" + ANSI_RESET);
            break;
            case 4:
            System.out.print(ANSI_BLUE + " |      | |      | |      | |      |" + ANSI_RESET);
            break;
        }
        Thread.sleep(100);
        switch (emptySpace) {
            case 0:
            System.out.println(" |");
            break;
            case 1:
            System.out.println(" |      | |");
            break;
            case 2:
            System.out.println(" |      | |      | |");
            break;
            case 3:
            System.out.println(" |      | |      | |      | |");
            break;
            case 4:
            System.out.println(" |      | |      | |      | |      | |");
            break;
            case 5:
            System.out.println(" |      | |      | |      | |      | |      | |");
            break;
            case 6:
            System.out.println(" |      | |      | |      | |      | |      | |      | |");
            break;
        }
        Thread.sleep(100);
    }
    switch (emptySpace) {
        case 0:
        System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+ +======+ +======+ +======+ +======+" + ANSI_RESET + " |");
        break;
        case 1:
        System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+ +======+ +======+ +======+" + ANSI_RESET + " +======+ |");
        break;
        case 2:
        System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+ +======+ +======+" + ANSI_RESET + " +======+ +======+ |");
        break;
        case 3:
        System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+ +======+" + ANSI_RESET + " +======+ +======+ +======+ |");
        break;
        case 4:
        System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+" + ANSI_RESET + " +======+ +======+ +======+ +======+ |");
        break;
        case 5:
        System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+" + ANSI_RESET + " +======+ +======+ +======+ +======+ +======+ |");
        break;
        case 6:
        System.out.println("| " + ANSI_YELLOW + "+======+ +======+ " + ANSI_RESET + "+======+ +======+ +======+ +======+ +======+ +======+ |");
        break;
    }
    Thread.sleep(100);
    switch (emptySpace) {
        case 0:
        System.out.println("| " + ANSI_YELLOW + "|      | |      | |      | |      | |      | |      | |      | |      |" + ANSI_RESET + " |");
        break;
        case 1:
        System.out.println("| " + ANSI_YELLOW + "|      | |      | |      | |      | |      | |      | |      |" + ANSI_RESET + " |      | |");
        break;
        case 2:
        System.out.println("| " + ANSI_YELLOW + "|      | |      | |      | |      | |      | |      |" + ANSI_RESET + " |      | |      | |");
        break;
        case 3:
        System.out.println("| " + ANSI_YELLOW + "|      | |      | |      | |      | |      |" + ANSI_RESET + " |      | |      | |      | |");
        break;
        case 4:
        System.out.println("| " + ANSI_YELLOW + "|      | |      | |      | |      |" + ANSI_RESET + " |      | |      | |      | |      | |");
        break;
        case 5:
        System.out.println("| " + ANSI_YELLOW + "|      | |      | |      |" + ANSI_RESET + " |      | |      | |      | |      | |      | |");
        break;
        case 6:
        System.out.println("| " + ANSI_YELLOW + "|      | |      | " + ANSI_RESET + "|      | |      | |      | |      | |      | |      | |");
        break;
    }
    Thread.sleep(100);
    switch (emptySpace) {
        case 0:
        System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+ +======+ +======+ +======+ +======+" + ANSI_RESET + " |");
        break;
        case 1:
        System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+ +======+ +======+ +======+" + ANSI_RESET + " +======+ |");
        break;
        case 2:
        System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+ +======+ +======+" + ANSI_RESET + " +======+ +======+ |");
        break;
        case 3:
        System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+ +======+" + ANSI_RESET + " +======+ +======+ +======+ |");
        break;
        case 4:
        System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+" + ANSI_RESET + " +======+ +======+ +======+ +======+ |");
        break;
        case 5:
        System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+" + ANSI_RESET + " +======+ +======+ +======+ +======+ +======+ |");
        break;
        case 6:
        System.out.println("| " + ANSI_YELLOW + "+======+ +======+ " + ANSI_RESET + "+======+ +======+ +======+ +======+ +======+ +======+ |");
        break;
    }
    Thread.sleep(100);
    System.out.println("+-------------------------------------------------------------------------+");
    Thread.sleep(100);
    }
}
