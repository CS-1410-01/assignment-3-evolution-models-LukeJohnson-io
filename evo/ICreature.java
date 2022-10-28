package evo;

import java.util.ArrayList;

public interface ICreature {
    void die();
    ArrayList<ICreature> reproduce();
}
