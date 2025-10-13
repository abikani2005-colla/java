public class SwitchExample {
    public static void main(String[] args) {
        String day = "Mon";
        int num;

        switch (day) {
            case "Mon":
            case "Tue":
            case "Wed":
            case "Thur":
            case "Fri":
                num = 1;
                break;
            case "Sat":
            case "Sun":
                num = 0;
                break;
            default:
                num = -1;
                break;
        }

        System.out.println(num);
    }
}
