
package ll_project_programmed_jeisonsaborio_gabrielperez;

import java.util.ArrayList;


public class Hotel {
    private String name;
    private String address;
    private String country;
    private int phoneNumber;
    private int numberStars;
    private String accommodationType;
    private String hourCheckIn;
    private String hourCheckOut;
    private String requirementsCheckIn;
    protected ArrayList<String> photos;
    protected ArrayList<Attraction> attractionList;
    protected ArrayList<Service> serviceList;
    protected ArrayList<Staff> staffList;
    protected ArrayList<Reservation> reservationList;
    protected ArrayList<Season> seasonList;
    

    public Hotel(String name, String address, String country, int cellPhone, int numberStars, String accommodationType, String hourCheckIn, String hourCheckOut, String requirementsCheckIn) {
        this.name = name;
        this.address = address;
        this.country = country;
        this.phoneNumber = cellPhone;
        this.numberStars = numberStars;
        this.accommodationType = accommodationType;
        this.hourCheckIn = hourCheckIn;
        this.hourCheckOut = hourCheckOut;
        this.requirementsCheckIn = requirementsCheckIn;
        this.photos = new ArrayList<>();
        this.attractionList = new ArrayList<>();
        this.serviceList = new ArrayList<>();
        this.staffList = new ArrayList<>();
        this.seasonList = new ArrayList<>();
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCellPhone() {
        return phoneNumber;
    }

    public void setCellPhone(int cellPhone) {
        this.phoneNumber = cellPhone;
    }

    public int getNumberStars() {
        return numberStars;
    }

    public void setNumberStars(int numberStars) {
        this.numberStars = numberStars;
    }

    public String getAccommodationType() {
        return accommodationType;
    }

    public void setAccommodationType(String accommodationType) {
        this.accommodationType = accommodationType;
    }

    public String getHourCheckIn() {
        return hourCheckIn;
    }

    public void setHourCheckIn(String hourCheckIn) {
        this.hourCheckIn = hourCheckIn;
    }

    public String getHourCheckOut() {
        return hourCheckOut;
    }

    public void setHourCheckOut(String hourCheckOut) {
        this.hourCheckOut = hourCheckOut;
    }

    public String getRequirementsCheckIn() {
        return requirementsCheckIn;
    }

    public void setRequirementsCheckIn(String requirementsCheckIn) {
        this.requirementsCheckIn = requirementsCheckIn;
    }

    public ArrayList<String> getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos.add(photos);
    }   

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Attraction> getAttractionList() {
        return attractionList;
    }

    public void setAttractionList(Attraction attractionList) {
        this.attractionList.add(attractionList);
    }

    public ArrayList<Service> getServiceList() {
        return serviceList;
    }

    public void setService(Service service) {
        this.serviceList.add(service);
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(Staff staffList) {
        this.staffList.add(staffList);
    }

    public ArrayList<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(Reservation reservationList) {
        this.reservationList.add(reservationList);
    }

    public ArrayList<Season> getSeasonList() {
        return seasonList;
    }

    public void setSeasonList(Season seasonList) {
        this.seasonList.add(seasonList);
    }
    
    
    
    
    
}
