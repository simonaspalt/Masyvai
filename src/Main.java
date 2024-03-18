public class Main {
    public static void main(String[] args) {
        //Sugeneruokite masyvą iš 30 elementų (indeksai nuo 0 iki 29),
        // kurių reikšmės yra atsitiktiniai skaičiai nuo 5 iki 25.
        // Atsispausdinate, pasižiūrite ką gavote.
        System.out.println("====== 1 ============================");
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            int num = (int) (Math.round((Math.random() * 20)) + 5);
            array[i] = num;
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("====== 2 ============================");

























    }
}