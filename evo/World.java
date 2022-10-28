package evo;

import java.util.ArrayList;

public class World implements ICreature {
    
    ArrayList<ICreature> creatures = new ArrayList<ICreature>();
    double netGrowth;
    double birthRate;
    double deathRate;
    int maxGenerations = 50;
    int currentGeneration;
    boolean help;

    public World() {

    }

    public void die() {

    }

    public ArrayList<ICreature> reproduce() {
        ArrayList<ICreature> nc = new ArrayList<ICreature>();
        for (int i=0; i<creatures.size(); i++) {
            nc.add(createCreature());
        }
        return nc;
    }

    /**
     * while naive, this is intended to give the idea of a recursive generational structure
     * @return world
     */
    ICreature createCreature() {
        World world = new World();
        return world;
    }

    void generation(int cycleseed) {
        // append reproduce to creatures
        reproduce();
        for (int i=0; i<deathRate; i++) {
            die();
        }
    }

}
