public class Location {
    public boolean hasSuitableFood() {
        return ((int)(Math.random() * 10)) == 0 ? false : true;
    }
}