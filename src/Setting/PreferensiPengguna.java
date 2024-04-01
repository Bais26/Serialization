package Setting;
import java.io.*;

/**
 *
 * @author bass
 */
public class PreferensiPengguna implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private int umur;
    private String tema;

    public PreferensiPengguna(String username, String password, int umur, String tema) {
        this.username = username;
        this.password = password;
        this.umur = umur;
        this.tema = tema;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getUmur() {
        return umur;
    }

    public String getTema() {
        return tema;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }

    public static void main(String[] args) {
        PreferensiPengguna preferensiPengguna = new PreferensiPengguna("username", "password", 25, "Light");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("preferensiPengguna.ser"))) {
            oos.writeObject(preferensiPengguna);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("preferensiPengguna.ser"))) {
            PreferensiPengguna loadedPreferensiPengguna = (PreferensiPengguna) ois.readObject();
            System.out.println(loadedPreferensiPengguna.getUsername());
            System.out.println(loadedPreferensiPengguna.getPassword());
            System.out.println(loadedPreferensiPengguna.getUmur());
            System.out.println(loadedPreferensiPengguna.getTema());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

