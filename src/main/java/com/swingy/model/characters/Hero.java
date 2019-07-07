package com.swingy.model.characters;

import com.swingy.model.artifacts.Armor;
import com.swingy.model.artifacts.Weapon;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public abstract class Hero extends Character {
    @NotNull
    private Weapon weapon;
    @NotNull
    private Armor armor;

    int level;
    int experience;
}
