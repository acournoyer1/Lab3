package hello;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<BuddyInfo> buddies;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    public AddressBook() {
        this.buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo bi)
    {
        buddies.add(bi);
    }

    public void removeBuddy(BuddyInfo bi)
    {
        buddies.remove(bi);
    }

    public int size()
    {
        return buddies.size();
    }

    public void clear()
    {
        buddies.clear();
    }

    public List<BuddyInfo> getBuddies() {
        return buddies;
    }

    public List<BuddyInfo> getBuddyInfoList() {
        return buddies;
    }

    public void setBuddyInfoList(List<BuddyInfo> buddyInfoList) {
        this.buddies = buddyInfoList;
    }

    @Override
    public String toString() {
        return "hello.AddressBook{" +
                "buddyInfoList=" + buddies +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static void main(String args[]) {
        AddressBook a = new AddressBook();
        a.addBuddy(new BuddyInfo("Alex", 22));
        a.addBuddy(new BuddyInfo("Bhavik", 22));
        a.addBuddy(new BuddyInfo("Amy", 22));
        System.out.print(a.toString());
    }
}
