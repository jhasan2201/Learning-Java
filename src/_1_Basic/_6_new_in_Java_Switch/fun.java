package _1_Basic._6_new_in_Java_Switch;

public class fun {
    public static void main(String[] args) {

        String day= "Monday";

//        switch (day){
//            case "Saturday","Sunday":
//                System.out.println("6am");
//                break;
//            case "Monday":
//                System.out.println("8am");
//                break;
//            default:
//                System.out.println("7am");
//        }

        switch (day){
            case "Saturday","Sunday" -> System.out.println("6am");
            case "Monday" -> System.out.println("8am");
            default -> System.out.println("7am");
        }


        System.out.println();

        String result = "";
        switch (day){
            case "Saturday","Sunday" -> result = "6am";
            case "Monday" -> result = "8am";
            default -> result = "7am";
        }
        System.out.println(result);

        System.out.println();

        day = "Sunday";

        result = switch (day){
            case "Saturday","Sunday" -> "6am";
            case "Monday" -> "8am";
            default -> "7am";
        };
        System.out.println(result);

        System.out.println();

        result = switch (day){
            case "Saturday","Sunday" : yield  "6am";
            case "Monday" : yield  "8am";
            default : yield  "7am";
        };
        System.out.println(result);

    }
}
