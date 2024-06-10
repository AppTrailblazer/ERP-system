package Main;

import inventory_team.CreateInventoryPage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import menu.inventory.MenuItem;
import inventory_team.ReceivePage;
import inventory_team.ReleasePage;
import java.awt.CardLayout;
import javax.swing.JPanel;
import menu.SettingItem;
import menu.inventory.CreateInventoryItem;

/**
 *
 * @author CallPC-Speed
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
        
        //setting icons
        ImageIcon iconDashboard = new ImageIcon("dashboard.gif");
        ImageIcon iconInventory = new ImageIcon("inventory.gif");
        ImageIcon iconSubMenu = new ImageIcon("subMenu.png");
        ImageIcon iconSetting = new ImageIcon("setting.gif");
        
        //Create instances of the pages
        JPanel receivePage = new ReceivePage();
        JPanel releasePage = new ReleasePage();
        JPanel CreateInventoryPage = new CreateInventoryPage();
        
        //Add the pages to the bodyPanel with unique identifiers
        bodyPanel.add(receivePage, "ReceivePage");
        bodyPanel.add(releasePage, "ReleasePage");
        bodyPanel.add(CreateInventoryPage, "CreateInventoryPage");
        
        //create submenu
        MenuItem menuInventory1 = new MenuItem(iconSubMenu, "Receive", new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (bodyPanel.getLayout());
                cl.show(bodyPanel, "ReceivePage");
            }
            
        });
        MenuItem menuInventory2 = new MenuItem(iconSubMenu, "Release", new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (bodyPanel.getLayout());
                cl.show(bodyPanel, "ReleasePage");
           
            }
            
        });
        MenuItem menuInventory3 = new MenuItem(iconSubMenu, "Destruction", null);
        
        
        //craete super menu
        MenuItem menuDashboard = new MenuItem(iconDashboard, "Dashboard" , null);
        MenuItem menuInventory = new MenuItem(iconInventory, "Inventory", null, menuInventory1, menuInventory2, menuInventory3);
        MenuItem menuInventorysecond = new MenuItem(iconInventory, "Inventory2", null);
        SettingItem menuSetting = new SettingItem(iconSetting, "Setting");
        CreateInventoryItem btnCreateInventory = new CreateInventoryItem(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (bodyPanel.getLayout());
                cl.show(bodyPanel, "CreateInventoryPage");
            }
        });
        
        addSettingMenu(menuSetting);
        addMenu(menuDashboard,menuInventory,menuInventorysecond);
        addBtnCreateInventory(btnCreateInventory);
        
    }
    
    private void addMenu(MenuItem...menu){
        
        for(int i=0; i<menu.length; i++){
            menuInventory.add(menu[i]);
            ArrayList<MenuItem>subMenu = menu[i].getSubMenu();
            for(MenuItem m : subMenu){
                addMenu(m);
            }
        }
        menuInventory.revalidate();
    }
    
    private void addBtnCreateInventory(CreateInventoryItem btn){
        menuInventory.add(btn);
    }
    
    private void addSettingMenu(SettingItem menu){
        settingPanel.add(menu);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenu = new javax.swing.JPanel();
        logoPanel = new javax.swing.JPanel();
        Iblogo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuInventory = new javax.swing.JPanel();
        settingPanel = new javax.swing.JPanel();
        bodyPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainMenu.setBackground(new java.awt.Color(102, 99, 244));
        mainMenu.setBorder(null);
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

        menuInventory.setBackground(new java.awt.Color(204, 204, 204));
        menuInventory.setBorder(null);
        menuInventory.setLayout(new javax.swing.BoxLayout(menuInventory, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menuInventory);

        settingPanel.setBackground(new java.awt.Color(255, 255, 255));
        settingPanel.setBorder(null);

        javax.swing.GroupLayout settingPanelLayout = new javax.swing.GroupLayout(settingPanel);
        settingPanel.setLayout(settingPanelLayout);
        settingPanelLayout.setHorizontalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        settingPanelLayout.setVerticalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(settingPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1)
                .addGap(0, 0, 0)
                .addComponent(settingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(mainMenu, java.awt.BorderLayout.LINE_START);

        bodyPanel.setBackground(new java.awt.Color(204, 204, 204));
        bodyPanel.setLayout(new java.awt.CardLayout());
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
    private javax.swing.JPanel menuInventory;
    private javax.swing.JPanel settingPanel;
    // End of variables declaration//GEN-END:variables
}
