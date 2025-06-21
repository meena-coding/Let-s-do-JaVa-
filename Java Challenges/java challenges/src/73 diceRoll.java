class diceRoll {

    int roll(){
        double random = Math.random() * 6;
        return (int) Math.ceil(random);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to the Dice roll\n");
        diceRoll dice = new diceRoll();

        for (int i = 0; i < 10; i++) {

        System.out.printf("You got: %d\n",dice.roll());
        }



    }
}
