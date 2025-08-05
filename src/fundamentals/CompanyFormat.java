package fundamentals;
public class CompanyFormat {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error: Please provide exactly two arguments (company and city).");
            return;
        }

        String company = args[0];
        String city = args[1];
        System.out.println(company + " Technologies " + city);
    }
}
