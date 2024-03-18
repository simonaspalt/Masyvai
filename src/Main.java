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
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("====== 2 ============================");
//Naudodamiesi 1 uždavinio masyvu:
//a Suskaičiuokite kiek masyve yra reikšmių didesnių už 10;
//b Raskite didžiausią masyvo reikšmę ir jos indeksą arba indeksus jeigu yra keli ir atspausdinkite.
//c Suskaičiuokite visų porinių (lyginių) indeksų reikšmių sumą;
//d Sukurkite naują masyvą, kurio reikšmės yra 1 uždavinio masyvo reikšmes minus tos reikšmės indeksas; PVZ -
// Indeksai   0, 1, 2, 3
// Reiksmes 1, 17, 40, 3
// Rezultatas 1, 16, 38, 0
//e Papildykite masyvą papildomais 10 elementų su reikšmėmis nuo 5 iki 25,
// kad bendras masyvas padidėtų iki indekso 39; (tam reikės sukurti naują masyvą,
// ir baigus jį pildyti priskirti pirmojo kintamąjam)
//g Iš masyvo elementų sukurkite du naujus masyvus. Vienas turi būti sudarytas iš neporinių indekso reikšmių, o kitas iš porinių;
// Pirminio masyvo elementus su poriniais indeksais padarykite lygius 0 jeigu jie didesni už 15;
//h Suraskite pirmą (mažiausią) indeksą, kurio elemento reikšmė didesnė už 10;
        System.out.println("2a");
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                counter++;
            }
        }
        System.out.println("there are: " + counter + " numbers > 10 in array");
        System.out.println("2b");
        //b Raskite didžiausią masyvo reikšmę ir jos indeksą arba indeksus jeigu yra keli ir atspausdinkite.
        int fattestnum = array[0];
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] > array[(i + 1)]) {
                fattestnum = array[i];
            }
            if (array[i + 1] > array[i]) {
                fattestnum = array[i + 1];
            }
        }
        System.out.println("Largest number is: " + fattestnum + " with index(s):");
        for (int i = 0; i < array.length; i++) {
            if (fattestnum == array[i]) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
        System.out.println("2c");
//Suskaičiuokite visų porinių (lyginių) indeksų reikšmių sumą;
        int evensum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                evensum = evensum + array[i];
            }
        }
        System.out.println("Sum of even numbers is: " + evensum);
        System.out.println("2d");
//d Sukurkite naują masyvą, kurio reikšmės yra 1 uždavinio masyvo reikšmes minus tos reikšmės indeksas; PVZ -
//// Indeksai   0, 1, 2, 3
//// Reiksmes 1, 17, 40, 3
//// Rezultatas 1, 16, 38, 0
        int[] array2 = new int[30];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (array[i] - i);
            System.out.print(array2[i] + " ");

        }
        System.out.println();
        System.out.println("2e");
        //Papildykite masyvą papildomais 10 elementų su reikšmėmis nuo 5 iki 25,
        //// kad bendras masyvas padidėtų iki indekso 39; (tam reikės sukurti naują masyvą,
        //// ir baigus jį pildyti priskirti pirmojo kintamąjam)
        int[] array3 = new int[39];
        for (int i = 0; i < 39; i++) {
            if (i <= 29) {
                array3[i] = array2[i];
            } else {
                int num = (int) (Math.round((Math.random() * 20)) + 5);
                array3[i] = num;
            }
            System.out.print(array3[i] + " ");
        }

        System.out.println();
        System.out.println("2f");
//Iš masyvo elementų sukurkite du naujus masyvus.
// Vienas turi būti sudarytas iš neporinių indekso reikšmių, o kitas iš porinių;
        int[] evennums = new int[39];
        int[] oddnums = new int[39];
        int countereven = 0;
        int counterodd = 0;
        for (int i = 0; i < array3.length; i++) {
            if ((array3[i] % 2 == 0)) {
                evennums[countereven] = array3[i];
                countereven++;
            } else {
                oddnums[counterodd] = array3[i];
                counterodd++;
            }
        }
        System.out.println(" even numbers: ");
        for (int i = 0; i < evennums.length; i++) {
            System.out.print(evennums[i] + " ");
        }
        System.out.println();
        System.out.println(" odd numbers: ");
        for (int i = 0; i < oddnums.length; i++) {
            System.out.print(oddnums[i] + " ");
        }

        System.out.println();
        System.out.println("2g");
        // g Pirminio masyvo elementus su poriniais indeksais padarykite lygius 0 jeigu jie didesni už 15;

        for (int i = 0; i < array3.length; i += 2) {
            if (array3[i] > 15) {
                array3[i] = 0;
            }
        }
        System.out.println("New array: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        System.out.println("2h");
        ///  Suraskite pirmą (mažiausią) indeksą, kurio elemento reikšmė didesnė už 10;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > 10) {
                System.out.println("First number > 10 is: " + array3[i] + " with index: " + i);
                break;
            }
        }

        System.out.println();
        System.out.println("======== 3 ===========");
