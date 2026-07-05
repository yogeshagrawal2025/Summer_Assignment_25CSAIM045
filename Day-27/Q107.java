class Q107 {
    public static void main(String[] args) {
        int[] salaries = {50000, 60000, 45000, 70000};

        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int s : salaries) {
            total += s;
            if (s > max) max = s;
            if (s < min) min = s;
        }

        double avg = (double) total / salaries.length;

        System.out.println("Total Salary = " + total);
        System.out.println("Average Salary = " + avg);
        System.out.println("Highest Salary = " + max);
        System.out.println("Lowest Salary = " + min);
    }
}
