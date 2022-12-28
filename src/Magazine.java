import service.Printable;

public class Magazine implements Printable {
    String name;
    String type;

    public Magazine(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    static void printMagazines(Printable[] printable){
        System.out.println("\n <<<Magazines>>>");
        for (Printable pr:printable) {
            if(pr instanceof Magazine){
                System.out.println(pr);
            }
        }
    }
    @Override
    public void print() {
        System.out.printf("\nНазвание журнала: %s\nТип журнала: %s\n",name,type);
    }
    @Override
    public String toString() {
        return "\nMagazine: "+name+"\nType: "+type;
    }
}
