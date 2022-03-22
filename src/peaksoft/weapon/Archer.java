package peaksoft.weapon;

public class Archer extends Hero <RangeWeapon>{
    private Wolf wolf;

    public Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("Garfil",9);
    }

    public class Wolf{
        private String name;
        private int damage;


        public Wolf(String name, int damage){
            this.name = name;
            this.damage = damage;
        }

    }
}
