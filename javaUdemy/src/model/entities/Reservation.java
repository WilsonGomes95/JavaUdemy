package model.entities;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    // SimpleDateFormat é uma classe que formata e analisa datas em um formato específico.
    // O formato "dd/MM/yyyy" significa que a data será exibida no formato dia/mês/ano.
      
    public Reservation() {
    }
      
    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public Date getCheckIn() {
      return checkIn;
    }
    public Date getCheckOut() {
      return checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime(); // Calculando a diferença entre as datas em milissegundos.
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // Convertendo a diferença para dias.
    }

    public void updateDates(Date checkIn, Date checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString(){
        return "Room"
        + roomNumber
        + ", check-in: "
        + sdf.format(this.checkIn)
        + ", check-out: "
        + sdf.format(this.checkOut)
        + ", "
        + duration()
        + " nights";
    }





}
