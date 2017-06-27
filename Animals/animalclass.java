import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Valentin on 27.06.2017.
 */
public class animalclass {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Animal[] animalM1 = { new Animal("Cat"), new Animal("Dog"), new Animal("Elephant"),
                new Animal("Cock"), new Animal("Bull"), new Animal("Ant"),
                new Animal("Tentecles"), new Animal("Worm")};
        ByteArrayOutputStream bai = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bai);
        oos.writeInt(animalM1.length);
        for (int i = 0; i < animalM1.length; i++) {
            oos.writeObject(animalM1[i]);
        }
        oos.flush();
        oos.close();
        int i=0;
        Animal[] animalM2 = deserializeAnimalArray(bai.toByteArray());
        String[] name=new String[animalM2.length];
        for(Animal a:animalM2){
            name[i]=a.name;
            i++;
        }
        System.out.println(Arrays.toString(animalM1));
        System.out.println(Arrays.toString(name));
    }
    public static Animal[] deserializeAnimalArray(byte[] data) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream;
        try {
            inputStream = new ObjectInputStream(new ByteArrayInputStream(data));
        }catch (Exception e){
            throw new IllegalArgumentException();
        }

        int a;
        int i=0;

        try {
            a = inputStream.readInt();
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        Animal[] animals=new Animal[a];
        while (a!=0){
            try {
                animals[i]= (Animal) inputStream.readObject();
            }catch (Exception e){
                throw new IllegalArgumentException();
            }

            i++;
            a--;
        }

        return animals;

    }
}
