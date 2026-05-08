

    public static void main(String[] args) {

        int amount = 1988;

        int[] denominations = {5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1};

        System.out.println("Amount = Rs. " + amount);

        for (int i = 0; i < denominations.length; i++) {

            if (amount >= denominations[i]) {

                int count = amount / denominations[i];

                amount = amount % denominations[i];

                System.out.println(denominations[i] + " x " + count);
            }
        }
    }
