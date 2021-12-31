package by.zimin.employee;

import java.util.Arrays;
import java.util.Objects;

public class Employee {

    private String firstName;
    private String lastName;
    private String position;
    private IdCard card;
    private Room room[] = new Room[5];
    private int countRoom = 0;
    private Department department;
    private PastPosition pastPosition[] = new PastPosition[5];
    private int countPastPosition = 0;

    public Employee(String firstName, String lastName, String position, IdCard card, Room room, Department department, PastPosition pastPosition) {
        this.position = position;
        this.firstName = firstName;
        this.lastName = lastName;
        this.card = card;
        this.room[countRoom] = room;
        this.department = department;
        this.pastPosition[countPastPosition] = pastPosition;
        countRoom++;
        countPastPosition++;
    }

    public Employee(String firstName, String lastName, String position, IdCard card, Room room) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.card = card;
        this.room[countRoom] = room;
        countRoom++;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public IdCard getCard() {
        return card;
    }

    public void setCard(IdCard card) {
        this.card = card;
    }

    public Room[] getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room[countRoom] = room;
        countRoom++;
    }

    public void deleteRoom(Room r) {
        for (int i = 0; i < this.room.length; i++) {
            if (r.equals(this.room[i])) {
                this.room[i] = null;
            }
        }
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public PastPosition[] getPastPosition() {
        return pastPosition;
    }

    public void setPastPosition(PastPosition pastPosition) {
        this.pastPosition[countPastPosition] = pastPosition;
        countPastPosition++;
    }

    public void deletePastPosition(PastPosition p) {
        for (int i = 0; i < this.pastPosition.length; i++) {
            if (p.equals(this.pastPosition[i])) {
                this.pastPosition[i] = null;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return countRoom == employee.countRoom && countPastPosition == employee.countPastPosition && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(position, employee.position) && Objects.equals(card, employee.card) && Arrays.equals(room, employee.room) && Objects.equals(department, employee.department) && Arrays.equals(pastPosition, employee.pastPosition);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName, position, card, countRoom, department, countPastPosition);
        result = 31 * result + Arrays.hashCode(room);
        result = 31 * result + Arrays.hashCode(pastPosition);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", card=" + card +
                ", room=" + Arrays.toString(room) +
                ", department=" + department +
                ", pastPosition=" + Arrays.toString(pastPosition) +
                '}';
    }
}
