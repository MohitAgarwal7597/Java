package PWAssignmentProblems.Assignment17;

class ReverseAtSamePlace {
    public static void main(String[] args) {
        String s = "THINK TWICE";
        s = s.toLowerCase();
        String[] arr = new String[2];
        arr = s.split(" ");
        StringBuilder sb = new StringBuilder(arr[0]);
        StringBuilder sb1 = new StringBuilder(arr[1]);
        sb.reverse();
        sb1.reverse();
        System.out.println(sb + " " + sb1);
    }
}