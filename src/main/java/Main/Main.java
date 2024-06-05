package Main;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import menu.MenuItem;

/**
 *
 * @author Vitamin
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        excute();
    }
    
    
    private void excute(){
        
        ImageIcon iconDashboard = new ImageIcon("dashboard.png");
        ImageIcon iconInventory = new ImageIcon("inventory.png");
        ImageIcon iconSubMenu = new ImageIcon("subMenu.png");
        
        MenuItem menuDashboard = new MenuItem(iconDashboard, "Staff Manegement");
        MenuItem menuInventory = new MenuItem(iconInventory, "Staff Manegement");
        MenuItem menuSubMenu = new MenuItem(iconSubMenu, "Staff Manegement");
        
        addMenu(menuDashboard,menuInventory, menuSubMenu);
    }
    
    private void addMenu(MenuItem...menu){
        for(int i=0; i<menu.length; i++){
            menus.add(menu[i]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        mainMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        bodyPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        topPanel.setBackground(new java.awt.Color(70, 130, 248));
        topPanel.setPreferredSize(new java.awt.Dimension(734, 50));

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(topPanel, java.awt.BorderLayout.PAGE_START);

        mainMenu.setBackground(new java.awt.Color(102, 99, 244));
        mainMenu.setPreferredSize(new java.awt.Dimension(250, 449));

        jScrollPane1.setBorder(null);

        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        getContentPane().add(mainMenu, java.awt.BorderLayout.LINE_START);

        bodyPanel.setBackground(new java.awt.Color(239, 241, 245));

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1032, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
