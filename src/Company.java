public class Company {
    public static void main(String[] args) {
        // Create an array to hold 10 Employee objects.
        Employee[] team = new Employee[10];

        // Initialize each element of the array with an Intern object.
        team[0] = new Intern("Salvatore", 18, 20000);
        team[1] = new Intern("Céline", 22, 3400);
        team[2] = new Intern("Alex", 24, 4200);
        team[3] = new Intern("Elodie", 19, 6500);
        team[4] = new Intern("Rosca", 27, 1500);
        team[5] = new Intern("Ahmad", 33, 15000);
        team[6] = new Intern("Cesar", 45, 16000);
        team[7] = new Intern("Elise", 24, 2000);
        team[8] = new Intern("Tino", 50, 13000);
        team[9] = new Intern("Sébastien", 26, 10000);

        // Iterate through each Employee in the team array.
        for (Employee member : team) {
            // Print the string representation of each Employee.
            System.out.println(member.toString());
        }
    }
}
