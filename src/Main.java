public class Main {


        public static void main(String[] args) {
            //int i=1;
            //do{
              //  System.out.println(i);
                //i++;
            //}while(i<=10);

            for (int j = 0; j <= 100; j++) {

                if(j % 3 == 0){

                    System.out.println("Fizz");

                } else if (j % 5 == 0) {

                    System.out.println("Buzz");

                } else {
                    System.out.println(j);
                }

            }

        }

}