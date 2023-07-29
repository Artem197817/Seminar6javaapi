import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NoteBook {

    /*  Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    Создать множество ноутбуков.
    Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
            1 - ОЗУ 2 - Объем ЖД 3 - Операционная система 4 - Цвет …
    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
    Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.*/
    private final String manufacturer;
    private final String os;
    private final int ozu;
    private final Color color;
    private final int diagonal;
    public static List<NoteBook> list = new ArrayList<>();
    public static int count = 0;

    public NoteBook(String manufacturer, String os, int ozu, Color color, int diagonal) {
        this.manufacturer = manufacturer;
        this.os = os;
        this.ozu = ozu;
        this.color = color;
        this.diagonal = diagonal;
        list.add(this);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getOs() {
        return os;
    }

    public int getOzu() {
        return ozu;
    }

    public Color getColor() {
        return color;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public static List<NoteBook> getList() {
        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteBook noteBook = (NoteBook) o;
        return ozu == noteBook.ozu && diagonal == noteBook.diagonal && Objects.equals(manufacturer, noteBook.manufacturer) && Objects.equals(os, noteBook.os) && color == noteBook.color && Objects.equals(list, noteBook.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, os, ozu, color, diagonal, list);
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "manufacturer='" + manufacturer + '\'' +
                ", os='" + os + '\'' +
                ", ozu=" + ozu + " GB" +
                ", color=" + color +
                ", diagonal=" + diagonal +
                '}'+ "\n";
    }
    public static List <NoteBook> listSorted = new ArrayList<>();
    public static List<NoteBook> sorted (List<NoteBook> list){
        if (count == 0) {
            listSorted = list;
            count++;
        }
        int sort = Dialog.checkSelection();
        switch (sort) {
            case 1 -> listSorted = Sort.sortManufactured(listSorted);
            case 2 -> listSorted = Sort.sortOS(listSorted);
            case 4 -> listSorted = Sort.sortColor(listSorted);
            case 3 -> listSorted = Sort.sortOZU(listSorted);
            case 5 -> listSorted = Sort.sortDiagonal(listSorted);
        }
        if (listSorted.isEmpty()) {
            count = 0;
            System.out.println("Нет ноутбуков соответствующих критериям отбора");
            return list;
        }
        if (Dialog.confirmPane("Продолжить отбор да/нет")) {
            System.out.println(listSorted);
            NoteBook.sorted(listSorted);
        }
    count = 0;
    return listSorted;
    }

}
