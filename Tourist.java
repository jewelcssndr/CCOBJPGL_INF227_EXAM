interface Tourist {
    
    int budget = 1000;

    void visit();

    void visit(Boracay boracay);
    void visit(Buscalan buscalan);
    void visit(Cebu cebu);
    void visit(Palawan palawan);
    void visit(Siargao siargao);

    default void visit(Locations locations) {
        System.out.println("Arrived on a Location");
    };

    void checkBudget();
}
