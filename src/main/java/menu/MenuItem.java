package menu;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author CallPC-Speed
 */
public class MenuItem extends javax.swing.JPanel {

    /**
     * @return the subMenu
     */
    public ArrayList<MenuItem> getSubMenu() {
        return subMenu;
    }

    /**
     * Creates new form MenuItem
     */
    private final ArrayList<MenuItem> subMenu = new ArrayList<>();
    
    public MenuItem(Icon icon, String menuName, MenuItem...subMenu) {
        initComponents();
        menuIcon.setIcon(icon);
        itemName.setText(menuName);
        
        this.setSize(new Dimension(Integer.MAX_VALUE, 45));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 45));
        this.setMinimumSize(new Dimension(Integer.MAX_VALUE, 45));
        
        for(int i =0; i<subMenu.length; i++){
            this.subMenu.add(subMenu[i]);
            subMenu[i].setVisible(false);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuIcon = new javax.swing.JLabel();
        itemName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        itemName.setText("Dashboard");
        itemName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                itemNameMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(menuIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(itemName, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(menuIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private boolean showing = false;
    private void itemNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemNameMousePressed
        if(showing){
            hideMenu();
            showing = false;
        }else{
            showMenu();
            showing = true;
        }
    }//GEN-LAST:event_itemNameMousePressed

    
    private void showMenu()
    {
        new Thread(new Runnable(){
            
            public void run(){
                for(int i = 0; i< subMenu.size(); i++){
                    sleep();
                    subMenu.get(i).setVisible(true);
                }
            }
            
        }).start();
    }
    
    private void hideMenu(){
        new Thread(new Runnable(){
            
            public void run(){
                for(int i = subMenu.size()-1; i>=0; i--){
                    sleep();
                    subMenu.get(i).setVisible(false);
                }
            }
        }).start();
    } 
    
    private void sleep(){
        try{
            Thread.sleep(20);
        }catch(Exception e){
            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel itemName;
    private javax.swing.JLabel menuIcon;
    // End of variables declaration//GEN-END:variables
}
