package com.swingy.view;

import com.swingy.model.characters.Hero;

public interface WindowManager {
    void showSelectHero();
    void showNewHero();
    void showSelectMission(Hero hero);
}
