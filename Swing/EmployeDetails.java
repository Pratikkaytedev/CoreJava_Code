package Swing;

import javax.swing.*;

public class EmployeDetails {

    JFrame jf;
    JLabel jname, jid, jaddress, jcity, jphone;
    JTextField txtname, txtid, txtaddress, txtphn;

    JComboBox jcbox;

    EmployeDetails() {
        jf = new JFrame();
        jid = new JLabel("ID");
        jid.setBounds(20, 20, 100, 20);
        txtid = new JTextField();
        txtid.setBounds(120, 20, 100, 20);


        jname = new JLabel("Name");
        jname.setBounds(20, 60, 100, 20);
        txtname = new JTextField();
        txtname.setBounds(120, 60, 100, 20);

        jcity = new JLabel("City");
        jcity.setBounds(20, 100, 100, 20);
        jcbox = new JComboBox();
//        jcbox.setBounds();


        jphone = new JLabel("Phone");
        jphone.setBounds(20, 140, 100, 20);
        txtphn = new JTextField();
        txtphn.setBounds(120, 140, 100, 20);

        jaddress = new JLabel("Address");
        jaddress.setBounds(20, 180, 100, 20);
        txtaddress = new JTextField();
        txtaddress.setBounds(120, 180, 100, 20);


        jf.add(jname);
        jf.add(jaddress);
        jf.add(jcity);
        jf.add(jid);
        jf.add(jphone);
        jf.add(txtname);
        jf.add(txtaddress);
        jf.add(txtid);
        jf.add(txtphn);

        jf.setSize(400, 400);
        jf.setVisible(true);
        jf.setLayout(null);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new EmployeDetails();
    }
}
