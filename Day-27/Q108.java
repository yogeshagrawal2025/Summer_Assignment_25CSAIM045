class Q108 {
    public static void main(String[] args) {
        String name = "Yogesh";
        int[] marks = {85, 90, 78, 88, 92};

        int total = 0;
        for (int m : marks) total += m;
        double percentage = (double) total / marks.length;

        System.out.println("--- Marksheet ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        if (percentage >= 90) System.out.println("Grade: A+");
        else if (percentage >= 75) System.out.println("Grade: A");
        else if (percentage >= 60) System.out.println("Grade: B");
        else System.out.println("Grade: C");
    }
}
