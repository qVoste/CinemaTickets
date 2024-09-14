import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CreateTicket {
    static String movieTicket, dateTicket, idTicket;
//данные билета
    public CreateTicket(String movieTicket, String dateTicket) {
        this.movieTicket = movieTicket;
        this.dateTicket = dateTicket;
        this.idTicket = randomIdTicket();
    }
//создание уникального айди билета
    private static String randomIdTicket(){
        String character = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        Random random = new Random();
        StringBuilder id = new StringBuilder();
        for(int i = 0; i < 6; i++){
            int index = random.nextInt(character.length());
            id.append(character.charAt(index));
        }
     return id.toString();
    }
//получение инфы о бронировке билета
    public static void getInfoTicket(){
        System.out.println("Билет забронирован)");
        System.out.println(" Дата: " + dateTicket);
        System.out.println(" Фильм: "+ movieTicket);
        System.out.println(" Уникальный айди билета: " + idTicket);
    }
//инфа для записи в файл
    public String getTicketInfo(){
        return "Дата: " + dateTicket + "\nФильм: "+ movieTicket + "\nУникальный айди билета: " + idTicket;
    }
//запись в файл
    public static void writeToFile(String tickets) {
        try (FileWriter writer = new FileWriter("tickets.txt", true)) {
            writer.write(tickets + "\n\n");  // Добавляем билет в файл
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в файл: " + e.getMessage());
        }
    }
}
