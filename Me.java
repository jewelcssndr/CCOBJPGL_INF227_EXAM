public class Me implements Tourist{
    
    static int budget = 1000;

    public void visit() {
        System.out.println("Enjoy naman");
    }

    public void visit(Boracay boracay) {
       checkBudget();
       if (budget < boracay.airFare) {
        System.out.println("Sorry ah, mahirap lang ako eh");

       } 
       else {
        budget = budget - boracay.airFare;
        System.out.println("Andito ako sa Boracay nabili ng shake para aware ka");
       } System.out.print("Remaining Budget: "); checkBudget();
    }
    public void visit(Buscalan buscalan) {
        checkBudget();
        if (budget < buscalan.airFare) {
            System.out.println("Di kasi ako pinautang ni Sir");

        } 
        else {
            budget = budget - buscalan.airFare;
            System.out.println("Yes madadagdagan na tattoo ko");
        } System.out.print("Remaining Budget: "); checkBudget();
    }
    public void visit(Cebu cebu) {
        checkBudget(); 
        if (budget < cebu.airFare) {
            System.out.println("Kawawan naman ako");

        } 
        else {
            budget = budget - cebu.airFare;
            System.out.println("Bili lang ako toyo sa Cebu");
        } System.out.print("Remaining Budget: "); checkBudget();
    }
    public void visit(Palawan palawan) {
        checkBudget();
        if (budget < palawan.airFare) {
            System.out.println("Pautangin nyo ako fls :(");

        } 
        else {
            budget = budget - palawan.airFare;
            System.out.println("Andito ako sa Palawan nagtatampo para alam mo");
        } System.out.print("Remaining Budget: "); checkBudget();
    }
    public void visit(Siargao siargao) {
        checkBudget();
        if (budget < siargao.airFare) {
            System.out.println("Hindi ako pinayagan ni Sir mag Siargao");

        } 
        else {
            budget = budget - siargao.airFare;
                System.out.println("Forda surf ang ferson sa Siargao");
            } System.out.print("Remaining Budget: "); checkBudget();
        }
    public void checkBudget() {
        System.out.println("my budget is " + budget);
        }
}