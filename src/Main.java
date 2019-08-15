import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        System.out.println(LocalDateTime.now().getDayOfWeek());

        Date date = new Date();
        int numberOfDay = date.getDay();

        for (Day value : Day.values()) {
            if (value.num==numberOfDay){
                System.out.println(value);
            }
        }

        Random ran = new Random();
        int low = 1;
        int high = 30;
        int result = ran.nextInt(high)+low;

        for (RandomInt value : RandomInt.values()){
            if (value.num == result){
                System.out.println(value);
            }
        }
    }
}
