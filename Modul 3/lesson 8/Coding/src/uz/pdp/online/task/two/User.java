package uz.pdp.online.task.two;

public class User implements Cloneable {
    private String name;
    private String phone;
    private Role role;

    public User(String name, String phone, Role role) {
        this.name = name;
        this.phone = phone;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", role=" + role +
                '}';
    }

    public User shallowCopy() {
        return this;
    }

    public User deepCopy() {
        return new User(this.name, this.phone, this.role);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}