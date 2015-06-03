
package ll_project_programmed_jeisonsaborio_gabrielperez;


public class Room {
    private int roomNumber;
  
    private TypeRoom typeRoom;

    public Room(int roomNumber, TypeRoom typeRoom) {
        this.roomNumber = roomNumber;
        this.typeRoom = typeRoom;
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
