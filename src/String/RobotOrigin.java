package String;

public class RobotOrigin {

    public static boolean judgeCircle(String moves) {

        int countHor = 0;
        int countVer = 0;

        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'R':
                    countHor++;
                    break;
                case 'L':
                    countHor--;
                    break;
                case 'U':
                    countVer++;
                    break;
                case 'D':
                    countVer--;
                    break;
            }


        }
        return countHor == 0 && countVer == 0;
    }

    public static void main(String[] args) {

        String input = "DD";
        System.out.println( judgeCircle(input));
    }
}
