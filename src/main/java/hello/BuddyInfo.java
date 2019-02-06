package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BuddyInfo {
    private String name;
    private int age;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public BuddyInfo(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public BuddyInfo(BuddyInfo b)
    {
        this(b.name, b.age);
    }

    public BuddyInfo(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting()
    {
        return "Hey Buddy!";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isOver18()
    {
        return age > 18;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age + " years old";
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
        if(!(o instanceof BuddyInfo)) return false;
        BuddyInfo b = (BuddyInfo)o;
        return this.name.equals(b.name) && this.age == b.age;
    }
}
