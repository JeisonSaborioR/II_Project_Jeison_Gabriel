
package ll_project_programmed_jeisonsaborio_gabrielperez;


public class Room {
    private int roomNumber;
    private int price;
    private TypeRoom typeRoom;

    public Room(int roomNumber, TypeRoom typeRoom,int price) {
        this.roomNumber = roomNumber;
        this.typeRoom = typeRoom;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

 

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public TypeRoom getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(TypeRoom typeRoom) {
        this.typeRoom = typeRoom;
    }    
    
}
