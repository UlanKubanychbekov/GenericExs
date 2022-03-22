package peaksoft.weapon;

import peaksoft.weapon.RangeWeapon;

public class Bow implements RangeWeapon {
    @Override
    public int getDamage() {
        return 15;
    }
}
