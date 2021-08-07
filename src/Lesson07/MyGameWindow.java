package Lesson07;

import javax.swing.*;
import java.awt.*;


public class  MyGameWindow extends JFrame {

    private int winWidth = 1000;
    private int winHeight = 800;
    private int winPosX = 450;
    private int winPosY = 200;

    private MyGameMap map;

    private JPanel gui;

    private JPanel guiNord;
    private JButton btnStartGame;
    private JButton btnExitGame;
    private JButton btnRestartGame;

    private JPanel guiPlayerActionsSOUTH;
    private JButton moveUp;
    private JButton moveDown;
    private JButton moveLeft;
    private JButton moveRight;
    private JButton moveLeftUp;
    private JButton moveRightUp;
    private JButton moveLeftDown;
    private JButton moveRightDown;
    private JButton pause;

    private JPanel gameInfo;
    private JLabel mapSizeInfo;
    private JLabel countEnemyInfo;
    private JLabel gameRoundInfo;

    private JPanel playerInfo;
    private JLabel playerHealthInfo;
    private JLabel playerStepsInfo;

    private JPanel actionsLog;
    private JLabel actionsLogInfo;

    private JScrollPane containerForGameLog;
    private JTextArea gameLog;

    MyGameWindow() {
        prepareWindow();

        map = new MyGameMap();

        prepareGui();
        prepareGuiNord();
        prepareGuiPlayerActionsSOUTH();

        add(gui, BorderLayout.EAST);
        add(guiNord, BorderLayout.NORTH);
        add(guiPlayerActionsSOUTH, BorderLayout.SOUTH);
        add(map);

        setVisible(true);
    }

    private void prepareWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(winPosX, winPosY);
        setSize(winWidth, winHeight);
        setTitle("GraphicApp Game");
        setResizable(false);
    }

    private void prepareGui() {
        gui = new JPanel();
        gui.setLayout(new GridLayout(3, 1));

        prepareGameInfo();
        preparePlayerInfo();
        prepareGameActionsLog();

        gui.add(gameInfo);
        gui.add(playerInfo);
        gui.add(actionsLog);

    }

    private void prepareGuiNord() {
        guiNord = new JPanel();
        guiNord.setLayout(new GridLayout(1, 3));

        btnStartGame = new JButton("Start Game!");
        btnExitGame = new JButton("Exit Game!");
        btnRestartGame = new JButton("Restart Game!");

        guiNord.add(btnStartGame);
        guiNord.add(btnExitGame);
        guiNord.add(btnRestartGame);
    }

    private void prepareGuiPlayerActionsSOUTH() {
        guiPlayerActionsSOUTH = new JPanel();
        guiPlayerActionsSOUTH.setLayout(new GridLayout(3, 3));

        moveLeftUp = new JButton("Left Up! >>>> 7");
        moveUp = new JButton(" Up! >>>> 8");
        moveRightUp = new JButton("Right Up! >>>> 9");
        moveLeft = new JButton("Left! >>>> 4");
        pause = new JButton("Pause! >>>> 5");
        moveRight = new JButton("Right! >>>> 6");
        moveLeftDown = new JButton("Left Down! >>>> 1");
        moveDown = new JButton("Down! >>>> 2");
        moveRightDown = new JButton("Right Down! >>>> 3");

        guiPlayerActionsSOUTH.add(moveLeftUp);
        guiPlayerActionsSOUTH.add(moveUp);
        guiPlayerActionsSOUTH.add(moveRightUp);
        guiPlayerActionsSOUTH.add(moveLeft);
        guiPlayerActionsSOUTH.add(pause);
        guiPlayerActionsSOUTH.add(moveRight);
        guiPlayerActionsSOUTH.add(moveLeftDown);
        guiPlayerActionsSOUTH.add(moveDown);
        guiPlayerActionsSOUTH.add(moveRightDown);
    }

    private void prepareGameInfo() {
        gameInfo = new JPanel();
        gameInfo.setLayout(new GridLayout(4, 1));
        gameInfo.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        gameRoundInfo = new JLabel("  Current Round: ");
        mapSizeInfo = new JLabel("  Current map size: ");
        countEnemyInfo = new JLabel("  Current enemy count: ");

        gameInfo.add(new JLabel("    == Game Info =="));
        gameInfo.add(gameRoundInfo);
        gameInfo.add(mapSizeInfo);
        gameInfo.add(countEnemyInfo);
    }

    private void preparePlayerInfo() {
        playerInfo = new JPanel();
        playerInfo.setLayout(new GridLayout(3, 1));
        playerInfo.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        playerHealthInfo = new JLabel("  Health: - ");
        playerStepsInfo = new JLabel("  Steps: -");

        playerInfo.add(new JLabel("    == Player Info =="));
        playerInfo.add(playerHealthInfo);
        playerInfo.add(playerStepsInfo);
    }

    private void prepareGameActionsLog() {
        actionsLog = new JPanel();
        actionsLog.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        actionsLogInfo = new JLabel("  == Actions Log ==");

        actionsLog.add(actionsLogInfo);
    }



}
