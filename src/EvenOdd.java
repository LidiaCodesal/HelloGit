public class EvenOdd {
public static void main(String[] args) {
    int random;
    int evenCount=0;
    int oddCount=0;

    for (int i = 0; i < 100; i++)  {
        random = (int)(Math.random()*10+1);


        if (random%2 == 0)  {
            evenCount++;
        }  else oddCount++;
    }

    System.out.println("Generados 100 numeros");

    System.out.println("Even" + evenCount+ "\nOdd: "+oddCount);
    System.out.println(evenCount>oddCount?"Even wins!":"Odd wins!");

}


// hello
    }
}
