public class Main {
    public static void main(String[] args) {
        NoteBook n1 = new NoteBook("Apple","MacOS",8,Color.GRAY,17);
        NoteBook n2 = new NoteBook("ASUS","Windows 10",16,Color.WHITE,15);
        NoteBook n3 = new NoteBook("Apple","MacOS",32,Color.PINK,19);
        NoteBook n4 = new NoteBook("ASUS","Windows 10",4,Color.SILVER,17);
        NoteBook n5 = new NoteBook("ASUS","Windows 10",4,Color.WHITE,17);
        NoteBook n6 = new NoteBook("ASUS","Windows 10",8,Color.PINK,19);
        NoteBook n7 = new NoteBook("Aser","Windows 10",8,Color.WHITE,15);
        NoteBook n8 = new NoteBook("Aser","Windows 10",16,Color.WHITE,19);
        NoteBook n9 = new NoteBook("Aser","Windows 10",20,Color.BLACK,17);
        NoteBook n10 = new NoteBook("HP","Windows 10",16,Color.BLACK,19);
        NoteBook n11= new NoteBook("HP","Windows 10",8,Color.BLACK,15);
        NoteBook n12 = new NoteBook("HP","Windows 10",32,Color.GRAY,15);
        NoteBook n13 = new NoteBook("ASUS","Windows 10",16,Color.GRAY,15);
        NoteBook n14 = new NoteBook("Lenovo","Windows 10",16,Color.YELLOW,17);
        NoteBook n15 = new NoteBook("Lenovo","Windows 10",16,Color.SILVER,17);
        NoteBook n16 = new NoteBook("Apple","MacOS",8,Color.SILVER,19);
        NoteBook n17 = new NoteBook("Apple","MacOS",8,Color.RED,17);
        System.out.println(NoteBook.sorted(NoteBook.getList()));


    }
}