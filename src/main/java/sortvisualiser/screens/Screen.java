package sortvisualiser.screens;

import static sortvisualiser.MainApp.WIN_HEIGHT;
import static sortvisualiser.MainApp.WIN_WIDTH;

import java.awt.Dimension;

import javax.swing.JPanel;

import sortvisualiser.MainApp;


public abstract class Screen extends JPanel {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    protected MainApp app;
    
    public Screen(MainApp app) {
        this.app = app;
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(WIN_WIDTH, WIN_HEIGHT);
    }
    
    public abstract void onOpen();
}
