import java.text.SimpleDateFormat;
import java.util.Scanner;

import model.entities.Reservation;

import java.util.Date;;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Cria um objeto SimpleDateFormat com o formato "dd/MM/yyyy".

        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();
        sc.nextLine(); // Limpa o buffer do scanner após ler um inteiro.

        System.out.print("Check-in date (dd/MM/yyyy): ");
        String checkInStr = sc.nextLine();
        Date checkIn = sdf.parse(checkInStr); // Converte a string para um objeto Date usando o formato especificado.
       

        System.out.print("Check-out date (dd/MM/yyyy): ");
        String checkOutStr = sc.nextLine();
        Date checkOut = sdf.parse(checkOutStr); // Converte a string para um objeto Date usando o formato especificado.
        

        Reservation reservation = new Reservation(roomNumber, checkIn, checkOut); // Cria um novo objeto Reservation.
        System.out.println(reservation);

        System.out.print("Deseja alterar os dados da reserva? (s/n) ");
        char response = sc.next().charAt(0); // Lê a resposta do usuário (s ou n).
        response = Character.toLowerCase(response); // Converte a resposta para minúscula para facilitar a comparação.
        sc.nextLine();

        if(response == 's'){
            System.out.print("Check-in date (dd/MM/yyyy): ");
            String checkInStr2 = sc.nextLine();
            Date checkIn2 = sdf.parse(checkInStr2); // Converte a string para um objeto Date usando o formato especificado.
        

            System.out.print("Check-out date (dd/MM/yyyy): ");
            String checkOutStr2 = sc.nextLine();
            Date checkOut2 = sdf.parse(checkOutStr2); // Converte a string para um objeto Date usando o formato especificado.

            reservation.updateDates(checkIn2, checkOut2);
            System.out.println("Reserva atualizada: ");
            System.out.println(reservation); // Exibe a reserva atualizada.
        }
        else if(response == 'n'){
            System.out.println("Reserva mantida: " + reservation); // Exibe a reserva mantida.
        }
        else{
            System.out.println("Resposta inválida. Tente novamente."); // Mensagem de erro para resposta inválida.
        }

    }
}
