import javax.swing.*;

public class Dialog {
    public static String inputPane(String s){
        return JOptionPane.showInputDialog(null,s);
    }
    public  static  boolean confirmPane(String message){
        int is = JOptionPane.showConfirmDialog(null,message,"Выберите Да/Нет",
                JOptionPane.YES_NO_OPTION);
        return is == JOptionPane.YES_OPTION;
    }
    public static int checkSelection() {
        String id;
        while (true) {
            id = Dialog.inputPane(" Введите критерий отбора: " + "\n" +
                    "1 - manufactured" + "\n" +
                    "2 - os " + "\n" +
                    "3 - ozu" + "\n" +
                    "4 - color" + "\n" +
                    "5 - diagonal");
            if (id != null)
                if (id.matches("[0-9]*"))
                    if (Integer.parseInt(id) <= 5 && Integer.parseInt(id) > 0)
                        break;
        }
        return Integer.parseInt(id);
    }
    public static int checkID(String s) {
        String id;
        while (true) {
            id = Dialog.inputPane(s);
            if (id != null)
                if (id.matches("[0-9]*"))
                        break;
        }
        return Integer.parseInt(id);
    }

}
