import java.util.*;

public class Metodologia_arinak {
    static Scanner sc = new Scanner(System.in);

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    static boolean errepikatu = true;

    static int aukera;

    /** 
     * Agurraren Testa. 
     */
    static String agurra() {
        return "Kaixo, hau Metodologia Arinak azaltzeko javako programa da.";
    }

    /**
     * Metodo nagusian while baten barruan menu bat hasieratzen da, eta switcharekin 3 aukera hasieratzen dira zeinetan azalpenak dauden.
     * Birfaktorizazioa: 62, 72, 84 eta 96 lerroetan metodoak egin ditut, horrela main laburragoa egiten da eta ulergarriagoa.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) {

        while (errepikatu) {
            Menua();

            switch (aukera) {

                case 0:
                    System.out.println(ANSI_RED + "Programa itxi duzu" + ANSI_RESET);
                    errepikatu = false;
                    break;

                case 1:
                    metodologienBilakaera();
                    break;

                case 2:
                    scrumMetodAgile();
                    break;

                case 3:
                    kanban();
                    break;
            }
        }

    }

    /**
     * Menuaren metodoa
     */
    public static void Menua() {
        System.out.println(ANSI_YELLOW + "\n Zer ikusi nahi duzu? (0 sakatu programa ixteko)" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "1 - 2.4.1 Metodologien bilakaera \n" +
                "2 - 2.4.2 Scrum Metodologia Agile-ak \n" +
                "3 - 2.4.3 Kanban \n" + ANSI_RESET);
        aukera = sc.nextInt();

    }

    /**
     * Metodologien Bilakaeraren azalpenaren metodoa.
     */
    public static void metodologienBilakaera() {
        System.out.println(ANSI_GREEN + "2.4.1 Metodologien bilakaera \n" + ANSI_RESET +
                "Garapen-metodologiak proiektu baten antolaketa eta aurrerapena gidatzeko erabiltzen dira. Tradizionalki, ur-jauzi eredua erabili izan da, non lanak fase linealetan egiten diren (analisi, diseinu, garapena, probak, inplementazioa, mantentzea). Metodo hau egokia da helburuak oso zehaztuta daudenean, baina malgutasun txikia du aldaketen aurrean.\n"
                +

                "Metodologia arinek, berriz, proiektuak zatituz eta iterazio laburrak eginez malgutasuna eta egokitzapena sustatzen dute. Feedback azkarra eta komunikazio estua dute oinarri. Abantailak dira azkartasuna, gardentasuna eta aldaketetara egokitzeko gaitasuna; desabantailak, berriz, aurrekontuaren zehaztasun zailtasuna eta bezeroaren inplikazio handia.");
    
    }

    /**
     * Scrum Metod Agileren azalpenaren metodoa
     */
    public static void scrumMetodAgile() {
        System.out.println(ANSI_GREEN + "2.4.2 Scrum\n" + ANSI_RESET +
                "Scrum metodologia arina da, proiektuak iterazio laburretan (sprint-ak) antolatzen dituena. Helburua balioa ahalik eta azkarren eskaintzea da. Negozioak ezartzen ditu lehentasunak, eta taldeak bere lana autokudeatzen du.\n"
                +
                "Scrum-ek hainbat gertaera ditu: Sprint Planning (helburuak adosteko), Daily Scrum (eguneroko koordinazioa), eta Sprint Review/Retrospective (hobekuntzak aztertzeko). Estimazioak Planning Poker bidez egiten dira.\n"
                +
                "Abantailak dira ikusgarritasuna, komunikazioa, konfiantza eta arriskuen murrizketa. Produktua pixkanaka garatzen da eta bezeroaren beharrak etengabe egokitzen dira.");
    }

    /**
     * Kanban azalpenaren metodoa.
     */
    public static void kanban() {
        System.out.println(ANSI_GREEN + "2.4.3  Kanban\n" + ANSI_RESET +
                "Kanban seinale bisuala esan nahi du eta lana ikusgarri eginez prozesua optimizatzeko metodoa da. Helburua da lan-fluxua hobetzea eta oztopoak identifikatzea.\n"
                +
                "Oinarriak dira lanaren fluxua bistaratzea, WIP mugak ezartzea eta etengabeko hobekuntza. Ez du sprint finkorik; entregak jarraituak dira.\n"
                +
                "Scrum-en aldean, Kanban-ek ez du rol edo bilera zorrotzik eskatzen, eta malgutasun handiagoa eskaintzen du proiektuaren erritmo naturala mantenduz.");
    }
}
