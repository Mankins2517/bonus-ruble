public class Main {
    public static void main(String[] args) {
        int client=100;
        int popol=2000;
        int bonus;
        if (popol >=1000) {
            bonus=popol/100;
        } else {
            bonus=1;
        }
        int total=client+bonus+popol;
    System.out.println(bonus);
    }

    }
