package coderbytePackage;

/**
 * Created by cdzebisov on 16/11/2016.
 */
public class AllChallenges {

    public static void main(String[] args) {

        // Uncomment the method(s) below that you whant to execute.

        //Challenge1 - FirstFactorial:
//        FirstFactorial ob1= new FirstFactorial();
//        ob1.firstFactorial();

        //Callenge2 - ReverceString
//        ReverseString ob2= new ReverseString();
//        ob2.firstReverrse();

        //Challenge3 - letterChanges
//        LetterChanges ob3 = new LetterChanges();
//        ob3.letterChangesMain();

        //Challenge4
//        SimpleAdding.simpleAddingMain();

        //Challenge5
//        LetterCapitalize ob5=new LetterCapitalize();
//        ob5.letterCapitalizeMain();

        //Challenge6
//        LetterRev ob6 = new LetterRev();
//         String s = ob6.revString("asd");

        //Stop Light Task Challenge:
        /*Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зеленый сигнал,
                затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем опять зеленый горит три минуты и т. д.
                Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
        Определить, сигнал какого цвета горит для пешеходов в этот момент.
        Результат вывести на экран в следующем виде:
        "зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
                Пример для числа 2.5:        зеленый
                Пример для числа 3:          желтый
                Пример для числа 4:          красный
                Пример для числа 5:          зеленый
         Опционально:  Кстати, еще условие задачи - минуты вводит пользователь в консоли. То есть тебе надо их прочитать из консоли.
        */
        Stoplight obStpL = new Stoplight();
        obStpL.stoplightMain();

    }
}

///*
//            String word = "word";
//        String w = "";
//
//            for (char c : word.toCharArray()) {
//                w = (char)(c + 1) + w;
//
//                    }
//        System.out.print(w);
//        /*

