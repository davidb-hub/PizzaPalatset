package view;

import model.Drinks;
import model.Misc;
import model.Pasta;
import model.Pizza;
import model.Product;
import model.Sallads;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Ingredients;
import model.Items;
import baker.Baker;
import java.awt.event.MouseMotionListener;
import javax.swing.JList;
import javax.swing.ListModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author minco
 */
public class MenyView extends javax.swing.JFrame {

    private ArrayList<Items> orderList = new ArrayList<>();
    private ArrayList<Pizza> orderPizzaList = new ArrayList<>();
    private Baker baker;
   
    /**
     * Creates new form Meny
     */
    public MenyView() {

        initComponents();
        SetPizzaList();
        totalField.setText("0");
        getContentPane().setBackground(new Color(0, 204, 204));
        setLocationRelativeTo(null);
        setTitle("Pizza Palatset");
        baker = new Baker(this);
        setResizable(false);
        setSize(800, 600);
        shoppingCart.setFont(new Font("Tahoma", 24,24));
        productList.setFont(new Font("Tahoma",24,24));
        
        shoppingCart.addMouseMotionListener(new MouseMotionListener(){

            @Override
            public void mouseDragged(MouseEvent e) {

                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                JList l = (JList)e.getSource();
                ListModel m = l.getModel();
                int index = l.locationToIndex(e.getPoint());
                if(index > -1){
                    for(Pizza p : orderPizzaList){
                        if(m.getElementAt(index).toString().equals(p.toString())){
                            l.setToolTipText(p.getIngredients().toString());
                        } 
                             
                    }
                    for(Items i : orderList){
                        if(m.getElementAt(index).toString().equals(i.toString())){
                            l.setToolTipText(m.getElementAt(index).toString());
                        }
                    }
                   
                }
            }
            
        });
     
     

    }

    public void SetOvrigtList() {
        DefaultListModel listModel = new DefaultListModel();
        for (Misc m : Product.getInstance().getMiscList()) {
            listModel.addElement(m.toString());
        }
        productList.setModel(listModel);
    }

    public void SetDryckList() {
        DefaultListModel listModel = new DefaultListModel();
        for (Drinks d : Product.getInstance().getDrinksList()) {
            listModel.addElement(d.toString());
        }
        productList.setModel(listModel);
    }

    public void SetSalladList() {
        DefaultListModel listModel = new DefaultListModel();
        for (Sallads s : Product.getInstance().getSalladList()) {
            listModel.addElement(s.toString());
        }
        productList.setModel(listModel);
    }

    public void SetPastaList() {
        DefaultListModel listModel = new DefaultListModel();
        for (Pasta p : Product.getInstance().getPastaList()) {
            listModel.addElement(p.toString());
        }
        productList.setModel(listModel);
    }

