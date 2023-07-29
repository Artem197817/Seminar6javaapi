import java.util.List;

public class Sort {
    public static List<NoteBook> sortManufactured(List<NoteBook> l){
        String s = Dialog.inputPane("Введите производителя");
        return l.stream()
                .filter(x -> s.equals(x.getManufacturer()))
                .toList();
    }
    public static List<NoteBook> sortOS(List<NoteBook> l){
        String s = Dialog.inputPane("Введите операционную систему");
        return  l.stream()
                .filter(x -> s.equals(x.getOs()))
                .toList();
    }
    public static List<NoteBook> sortColor (List<NoteBook> l){
        Color s = Color.valueOf(Dialog.inputPane("Введите цвет"));
        return  l.stream()
                .filter(x -> s == x.getColor())
                .toList();
    }
    public static List<NoteBook> sortOZU(List<NoteBook> l) {
        int n = Dialog.checkID(" Введите минимальный объем памяти");
        return l.stream()
                .filter(x -> x.getOzu() >= n)
                .toList();
    }
    public static List<NoteBook> sortDiagonal(List<NoteBook> l) {
        int n = Dialog.checkID(" Введите минимальный размер экрана");
        return l.stream()
                .filter(x -> x.getDiagonal() >= n)
                .toList();
    }
}
