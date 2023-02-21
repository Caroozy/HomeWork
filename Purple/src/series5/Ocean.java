package series5;

import java.util.Arrays;

public class Ocean {
    private Fish[]entities;
    public Ocean(){
        this.entities=OceanFactory.init(100);
    }

    public Fish[] getEntities() {
        return entities;
    }

    public void setEntities(Fish[] entities) {
        this.entities = entities;
    }

    public int totalEntities(){
        return entities.length;
    }

    public int totalSharks(){
        int count =0;
        for (int i=0;i<entities.length;i++){
            if (entities[i].speed==120){count++;}
        }
        return count;
    }

    public int totalWhales(){
        int count =0;
        for (int i=0;i<entities.length;i++){
            if (entities[i].speed==90){count++;}
        }
        return count;
    }

    @Override
    public String toString() {
        return "Ocean{" +
                "entities=" + Arrays.toString(entities) +
                '}';
    }
    public void drawAll(){
        for (int i=0;i<entities.length;i++){
            entities[i].draw();
        }
    }
}