    public void SetPizzaList() {
        DefaultListModel listModel = new DefaultListModel();
        for (Pizza p : Product.getInstance().getPizzaList()) {
            listModel.addElement(p.toString());
        }
        productList.setModel(listModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        productList = new javax.swing.JList<String>();
        clear = new javax.swing.JButton();
        bestall = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        shoppingCart = new javax.swing.JList<String>();
        jLabel2 = new javax.swing.JLabel();
        removeItem = new javax.swing.JButton();
        modifyPizza = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        combo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pizza", "Pasta", "Sallad", "Dryck", "Övrigt" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        combo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                comboPropertyChange(evt);
            }
        });

        productList.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        productList.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                productListPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(productList);

        clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear.setText("Rensa");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        bestall.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bestall.setText("Beställ");
        bestall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestallActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Total pris");

        totalField.setEditable(false);
        totalField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        totalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFieldActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setText("Lägg till");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        shoppingCart.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                shoppingCartPropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(shoppingCart);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText(":-");

        removeItem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        removeItem.setText("Ta bort");
        removeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemActionPerformed(evt);
            }
        });

        modifyPizza.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        modifyPizza.setText("Ändra");
        modifyPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyPizzaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(78, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bestall)
                                .addGap(18, 18, 18)
                                .addComponent(removeItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(modifyPizza)
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clear)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeItem)
                    .addComponent(bestall)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyPizza))
                .addGap(21, 21, 21)
                .addComponent(clear)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_comboPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_comboPropertyChange

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed

        String selected = combo.getSelectedItem().toString();
        switch (selected) {
            case "Pizza":
                SetPizzaList();
                break;

            case "Pasta":
                SetPastaList();
                break;

            case "Sallad":
                SetSalladList();
                break;

            case "Dryck":
                SetDryckList();
                break;

            case "Övrigt":
                SetOvrigtList();
                break;

        }
    }//GEN-LAST:event_comboActionPerformed

    private void setTotalField() {
        int totalSumma = 0;
        for (Pizza p : orderPizzaList) {
            totalSumma += p.getPrice();
        }
        for (Items i : orderList) {
            totalSumma += i.getPrice();
        }
        totalField.setText(Integer.toString(totalSumma));

    }

    private void setShoppingCartModel() {
        DefaultListModel model = new DefaultListModel();
        for (Pizza p : orderPizzaList) {
            model.addElement(p.toString());
        }

        for (Items i : orderList) {
            model.addElement(i.toString());
        }

        shoppingCart.setModel(model);

    }


    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        try {
            String value = productList.getSelectedValue();

            int breakPoint = value.lastIndexOf(' ');
            String productName = value.substring(0, breakPoint);

            if (combo.getSelectedItem().toString().equals("Pizza")) {
                if (productName.equals("Vesuvio")) {
                    Pizza vesuvio = new Pizza("Vesuvio", 75);
                    Ingredients ham = new Ingredients("Ham", 0);
                    vesuvio.addIngredient(ham);
                    orderPizzaList.add(vesuvio);
                    setTotalField();
                } else if (productName.equals("Mexicana")) {
                    Pizza mexicana = new Pizza("Mexicana", 75);
                    Ingredients mincedMeat = new Ingredients("Minced Meat", 0);
                    Ingredients chilliPeppers = new Ingredients("Chilli Peppers", 0);
                    Ingredients hotSauce = new Ingredients("Hot Sauce", 0);
                    mexicana.addIngredient(mincedMeat);
                    mexicana.addIngredient(chilliPeppers);
                    mexicana.addIngredient(hotSauce);
                    orderPizzaList.add(mexicana);
                    setTotalField();
                } else if (productName.equals("Hawaii")) {
                    Pizza hawaii = new Pizza("Hawaii", 75);
                    Ingredients ham = new Ingredients("Ham", 0);
                    Ingredients pineaple = new Ingredients("Pineaple", 0);
                    hawaii.addIngredient(ham);
                    hawaii.addIngredient(pineaple);
                    orderPizzaList.add(hawaii);
                    setTotalField();
                } else if (productName.equals("Kebab")) {
                    Pizza kebab = new Pizza("Kebab", 75);
                    Ingredients kebabMeat = new Ingredients("Kebab Meat", 0);
                    Ingredients chilliPeppers = new Ingredients("Chilli Peppers", 0);
                    Ingredients kebabSauce = new Ingredients("Kebab Sauce", 0);
                    kebab.addIngredient(kebabMeat);
                    kebab.addIngredient(chilliPeppers);
                    kebab.addIngredient(kebabSauce);
                    orderPizzaList.add(kebab);
                    setTotalField();
                } else if (productName.equals("Margherita")) {
                    Pizza margherita = new Pizza("Margherita", 75);
                    orderPizzaList.add(margherita);
                    setTotalField();
                }

            } else if (combo.getSelectedItem().toString().equals("Pasta")) {
                for (Pasta p : Product.getInstance().getPastaList()) {
                    if (productName.equals(p.getName())) {
                        orderList.add(p);
                        setTotalField();
                    }
                }
            } else if (combo.getSelectedItem().toString().equals("Sallad")) {
                for (Sallads s : Product.getInstance().getSalladList()) {
                    if (productName.equals(s.getName())) {
                        orderList.add(s);
                        setTotalField();
                    }
                }
            } else if (combo.getSelectedItem().toString().equals("Dryck")) {
                for (Drinks d : Product.getInstance().getDrinksList()) {
                    if (productName.equals(d.getName())) {
                        orderList.add(d);
                        setTotalField();
                    }
                }
            } else if (combo.getSelectedItem().toString().equals("Övrigt")) {
                for (Misc m : Product.getInstance().getMiscList()) {
                    if (productName.equals(m.getName())) {
                        orderList.add(m);
                        setTotalField();
                    }
                }
            }
            setShoppingCartModel();
        } catch (NullPointerException E) {

        }
    }//GEN-LAST:event_addActionPerformed

    private void productListPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_productListPropertyChange

    }//GEN-LAST:event_productListPropertyChange

    private void bestallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestallActionPerformed

        if (!orderList.isEmpty() || !orderPizzaList.isEmpty()) {
            String s = "";

            for (int i = 0; i < orderList.size(); i++) {
                s = s + orderList.get(i) + "\n";
            }
            for (Pizza p : orderPizzaList) {
                s += p.toString() + "\n";
            }
            s += "Total: " + totalField.getText() + " Kr";
            int result = JOptionPane.showConfirmDialog(null, "Totala kostnaden är: " + totalField.getText()
                    + " kr, Vänligen acceptera för att betala", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (result == 0) {
                JOptionPane.showMessageDialog(null, "Din order är skickad: \n" + s, "Kvitto", JOptionPane.PLAIN_MESSAGE);
                clear.doClick();
                baker.makeOrder(s);
            }
        }


    }//GEN-LAST:event_bestallActionPerformed

    private void totalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalFieldActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        totalField.setText("0");
        combo.setSelectedIndex(0);

        orderList.clear();
        orderPizzaList.clear();

        DefaultListModel model = new DefaultListModel();
        String s = "";
        model.addElement(s);
        shoppingCart.setModel(model);


    }//GEN-LAST:event_clearActionPerformed

    private void removeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemActionPerformed
        try {
            String selected = shoppingCart.getSelectedValue();
            System.out.println(selected);
            for (int i = 0; i < orderPizzaList.size(); i++) {
                if (selected.equals(orderPizzaList.get(i).toString())) {
                    orderPizzaList.remove(i);
                }
            }
            for (int i = 0; i < orderList.size(); i++) {

                if (selected.equals(orderList.get(i).getName())) {
                    orderList.remove(i);
                }
            }

            setShoppingCartModel();
            setTotalField();

        } catch (Exception E) {
            System.out.println(E.getMessage());

        }
    }//GEN-LAST:event_removeItemActionPerformed

    private void modifyPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyPizzaActionPerformed

        try {
            String selectedString = shoppingCart.getSelectedValue();
            int index = shoppingCart.getSelectedIndex();
            for (int i = 0; i < orderPizzaList.size(); i++) {
                if (selectedString.equals(orderPizzaList.get(i).toString())) {

                    ModifyPizzaView modify = new ModifyPizzaView(orderPizzaList.get(i));
                    modify.modify();
                    modify.setTitle("Pizzamodifieraren 2.0");
                    modify.setAlwaysOnTop(true);
                    modify.setLocationRelativeTo(null);
                    modify.setVisible(true);

                    //Kollar när modifyPizzaView tappar fokus, då uppdaterar vi totala priset.
                    modify.addWindowFocusListener(new WindowFocusListener() {

                        @Override
                        public void windowGainedFocus(WindowEvent e) {
                        }

                        @Override
                        public void windowLostFocus(WindowEvent e) {
                            setTotalField();
                            setShoppingCartModel();
                        }

                    });

                }

            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_modifyPizzaActionPerformed

    private void shoppingCartPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_shoppingCartPropertyChange

    }//GEN-LAST:event_shoppingCartPropertyChange

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenyView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton bestall;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton modifyPizza;
    private javax.swing.JList<String> productList;
    private javax.swing.JButton removeItem;
    private javax.swing.JList<String> shoppingCart;
    private javax.swing.JTextField totalField;
    // End of variables declaration//GEN-END:variables
}