//Sugeneruokite masyvą, kurio reikšmės atsitiktinės raidės A, B, C ir D,
// o ilgis 200. Suskaičiuokite kiek yra kiekvienos raidės.
        String[] letters = new String[200];
        for (int i = 0; i < letters.length; i++) {
            int num = (int) (Math.round(Math.random() * 3));
            if (num == 0) {
                letters[i] = "A";
            }
            if (num == 1) {
                letters[i] = "B";
            }

            if (num == 2) {
                letters[i] = "C";
            }
            if (num == 3) {
                letters[i] = "D";
            }
            System.out.print(letters[i] + " ");
        }

//Išrūšiuokite 3 uždavinio masyvą pagal abecėlę.
        System.out.println();
        System.out.println("======== 4 ===========");
        counter = 0;
        String[] lettersa = new String[200];

        for (int q = 0; q < letters.length; q++) {
            if (letters[q] == "A") {
                lettersa[counter] = letters[q];
                counter++;
            }
        }
        for (int w = 0; w < letters.length; w++) {
            if (letters[w] == "B") {
                lettersa[counter] = letters[w];
                counter++;
            }
        }
        for (int e = 0; e < letters.length; e++) {
            if (letters[e] == "C") {
                lettersa[counter] = letters[e];
                counter++;
            }
        }
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == "D") {
                lettersa[counter] = letters[i];
                counter++;

            }
        }
        for (int p = 0; p < lettersa.length; p++) {
            System.out.print(lettersa[p] + " ");
        }

        System.out.println();
        System.out.println("======== 5 ===========");
        //Sugeneruokite 3 masyvus pagal 3 uždavinio sąlygą. Sudėkite masyvus, sudėdami atitinkamas reikšmes.
        // Paskaičiuokite kiek unikalių (po vieną, nesikartojančių) reikšmių ir kiek unikalių kombinacijų gavote.
        //pvz 3 mayvai:
        //A,C,B,D,A
        //C,C,B,B,C
        //A,A,D,D,A
        //ACA,CCA,BBD,DBD,ACA - TRYS UNIKALIOS, 4 KOMBINACIJOS

        String[] letters1 = new String[200];
        for (int i = 0; i < letters1.length; i++) {
            int num = (int) (Math.round(Math.random() * 3));
            if (num == 0) {
                letters1[i] = "A";
            }
            if (num == 1) {
                letters1[i] = "B";
            }

            if (num == 2) {
                letters1[i] = "C";
            }
            if (num == 3) {
                letters1[i] = "D";
            }
        }
        String[] letters2 = new String[200];
        for (int i = 0; i < letters2.length; i++) {
            int num = (int) (Math.round(Math.random() * 3));
            if (num == 0) {
                letters2[i] = "A";
            }
            if (num == 1) {
                letters2[i] = "B";
            }

            if (num == 2) {
                letters2[i] = "C";
            }
            if (num == 3) {
                letters2[i] = "D";
            }
        }
        String[] letters3 = new String[200];
        for (int i = 0; i < letters3.length; i++) {
            int num = (int) (Math.round(Math.random() * 3));
            if (num == 0) {
                letters3[i] = "A";
            }
            if (num == 1) {
                letters3[i] = "B";
            }

            if (num == 2) {
                letters3[i] = "C";
            }
            if (num == 3) {
                letters3[i] = "D";
            }
        }
        String[] lettersABC = new String[200];
        counter = 0;
        for (int i = 0; i < lettersABC.length; i++) {
            lettersABC[i] = (letters1[i] + letters2[i] + letters3[i]);
            System.out.print(" " + lettersABC[i]);
            counter++;
            if ((counter % 20) == 0){
                System.out.println();
            }
        }





    }
}