package purple.ex5;

import java.util.Arrays;

/**
 * Created by kobis on 23 Dec, 2022
 */
public class Ocean {

    private Fish[] entities;

    public Ocean() {
        Fish[] entities = OceanFactory.init(100);

        this.entities = entities;
    }


    public int totalEntities() {
        return entities.length;
    }

    public int totalSharks() {
        int count = 0;
        for (int i = 0; i < entities.length; i++) {
            if (entities[i] instanceof Shark) {
                count++;
            }
        }
        return count;
    }

    public int totalWhales() {
        int count = 0;
        for (int i = 0; i < entities.length; i++) {
            if (entities[i] instanceof Whale) {
                count++;
            }
        }
        return count;
    }

    public Fish[] getEntities() {
        return entities;
    }

    public void setEntities(Fish[] entities) {
        this.entities = entities;
    }

    @Override
    public String toString() {
        return "Ocean{" +
                "entities=" + Arrays.toString(entities) +
                '}';
    }


    public void drawAll() {
        for (Fish fish : entities) {
            fish.draw();
        }
    }
}
