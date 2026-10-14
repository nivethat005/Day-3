class Main {
    public static void main(String[] args) {
        int age = 20;
        boolean id = true;

        if (age >= 18) {
            if (id) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("ID is required");
            }
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}
