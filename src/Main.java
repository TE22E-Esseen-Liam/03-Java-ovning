public class Main {
    public static void main(String[] args) {
        Kvadrat(5);
        int Hello32 = 0;

        while (Hello32 < 32) {
            System.out.println("Hello world");
            Hello32++;
        }
    }

        public static void Kvadrat(int tal) {

        int kvadrat = tal * tal;

            System.out.println("Kvadraten av "+ tal +"är" + kvadrat);

        }
    }