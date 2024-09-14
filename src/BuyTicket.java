import java.util.Scanner;

public class BuyTicket {

    public static void main(String[] args) {

        String movie, date;
        String[] movie_name = {" ", "Халк", "Дедпул", "Рассомаха"};
        String[] movie_date = {" ", "15.09", "16.09", "17.09"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветсвуем, раз вы здесь, вы хотите забронировать билет");
        System.out.println("выберете дату:\n 1. " + movie_date[1] + "\n 2. " + movie_date[2] + "\n 3. " + movie_date[3]);
        int b = scanner.nextInt(); date = movie_date[b];
        System.out.println("выберете фильм:\n 1." + movie_name[1] + "\n 2." + movie_name[2] + "\n 3." + movie_name[3]);
        int a = scanner.nextInt(); movie = movie_name[a];

        CreateTicket ticket = new CreateTicket(movie, date);
        CreateTicket.getInfoTicket();
        String ticketInfo = ticket.getTicketInfo();
        CreateTicket.writeToFile(ticketInfo);
    }
}
