package RGMCode;

public class Friend extends Contact {
    private String telefonnummer;

    public Friend() {

    }

    public Friend(String name, String telefonnummer) {
        super(name);
        this.telefonnummer = telefonnummer;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "telefonnummer='" + telefonnummer + '\'' +
                "} " + super.toString();
    }

}
