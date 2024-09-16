package advanced_coding.Example3;

public class Main {
    public static void main(String[] args) {

        Pistol pistol = new Pistol();

        pistol.loadBullet();
        pistol.loadBullet();
        pistol.loadBullet();
        pistol.loadBullet();

        System.out.println(pistol.getMagazineLoad());

        pistol.shot();
        pistol.shot();
        pistol.shot();
        pistol.shot();

        System.out.println(pistol.getMagazineLoad());

        pistol.loadBullet();
        pistol.loadBullet();
        pistol.shot();
        pistol.loadBullet();

        System.out.println(pistol.getMagazineLoad());



    }
}
