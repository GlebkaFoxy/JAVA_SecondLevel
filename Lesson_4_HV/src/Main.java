import javax.swing.*;
import java.awt.*;

/**
 * Created by Глеб on 27.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Form7 form2 = new Form7();
    }
}
//Просто форма
class Form1 extends JFrame{
    public Form1(){
        setTitle("Test window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300, 400,400);

        setVisible(true);
    }
}
//Кнопки через массив и менеджер размещения BorderLayout
class Form2 extends JFrame{

    public Form2 (){
        setTitle("Test 2");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300, 400,400);
        JButton[]jbc = new JButton[5];  //создам массив кнопок

        for (int i=0;i<jbc.length;i++){
            jbc[i]=new JButton("#"+i);
        }

        setLayout(new BorderLayout());  //Выбор компоновщика элементов
        add(jbc[0],BorderLayout.EAST); //Добавление кнопки на форму с указанием расположения
        add(jbc[1],BorderLayout.WEST);
        add(jbc[2],BorderLayout.SOUTH);
        add(jbc[3],BorderLayout.NORTH);
        add(jbc[4],BorderLayout.CENTER);


        setVisible(true);
    }


}
//Другой метод создания кнопок
class Form3 extends JFrame{
    public Form3(){
        setTitle("Test 3");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300, 500,500);
        //Создаём объект JButtonС текстом 2 конструктор.
        //Сразу добавляем кнопку и настраиваем расположение ез создания ибъекта для компоновщика.
        JButton button = new JButton("Button(START)");
        add(button, BorderLayout.PAGE_START);
        //Создам новый объект с той-же ссылкой??
        //Даём размер кнопки и распологаем. кнопка будет не меньше или больше
        button = new JButton("Button2(CENTER)");
        button.setPreferredSize(new Dimension(300,200));
        add(button,BorderLayout.CENTER);
        button = new JButton("Button3(LINE_START)");
        add(button,BorderLayout.LINE_START);
        button = new JButton("Button4(END)");
        add(button,BorderLayout.PAGE_END);
        button = new JButton("Button5(LINE_END)");
        add(button, BorderLayout.LINE_END);
        setVisible(true);
    }
}
//BoxLayout расположение в столбик - строку
class Form4 extends JFrame{
    public Form4 (){
        setTitle("Test4boxLayout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200,200,500,500);
        JButton[]jButtons =new JButton[10];
        //1.SL метод позволяющий задать менеджер размещения
        //2.GCP?
        //BoxLayout.Y-X Расположение по горизонтали или вертикали.
        setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS));

        for (int i=0;i<jButtons.length;i++){
            jButtons[i]=new JButton("#"+(i+1));
            //Не знаю что ниже
            jButtons[i].setAlignmentX(CENTER_ALIGNMENT);
            add(jButtons[i]);
        }

        setVisible(true);
    }
}
//FlowLayout перенос строки
class Form5 extends JFrame{
    public Form5 (){
        setTitle("Test4boxLayout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200,200,400,400);
        JButton[]jButtons =new JButton[10];

        setLayout(new FlowLayout());

        for (int i=0;i<jButtons.length;i++){
            jButtons[i]=new JButton("#"+(i+1));
            //Не знаю что ниже

            add(jButtons[i]);
        }

        setVisible(true);
    }
    }
//GridLayout Выравниваются в таблице, заданного размера.
class Form6 extends JFrame{
    public Form6 (){
        setTitle("Test4boxLayout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200,200,400,400);
        JButton[]jButtons =new JButton[9];
        JButton jb = new JButton("Start");


        setLayout(new GridLayout(3,3));
        for (int i=0;i<jButtons.length;i++){
            jButtons[i]=new JButton("#"+(i+1));
            //Не знаю что ниже

            add(jButtons[i]);
        }

        setVisible(true);
    }
}
//GridLayout Выравнивание в таблице, с установкой координат.
class Form7 extends JFrame{
    public Form7 (){
        setBounds(200,200,800,600);
        setTitle("Form 7");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,2));
        //JPanel ???
        JPanel[] jPanel = new JPanel[4];
        for (int i =0;i<jPanel.length;i++){
            jPanel[i]=new JPanel();
            add(jPanel[i]);
            //Строка ниже неизвестна ???
            jPanel[i].setBackground(new Color(100+i*40,100+i*40,100+i*40));
        }

        jPanel[0].setLayout(new BorderLayout());
        //JTextArea ???
        JTextArea jTextArea = new JTextArea();
        //JScrollPane ???
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        // ???
        jPanel[0].add(jScrollPane);



        jPanel[1].setLayout(new FlowLayout());
        //JRadioButton ???
        JRadioButton [] jRadioButton = new JRadioButton[4];
        //ButtonGroup ???
        ButtonGroup buttonGroup = new ButtonGroup();

        for (int i =0; i<jRadioButton.length;i++){
            jRadioButton[i]= new JRadioButton("Option #"+i);
            buttonGroup.add(jRadioButton[i]);
            jPanel[1].add(jRadioButton[i]);
        }
        ///JCheckBox ???
        JCheckBox[]jCheckBoxes =new JCheckBox[4];
        for (int i =0; i<jCheckBoxes.length;i++){
            jCheckBoxes[i]=new JCheckBox("Check #"+i);
            jPanel[1].add(jCheckBoxes[i]);
        }


        jPanel[2].setLayout(new FlowLayout());




        setVisible(true);

    }

}