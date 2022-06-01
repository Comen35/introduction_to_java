package chapter001Exercises;

public class Exercise1_11 {
    private static int SECONDSINAYEAR = 365 * 24 * 60 * 60;
    private static int POPULATION = 312032486;
   
    public static void main(String[] args) {
        int birthCountInAYear = SECONDSINAYEAR / 7;
        int deathCountInAYear = SECONDSINAYEAR / 13;
        int newImmmigrantInAYear = SECONDSINAYEAR / 45;

        POPULATION = POPULATION + birthCountInAYear + newImmmigrantInAYear - deathCountInAYear;
        System.out.println("First year population: " + POPULATION);

        POPULATION = POPULATION + birthCountInAYear + newImmmigrantInAYear - deathCountInAYear;
        System.out.println("Second year population: " + POPULATION);

        POPULATION = POPULATION + birthCountInAYear + newImmmigrantInAYear - deathCountInAYear;
        System.out.println("Third year population: " + POPULATION);

        POPULATION = POPULATION + birthCountInAYear + newImmmigrantInAYear - deathCountInAYear;
        System.out.println("Fourth year population: " + POPULATION);

        POPULATION = POPULATION + birthCountInAYear + newImmmigrantInAYear - deathCountInAYear;
        System.out.println("Fifth year population: " + POPULATION); 
    }
    
}
