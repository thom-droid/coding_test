package ps.programmers.warmups;

public class Angle {

    public static void main(String[] args) {


    }

    public static int angle(int angle) {
        if( 0 < angle && angle < 90){
            return 1;
        }
        if( angle == 90 ){
            return 2;
        }
        if( 90 < angle&& angle < 180){
            return 3;
        }
        if( angle == 180){
            return 4;
        }

        return 0;
    }
}
