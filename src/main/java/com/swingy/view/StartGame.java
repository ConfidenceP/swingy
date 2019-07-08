package com.swingy.view;

import com.swingy.model.characters.Hero;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartGame extends javax.swing.JFrame implements WindowManager {

    public StartGame() {
        initComponents();
    }

    private void initComponents() {
        JButton jButton = new javax.swing.JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jButton.setText("Select hero");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showSelectHero();
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(122, Short.MAX_VALUE)
                                .addComponent(jButton, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(142, Short.MAX_VALUE)
                                .addComponent(jButton)
                                .addGap(135, 135, 135))
        );
    }

    public void showSelectHero() {
        SelectHero selectHeroPane = new SelectHero(this);
        setContentPane(selectHeroPane);
        pack();
    }

    @Override
    public void showNewHero() {
        NewHero newHeroPanel = new NewHero(this);

        setContentPane(newHeroPanel);
        pack();
    }

    @Override
    public void showSelectMission(Hero hero) {
        PlayMission playMissionPanel = new PlayMission(this, hero);
        setContentPane(playMissionPanel);
        pack();
    }

    private void setContentPane(PlayMission playMissionPanel) {
    }

    private void setContentPane(NewHero newHeroPanel) {

    }

    private void setContentPane(SelectHero selectHeroPane) {
    }

    private javax.swing.JButton jButton;
}
