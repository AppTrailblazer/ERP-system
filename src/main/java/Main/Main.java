package Main;

import java.util.ArrayList;
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
        //logo setting
        ImageIcon iconLogo = new ImageIcon("logo.png");
        Iblogo.setIcon(iconLogo);
        
        //craete super menu
        ImageIcon iconDashboard = new ImageIcon("dashboard.png");
        ImageIcon iconInventory = new ImageIcon("inventory.png");
        ImageIcon iconSubMenu = new ImageIcon("subMenu.png");
        
        //create submenu
        
        MenuItem menuInventory1 = new MenuItem(iconSubMenu, "Release");
        MenuItem menuInventory2 = new MenuItem(iconSubMenu, "Receive");
        MenuItem menuInventory3 = new MenuItem(iconSubMenu, "Destruction");
        
        MenuItem menuDashboard = new MenuItem(iconDashboard, "Dashboard" );
        MenuItem menuInventory = new MenuItem(iconInventory, "Inventory", menuInventory1, menuInventory2, menuInventory3);
        
        addMenu(menuDashboard,menuInventory);
    }
    
    private void addMenu(MenuItem...menu){
        for(int i=0; i<menu.length; i++){
            menus.add(menu[i]);
            ArrayList<MenuItem>subMenu = menu[i].getSubMenu();
            for(MenuItem m : subMenu){
                addMenu(m);
            }
        }
        menus.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenu = new javax.swing.JPanel();
        logoPanel = new javax.swing.JPanel();
        Iblogo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        settingPanel = new javax.swing.JPanel();
        bodyPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainMenu.setBackground(new java.awt.Color(102, 99, 244));
        mainMenu.setPreferredSize(new java.awt.Dimension(250, 449));

        logoPanel.setBackground(new java.awt.Color(255, 255, 255));
        logoPanel.setBorder(null);

        Iblogo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Iblogo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Iblogo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        menus.setBorder(null);
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        settingPanel.setBackground(new java.awt.Color(102, 102, 102));
        settingPanel.setBorder(null);

        javax.swing.GroupLayout settingPanelLayout = new javax.swing.GroupLayout(settingPanel);
        settingPanel.setLayout(settingPanelLayout);
        settingPanelLayout.setHorizontalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        settingPanelLayout.setVerticalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(settingPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(settingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGap(0, 508, Short.MAX_VALUE)
        );

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1032, 547));
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
    private javax.swing.JLabel Iblogo;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel settingPanel;
    // End of variables declaration//GEN-END:variables
}
