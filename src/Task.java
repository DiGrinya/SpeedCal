import java.util.Scanner;

public class Task {
    public static void main(String args[]) {
        Speed calc = new Speed();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the distance:");
        int distance = sc.nextInt();
        System.out.println("Please enter the time:");
        int time = sc.nextInt();
        calc.setS(distance);
        calc.setT(time);
        System.out.println("Conditions:");
        System.out.println("Distance = " + distance + ", Time = " + time);

        calc.speed();
    }
}

    class Speed  {
        private int v;
        private int s;
        private int t;
        void setS(int distance){
            s = distance;
        }

        int getS(){
            return s;
        }

        void setT(int time){
            t = time;
        }

        int getT(){
            return t;
        }

        void speed (){
            v = s/t;
            System.out.println("Speed = " + v);
        }

}