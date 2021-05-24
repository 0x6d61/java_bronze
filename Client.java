public class Client {
    private int id;
    private String name;

    public Client(int id,String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof Client == false) {
            return false;
        }

        Client target = (Client) obj;
        return this.id == target.id;
    }
}