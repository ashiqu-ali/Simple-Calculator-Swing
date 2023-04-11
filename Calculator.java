import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {

    boolean opr = false;
    String old;
    int x = 0, i = 0;
    float[] a = new float[2];
    JFrame jf;
    JLabel displayLabel;
    JButton zeroB, oneB, twoB, threeB, fourB, fiveB, sixB, sevenB, eightB, nineB, dotB, divB, mulB, minB, plusB, equalB,
            clearB;

    public Calculator() {
        jf = new JFrame("Calculator");
        jf.getContentPane().setBackground(Color.BLACK);

        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(500, 150);

        displayLabel = new JLabel();
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setBounds(30, 50, 540, 50);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);

        jf.add(displayLabel);

        // 789 Buttons
        sevenB = new JButton("7");
        sevenB.setBounds(30, 130, 80, 80);
        sevenB.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(sevenB);
        sevenB.addActionListener(this);

        eightB = new JButton("8");
        eightB.setBounds(130, 130, 80, 80);
        eightB.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(eightB);
        eightB.addActionListener(this);

        nineB = new JButton("9");
        nineB.setBounds(230, 130, 80, 80);
        nineB.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(nineB);
        nineB.addActionListener(this);

        // 456 Buttons

        fourB = new JButton("4");
        fourB.setBounds(30, 230, 80, 80);
        fourB.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(fourB);
        fourB.addActionListener(this);

        fiveB = new JButton("5");
        fiveB.setBounds(130, 230, 80, 80);
        fiveB.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(fiveB);
        fiveB.addActionListener(this);

        sixB = new JButton("6");
        sixB.setBounds(230, 230, 80, 80);
        sixB.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(sixB);
        sixB.addActionListener(this);

        // 123Button

        oneB = new JButton("1");
        oneB.setBounds(30, 330, 80, 80);
        oneB.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(oneB);
        oneB.addActionListener(this);

        twoB = new JButton("2");
        twoB.setBounds(130, 330, 80, 80);
        twoB.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(twoB);
        twoB.addActionListener(this);

        threeB = new JButton("3");
        threeB.setBounds(230, 330, 80, 80);
        threeB.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(threeB);
        threeB.addActionListener(this);

        // .0= Button

        dotB = new JButton(".");
        dotB.setBounds(30, 430, 80, 80);
        dotB.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(dotB);
        dotB.addActionListener(this);

        zeroB = new JButton("0");
        zeroB.setBounds(130, 430, 80, 80);
        zeroB.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(zeroB);
        zeroB.addActionListener(this);

        equalB = new JButton("=");
        equalB.setBounds(230, 430, 80, 80);
        equalB.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(equalB);
        equalB.setBackground(Color.blue);
        equalB.addActionListener(this);

        // operators

        divB = new JButton("/");
        divB.setBounds(330, 130, 80, 80);
        divB.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(divB);
        divB.addActionListener(this);

        mulB = new JButton("x");
        mulB.setBounds(330, 230, 80, 80);
        mulB.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(mulB);
        mulB.addActionListener(this);

        minB = new JButton("-");
        minB.setBounds(330, 330, 80, 80);
        minB.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(minB);
        minB.addActionListener(this);

        plusB = new JButton("+");
        plusB.setBounds(330, 430, 80, 80);
        plusB.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(plusB);
        plusB.addActionListener(this);

        clearB = new JButton("C");
        clearB.setBounds(430, 430, 80, 80);
        clearB.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(clearB);
        clearB.addActionListener(this);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sevenB) {
            if (opr) {
                displayLabel.setText("7");
                opr = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "7");

            }

        } else if (e.getSource() == eightB) {
            if (opr) {
                displayLabel.setText("8");
                opr = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "8");

            }

        } else if (e.getSource() == nineB) {
            if (opr) {
                displayLabel.setText("9");
                opr = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "9");

            }

        } else if (e.getSource() == oneB) {
            if (opr) {
                displayLabel.setText("1");
                opr = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "1");

            }

        } else if (e.getSource() == twoB) {
            if (opr) {
                displayLabel.setText("2");
                opr = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "2");

            }

        } else if (e.getSource() == threeB) {
            if (opr) {
                displayLabel.setText("3");
                opr = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "3");

            }

        } else if (e.getSource() == fourB) {
            if (opr) {
                displayLabel.setText("4");
                opr = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "4");

            }

        } else if (e.getSource() == fiveB) {
            if (opr) {
                displayLabel.setText("5");
                opr = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "5");
            }

        } else if (e.getSource() == sixB) {
            if (opr) {
                displayLabel.setText("6");
                opr = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "6");

            }

        } else if (e.getSource() == zeroB) {
            if (opr) {
                displayLabel.setText("0");
                opr = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "0");

            }

        } else if (e.getSource() == dotB) {
            if (opr) {

                opr = false;
                displayLabel.setText(".");

            } else {
                displayLabel.setText(displayLabel.getText() + ".");

            }
        } else if (e.getSource() == plusB) {
            opr = true;
            old = displayLabel.getText();
            a[i++] = Float.parseFloat(old);
            System.out.println(a[i - 1] + "\n" + i);
            if (i > 1) {
                a[0] += a[1];

                i = 0;
            }

        } else if (e.getSource() == minB) {
            opr = true;
            old = displayLabel.getText();
            x = 2;
            a[i++] = Float.parseFloat(old);
            if (i > 1) {
                a[0] -= a[1];
                i = 0;
            }

        } else if (e.getSource() == divB) {
            opr = true;
            old = displayLabel.getText();
            x = 4;
            a[i++] = Float.parseFloat(old);
            if (i > 1) {
                a[0] /= a[1];
                i = 0;
            }

        } else if (e.getSource() == mulB) {
            opr = true;
            old = displayLabel.getText();
            x = 3;
            a[i++] = Float.parseFloat(old);
            if (i > 1) {
                a[0] *= a[1];
                i = 0;
            }

        } else if (e.getSource() == equalB) {
            old = displayLabel.getText();
            a[i++] = Float.parseFloat(old);
            System.out.println(i);

            if (x == 1) {
                a[0] += a[1];

            } else if (x == 2) {
                a[0] -= a[1];
            } else if (x == 3) {
                a[0] *= a[1];
            } else if (x == 3) {
                a[0] /= a[1];
            }

            displayLabel.setText(a[0] + "");
            a[1] = a[0] = 0;
            i = 0;

        } else if (e.getSource() == clearB) {
            displayLabel.setText("");
            a[1] = a[0] = 0;
            i = 0;
        }

    }
}